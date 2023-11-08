package com.uade.applopecia.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class ReportResult {
    private Integer id;
    private Patient patient;
    private String reportBase;
    private LocalDateTime creationDate;

}
