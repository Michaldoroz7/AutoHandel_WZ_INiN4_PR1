package com.AutoHandel.service;

import com.AutoHandel.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VehicleGenerator {

    public static Car generateCar() {
        return Car.builder()
                .price(generatePrice())
                .producent(generateProducent())
                .mileage(generateMileage())
                .color(generateColor())
                .segment(generateSegment())
                .componentInfoList(ComponentInfoListGenerator.generate())
                .vehicleType(VehicleType.CAR)
                .vehicleStatus(VehicleStatus.FORSALE)
                .build();
    }

    public static Truck generateTruck(){
        return Truck.builder()
                .price(generatePrice())
                .producent(generateProducent())
                .mileage(generateMileage())
                .color(generateColor())
                .componentInfoList(ComponentInfoListGenerator.generate())
                .vehicleType(VehicleType.TRUCK)
                .vehicleStatus(VehicleStatus.FORSALE)
                .build();
    }

    public static List<Car> generateCarList(int amount) {
        List<Car> carList = new ArrayList<>();
        for(int i = 1; i <= amount; i++){
            carList.add(generateCar());
        }
        return carList;
    }

    private static Producent generateProducent() {
        return Producent.randomProducent();
    }

    private static Double generatePrice() {
        Double min = 1000.0;
        Double max = 10000.0;
        Double random = new Random().nextDouble();

        return min + (random * (max - min));
    }

    private static Double generateMileage() {
        Double min = 0.0;
        Double max = 100000.0;
        Double random = new Random().nextDouble();

        return min + (random * (max - min));

    }

    private static Color generateColor() {
        return Color.randomColor();
    }

    private static Segment generateSegment() {
        return Segment.randomSegment();
    }


}
