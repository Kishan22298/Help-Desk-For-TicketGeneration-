package com.example.help_desk_backend.repository;

import com.example.help_desk_backend.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    Optional<Ticket> findByEmail(String email);
}
