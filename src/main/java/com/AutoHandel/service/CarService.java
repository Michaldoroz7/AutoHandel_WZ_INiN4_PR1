package com.AutoHandel.service;

import com.AutoHandel.model.Car;
import com.AutoHandel.model.CarStatus;
import com.AutoHandel.repository.CarRepository;
import com.AutoHandel.user.Client;
import com.AutoHandel.user.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.AutoHandel.model.CarStatus.OWNEDBYPLAYER;
import static com.AutoHandel.model.CarStatus.SOLDTOCLIENT;

public class CarService {

    public static void addCarListToRepository(List<Car> carList) {

        CarRepository.addCarList(carList);
    }

    public static void showCarsFromList() {

        List<Car> carList = CarRepository.getCarList();

        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getCarStatus() == CarStatus.valueOf("FORSALE")) {
                System.out.println("ID: " + i);
                System.out.println("Producent: " + carList.get(i).getProducent());
                System.out.println("Price: " + carList.get(i).getPrice());
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

    public static void BuyCarFromList(int index, Double budget, Player player) {

        if (CarRepository.getCar(index).getCarStatus() == CarStatus.valueOf("FORSALE") && CarRepository.getCar(index).getPrice() < budget) {
            CarRepository.getCar(index).setCarStatus(OWNEDBYPLAYER);
            player.setBudget(budget - CarRepository.getCar(index).getPrice());
        } else {
            System.out.println("You cant do it bro");
        }

    }

    public static List<Car> getBoughtCarList() {
        List<Car> carList = CarRepository.getCarList();
        List<Car> boughtCarList = new ArrayList<>();

        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getCarStatus() == CarStatus.valueOf("OWNEDBYPLAYER")) {
                boughtCarList.add(carList.get(i));
            }
        }
        return boughtCarList;
    }

    public static void showBoughtCars(List<Car> boughtCarList) {

        for (int i = 0; i < boughtCarList.size(); i++) {
            System.out.println("ID: " + i);
            System.out.println("Price: " + boughtCarList.get(i).getPrice());
            System.out.println("Producent: " + boughtCarList.get(i).getProducent());
            System.out.println("Color: " + boughtCarList.get(i).getColor());
            System.out.println("Mileage: " + boughtCarList.get(i).getMileage());
            System.out.println("Segment: " + boughtCarList.get(i).getSegment());
            System.out.println("Vehicle Type: " + boughtCarList.get(i).getVehicleType());
            System.out.println("Car status: " + boughtCarList.get(i).getCarStatus());
            for (int j = 0; j < boughtCarList.get(i).getComponentInfoList().size(); j++) {
                System.out.println("Component: " + boughtCarList.get(i).getComponentInfoList().get(j).getComponent() +
                        " Status: " + boughtCarList.get(i).getComponentInfoList().get(j).getIsUnbroken());
            }
            System.out.println("-----------------------");
        }
    }

    public static void sellOwnedCar(List<Car> boughtCarList, Player player) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Select which car you want to sell");
        showBoughtCars(boughtCarList);
        int chosenCar = sc.nextInt();
        List<Client> specificClient = ClientService.getSpecificClient(ClientService.getClientList(), boughtCarList.get(chosenCar).getProducent(), boughtCarList.get(chosenCar).getVehicleType());

        if (specificClient.size() > 0) {


            Car carForSale = boughtCarList.get(chosenCar);

            System.out.println("Select for which client you want to sell car");
            ClientService.showSpecificClientList(specificClient);
            int chosenClient = sc.nextInt();
            Client potentialClient = specificClient.get(chosenClient);
            potentialClient.setBudget(potentialClient.getBudget() - carForSale.getPrice());
            player.setBudget(player.getBudget() + carForSale.getPrice());
            System.out.println("Car SOLD!");

            carForSale.setCarStatus(SOLDTOCLIENT);

        } else {
            System.out.println("There is no client who want car like yours");
        }


    }


}
