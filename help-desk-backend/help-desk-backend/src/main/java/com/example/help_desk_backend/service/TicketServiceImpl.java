package com.example.help_desk_backend.service;

import com.example.help_desk_backend.entity.Ticket;
import com.example.help_desk_backend.repository.TicketRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;

    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Ticket createTicket(Ticket ticket) {
        ticket.setId(null);
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket getTicketById(Long id) {
        return ticketRepository.findById(id).orElseThrow(() -> new RuntimeException("Ticket not found"));
    }

    @Override
    public Ticket getTicketByEmail(String username) {
        return ticketRepository.findByEmail(username).orElseThrow(() -> new RuntimeException("Ticket not found"));
    }

    @Override
    public Ticket updateTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}
