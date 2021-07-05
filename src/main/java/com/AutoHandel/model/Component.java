package com.AutoHandel.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Component {
    BODY(1.5),
    ENGINE(2.0),
    GEARBOX(1.5),
    SUSPENSION(1.2),
    BRAKES(1.1);

    private final Double carValueIncrease;
}
