package com.uade.applopecia.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class Patient extends User{
    private PatientSpecifications specifications;
}
