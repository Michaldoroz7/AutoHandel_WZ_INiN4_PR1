package com.AutoHandel.service;

import com.AutoHandel.user.Player;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Menu {

    Scanner sc = new Scanner(System.in);

    public void setupMenu(Player player) throws InterruptedException {

        System.out.println("Welcome in AutoHandel Game");
        System.out.println("[-------------------------]");

        System.out.println("SELECT DIFFICULT LEVEL:");
        System.out.println("4. EASY ");
        System.out.println("8. MEDIUM ");
        System.out.println("12. HARD ");

        int listSize = sc.nextInt();
        CarService.addCarListToRepository(CarGenerator.generateCarList(listSize));
        ClientService.addClientListToRepository(ClientGenerator.generateClientList(listSize));


        System.out.print("[ ");
        for (int i = 1; i <= 10; i++) {
            System.out.print("...");
            TimeUnit.MILLISECONDS.sleep(123);
            System.out.print("...");
        }
        System.out.println(" ]");
        System.out.println("[Setup complete]");
        System.out.println("");

        System.out.println("Choose what you wanna do now");
        System.out.println("1. Start Game (move to game menu)");
        System.out.println("2. Stop (bYE bYE)");

        int choose2 = sc.nextInt();

        switch (choose2) {
            case 1:
                gameMenu(player);
            case 2:
                break;
        }


    }

    private void gameMenu(Player player) {

        JanuszService januszService = new JanuszService();
        MarianService marianService = new MarianService();

        System.out.println("Welcome in Game Menu");
        System.out.println("---------------");
        int menuChoose = 0;

        while (menuChoose != 9) {

            System.out.println("");
            System.out.println("");
            System.out.println("Choose what you want to do");
            System.out.println("1. Check Cars for sale");
            System.out.println("2. Buy a car (You will need car index to do this");
            System.out.println("3. Check bought cars");
            System.out.println("4. Repair car");
            System.out.println("5. Check clients list");
            System.out.println("6. Sell car for specified price");
            System.out.println("7. Check your Budget");
            System.out.println("");
            System.out.println("9. Exit game");

            menuChoose = sc.nextInt();


            switch (menuChoose) {
                case 1:
                    CarService.showCarsFromList();
                    break;
                case 2:

                    CarService.showCarsFromList();
                    System.out.println("Choose which car you want to buy (index)");
                    int chosenCar = sc.nextInt();
                    CarService.BuyCarFromList(chosenCar, player.getBudget(), player);
                    break;

                case 3:
                    CarService.ShowBoughtCars();
                    break;

                case 4:
                    CarService.ShowBoughtCars();
                    System.out.println("Select which car you want to repair");
                    int index = sc.nextInt();
                    System.out.println("Select which Mechanic should repair your car");
                    System.out.println("1. Janusz (Most expensive, 100% repaired)");
                    System.out.println("2. Marian (Middle one, 10% to let Janusz repair)");
                    System.out.println("");
                    int mechanicChoose = sc.nextInt();

                    if (mechanicChoose == 1) {
                        januszService.repairDamagedComponent(CarService.getBoughtCarList(), index, player);
                        break;
                    } else if (mechanicChoose == 2) {
                        marianService.repairDamagedComponent(CarService.getBoughtCarList(), index, player);
                        break;
                    }
                    break;
                case 5:
                    ClientService.showClientList();
                    break;

                case 7:
                    System.out.println("Your budget is: " + player.getBudget());
                    break;

            }
        }

    }
}
