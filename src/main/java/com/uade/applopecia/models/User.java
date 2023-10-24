package com.uade.applopecia.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Double weight;
    private Double height;
    private LocalDateTime birthDate;
    private Gender gender;
    private Boolean active;
}
