package com.AutoHandel.service;

import com.AutoHandel.user.Client;
import com.AutoHandel.user.Player;

import java.util.List;
import java.util.Random;

public class AdvertisementService {

    public static void buyNewspaperAd(Player player, List<Client> clientList) {
        Double newspaperAdCost = 1000.0;

        Random random = new Random();
        int newClientAmount = random.nextInt(4);

        if (player.getBudget() > newspaperAdCost) {
            player.setBudget(player.getBudget() - newspaperAdCost);
            System.out.println("Newspaper AD bought!");
            for (int i = 1; i <= newClientAmount; i++) {
                clientList.add(ClientGenerator.generateClient());
            }
        } else {
            System.out.println("You dont have money");
            System.out.println("Comeback when you will be rich :D");
        }
    }

    public static void buyInternetAd(Player player, List<Client> clientList) {
        Double internetAdCost = 500.0;

        if (player.getBudget() > internetAdCost) {
            player.setBudget(player.getBudget() - internetAdCost);
            clientList.add(ClientGenerator.generateClient());
            System.out.println("Internet AD bought!");
        } else {
            System.out.println("You dont have money");
            System.out.println("Comeback when you will be rich :D");
        }
        }
    }