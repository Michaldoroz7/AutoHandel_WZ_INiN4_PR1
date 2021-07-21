package com.AutoHandel.model;


import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class Truck extends Vehicle{

    private int cargoSpace;


}
