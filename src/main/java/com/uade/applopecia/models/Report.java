package com.uade.applopecia.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Report {
    private Integer id;
    private User user;
    private List<String> imagesUrl;
    private LocalDateTime issuanceDate;
    private EmotionalStatus emotionalStatus;
    private Integer energyStatus;
    private Double hoursOfSleep;
    private HairLossParameter hairLoss;
    private HairDensityParameter hairDensity;

}
