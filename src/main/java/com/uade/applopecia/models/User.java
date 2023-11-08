package com.uade.applopecia.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public abstract class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Boolean active;
}
