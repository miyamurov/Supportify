package com.mmrv.supportify.domain.ticket;

import com.mmrv.supportify.domain.ticket.enums.TicketStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Ticket {
    @Id
    private Long id;
    private TicketStatus ticketStatus;
    private UUID authorId;
    private UUID responsibleSupportId;
}