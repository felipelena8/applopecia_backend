package com.uade.applopecia.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BiweeklyAnswer extends Answer {
    private HairDensityParameter hairDensity;
    private HairLossParameter hairLoss;
}
