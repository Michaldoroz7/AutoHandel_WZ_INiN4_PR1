package com.AutoHandel.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum VehicleType {
    Car,
    Truck;

    private static final List<VehicleType> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static VehicleType randomVehicleType() {

        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
