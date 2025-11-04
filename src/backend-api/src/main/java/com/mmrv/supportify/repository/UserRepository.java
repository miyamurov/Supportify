package com.mmrv.supportify.repository;

import com.mmrv.supportify.domain.user.User;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, Long> {
    // TODO
    User createUser(@NotNull String firstName, String lastName, @NotNull String email);

    Optional<User> findByUsername(String username);
    Optional<User> findById(UUID id);
}
