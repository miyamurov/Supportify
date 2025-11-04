package com.mmrv.supportify.repository;

import com.mmrv.supportify.domain.ticket.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, id> {
}
