package com.AutoHandel.repository;

import com.AutoHandel.model.Car;
import com.AutoHandel.model.CarStatus;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {

    private static List<Car> carList = new ArrayList<>();

    public static void addCarList(List<Car> newCarList) {
        carList.addAll(newCarList);
    }

    public static void showCarList() {

        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getCarStatus() == CarStatus.valueOf("FORSALE")) {
                System.out.println("ID: " + i);
                System.out.println("Producent: " + carList.get(i).getProducent());
                System.out.println("Color: " + carList.get(i).getColor());
                System.out.println("Mileage: " + carList.get(i).getMileage());
                System.out.println("Segment: " + carList.get(i).getSegment());
                System.out.println("Vehicle Type: " + carList.get(i).getVehicleType());
                System.out.println("Car status " + carList.get(i).getCarStatus());
                for (int j = 0; j < carList.get(i).getComponentInfoList().size(); j++) {
                    System.out.println("Component: " + carList.get(i).getComponentInfoList().get(j).getComponent() +
                            " Status: " + carList.get(i).getComponentInfoList().get(j).getIsUnbroken());
                }
                System.out.println("-----------------------");
            }
        }
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

    public static List<Car> getCarList() {
        return carList;
    }


}
