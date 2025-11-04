package com.mmrv.supportify.domain.audit;

import com.mmrv.supportify.domain.audit.enums.ActivityType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class AuditLog {
    @Id
    private Long id;
    private ActivityType activityType;
    private String textActivity;
    private LocalDateTime dateTime;
}
