package com.uade.applopecia.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public abstract class Answer {
    private Integer id;
    private Patient patient;
}
