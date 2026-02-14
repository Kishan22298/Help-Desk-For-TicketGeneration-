package com.example.help_desk_backend.service;

import com.example.help_desk_backend.tools.EmailTool;
import com.example.help_desk_backend.tools.TicketDatabaseTool;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor

public class AiService {

    private final ChatClient chatClient;
    private final TicketDatabaseTool ticketDatabaseTool;
    private final EmailTool emailTool;

    @Value("classpath:/helpdesk-system.st")
    private Resource resource;

    public String getAiResponse(String query, String conversationId) {
        return chatClient
                .prompt()
                .advisors(advisorSpec -> advisorSpec.param(ChatMemory.CONVERSATION_ID, conversationId))
                .tools(ticketDatabaseTool, emailTool)
                .system(resource)
                .user(query)
                .call()
                .content();
    }

    public Flux<String> streamGetAiResponse(String query, String conversationId) {
        return chatClient.prompt()
                .advisors(advisorSpec -> advisorSpec.param(ChatMemory.CONVERSATION_ID, conversationId))
                .tools(ticketDatabaseTool, emailTool)
                .system(resource)
                .user(query)
                .stream()
                .content();
    }
}
