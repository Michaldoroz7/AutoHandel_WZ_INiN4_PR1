package com.AutoHandel.service;

import com.AutoHandel.model.Car;
import com.AutoHandel.model.CarStatus;
import com.AutoHandel.repository.CarRepository;
import com.AutoHandel.user.Player;

import java.util.ArrayList;
import java.util.List;

import static com.AutoHandel.model.CarStatus.OWNEDBYPLAYER;

public class CarService {

    public static void addCarListToRepository(List<Car> carList) {

        CarRepository.addCarList(carList);
    }

    public static void showCarsFromList() {
        CarRepository.showCarList();
    }

    public static void BuyCarFromList(int index, Double budget, Player player) {

        if (CarRepository.getCar(index).getCarStatus() == CarStatus.valueOf("FORSALE") && CarRepository.getCar(index).getPrice() < budget) {
            CarRepository.getCar(index).setCarStatus(OWNEDBYPLAYER);
            player.setBudget(budget - CarRepository.getCar(index).getPrice());
        } else {
            System.out.println("You cant do it bro");
        }

    }

    public static List<Car> getBoughtCarList(){
        List<Car> carList = CarRepository.getCarList();
        List<Car> boughtCarList = new ArrayList<>();

        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getCarStatus() == CarStatus.valueOf("OWNEDBYPLAYER")) {
                boughtCarList.add(carList.get(i));
            }
        }
        return boughtCarList;
    }

    public static void ShowBoughtCars(List<Car> boughtCarList) {

        for (int i = 0; i < boughtCarList.size(); i++) {
            System.out.println("ID: " + i);
            System.out.println("Price: " + boughtCarList.get(i).getPrice());
            System.out.println("Producent: " + boughtCarList.get(i).getProducent());
            System.out.println("Color: " + boughtCarList.get(i).getColor());
            System.out.println("Mileage: " + boughtCarList.get(i).getMileage());
            System.out.println("Segment: " + boughtCarList.get(i).getSegment());
            System.out.println("Vehicle Type: "  + boughtCarList.get(i).getVehicleType());
            System.out.println("Car status: "  + boughtCarList.get(i).getCarStatus());
            for (int j = 0; j < boughtCarList.get(i).getComponentInfoList().size(); j++) {
                System.out.println("Component: " + boughtCarList.get(i).getComponentInfoList().get(j).getComponent() +
                        " Status: " + boughtCarList.get(i).getComponentInfoList().get(j).getIsUnbroken());
            }
            System.out.println("-----------------------");
        }
    }


}
