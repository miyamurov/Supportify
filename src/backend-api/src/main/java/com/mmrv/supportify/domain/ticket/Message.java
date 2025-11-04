package com.mmrv.supportify.domain.ticket;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Message {
    @Id
    private Long id;
    private String text;
    private LocalDateTime dateTime;
}
