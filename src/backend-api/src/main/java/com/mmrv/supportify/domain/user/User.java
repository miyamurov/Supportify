package com.mmrv.supportify.domain.user;

import com.mmrv.supportify.domain.user.enums.SupportRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class User {
    @Id
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private SupportRole role;
    private boolean isBanned;
}