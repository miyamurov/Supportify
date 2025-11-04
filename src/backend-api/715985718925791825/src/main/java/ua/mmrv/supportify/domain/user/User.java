package ua.mmrv.supportify.domain.user;

import lombok.Data;

@Data
public class User {
    private String firstName_;
    private String lastName_;
    private String email_;
    private int role_;
}
