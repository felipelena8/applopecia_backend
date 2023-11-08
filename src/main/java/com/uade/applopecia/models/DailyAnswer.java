package com.uade.applopecia.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class DailyAnswer extends Answer {
    private LocalDateTime issuanceDate;
    private EmotionalStatus emotionalStatus;
    private Integer energyStatus;
    private Double hoursOfSleep;
}
