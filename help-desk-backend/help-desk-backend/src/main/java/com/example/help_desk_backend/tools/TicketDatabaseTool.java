package com.example.help_desk_backend.tools;

import com.example.help_desk_backend.entity.Ticket;
import com.example.help_desk_backend.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TicketDatabaseTool {

    private final TicketService ticketService;

    public TicketDatabaseTool(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @Tool(description = "Create a new ticket in the help desk system database")
    public Ticket createTicketTool(@ToolParam(description = "Tickets details") Ticket ticket) {
        return ticketService.createTicket(ticket);
    }

    @Tool(description = "Get a ticket by its username from the help desk system database")
    public Ticket getTicketByEmailTool(@ToolParam(description = "Ticket username") String username) {
        return ticketService.getTicketByEmail(username);
    }

    @Tool(description = "Update an existing ticket in the help desk system database")
    public Ticket updateTicketTool(@ToolParam(description = "Updated ticket details") Ticket ticket) {
        return ticketService.updateTicket(ticket);
    }

    @Tool(description = "To get current system time")
    public String getCurrentSystemTime() {
        return LocalDateTime.now().toString();
    }
}
