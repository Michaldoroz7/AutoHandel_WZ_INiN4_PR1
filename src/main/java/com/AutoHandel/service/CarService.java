package com.AutoHandel.service;

import com.AutoHandel.model.Car;
import com.AutoHandel.repository.CarRepository;

import java.util.List;

public class CarService {

    public static void addCarListToRepository(List<Car> carList){

        CarRepository.addCarList(carList);
    }

    public static void showCarsFromList(){
        CarRepository.showCarList();
    }


}
