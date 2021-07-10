package com.AutoHandel.model;


import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Getter
@Setter
@SuperBuilder
abstract class Vehicle {

    private Double price;
    private Producent producent;
    private double mileage;
    private Color color;
    private Segment segment;
    private List<ComponentInfo> componentInfoList;
    private VehicleType vehicleType;
    private CarStatus carStatus;



}