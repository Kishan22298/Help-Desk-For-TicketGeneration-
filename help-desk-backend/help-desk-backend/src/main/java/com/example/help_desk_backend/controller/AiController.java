package com.example.help_desk_backend.controller;

import com.example.help_desk_backend.service.AiService;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/ai")
@CrossOrigin(origins = "http://localhost:5173")
public class AiController {

    private AiService aiService;

    public AiController(AiService aiService) {
        this.aiService = aiService;
    }

    @PostMapping("/response")
    public ResponseEntity<String> getAiResponse(@RequestBody String query, @RequestHeader("conversationId") String conversationId) {
        return ResponseEntity.ok(aiService.getAiResponse(query, conversationId));
    }

    @PostMapping("/stream-response")
    public Flux<String> streamGetAiResponse(@RequestBody String query, @RequestHeader("conversation-id") String conversationId) {
        return aiService.streamGetAiResponse(query, conversationId);
    }
}
