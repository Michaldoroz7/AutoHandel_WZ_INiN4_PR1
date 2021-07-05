package com.AutoHandel.repository;

import com.AutoHandel.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {

    private static List<Car> carList = new ArrayList<>();

    public static void addCarList(List<Car> newCarList) {
        carList.addAll(newCarList);
    }

    public static Car getCar(int index) {
        return carList.get(index);
    }

    public static void saveCar(Car car) {
        carList.add(car);
    }

    public static void deleteCar(int index) {
        carList.remove(index);
    }
}
