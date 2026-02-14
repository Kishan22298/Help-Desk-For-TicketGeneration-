package com.example.help_desk_backend.service;

import com.example.help_desk_backend.entity.Ticket;

public interface TicketService {
    Ticket createTicket(Ticket ticket);
    Ticket getTicketById(Long id);
    Ticket getTicketByEmail(String email);
    Ticket updateTicket(Ticket ticket);
}
