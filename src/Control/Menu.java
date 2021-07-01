package Control;

import Person.Player;

import java.util.Random;
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


        System.out.print("[ ");
        for(int i = 1; i <= 10; i++){
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
                menu(player);
            case 2:
                break;
        }


    }

    private void menu(Player player) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What you wanna do ?!");
        System.out.println("1. Check your budget");
        System.out.println("2. Check your cars (WIP)");
        System.out.println("3. Check car for buy (WIP)");
        System.out.println("4. Repair your car (WIP)");
        System.out.println("5. Check Client List (WIP)");
        System.out.println("6. Sell your car (WIP)");
        System.out.println("7. Buy advertisement (WIP)");
        System.out.println("8. Print history of your transactions (WIP)");
        System.out.println("9. Print history of repairs (WIP)");

        int choose = sc.nextInt();


        switch (choose){

            case 1:
                System.out.println(player.getBudget());
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
    }
}
