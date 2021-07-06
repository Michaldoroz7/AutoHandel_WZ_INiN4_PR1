package com.AutoHandel.service;

import com.AutoHandel.user.Player;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Menu {


    public void setupMenu(Player player) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First name");
        String firstName = sc.next();
        player.setFirstName(firstName);

        System.out.println("Enter your Last name");
        String lastName = sc.next();
        player.setLastName(lastName);

        System.out.println("Enter your budget (if you will set high number, prices will be also high :)");
        Double budget = sc.nextDouble();
        player.setBudget(budget);

        System.out.println("Select how large is Car Buy list");
        int carListSize = sc.nextInt();

        //CAR BUILDING AND LIST TEST
        CarService.addCarListToRepository(CarGenerator.generateCarList(carListSize));

        CarService.showCarsFromList();



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

        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                gameMenu(player);
            case 2:
                break;
        }


    }

    private void gameMenu(Player player) {

    }
}
