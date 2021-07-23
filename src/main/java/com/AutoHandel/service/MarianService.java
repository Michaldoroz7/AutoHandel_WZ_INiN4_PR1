package com.AutoHandel.service;

import com.AutoHandel.model.Car;
import com.AutoHandel.model.ComponentInfo;
import com.AutoHandel.model.MechanicsInterface;
import com.AutoHandel.user.Player;

import java.util.List;
import java.util.Random;

public class MarianService implements MechanicsInterface {
    JanuszService januszService = new JanuszService();

    @Override
    public void repairDamagedComponent(Car car, Player player) {

        Random random = new Random();
        int chance = random.nextInt(10);
        List<ComponentInfo> componentList = car.getComponentInfoList();

        if (chance == 1) {
            System.out.println("Marian: I cant repair your car, Janusz will do it");
            januszService.repairDamagedComponent(car, player);
        } else {
            componentList.forEach(element -> {
                if (element.getIsUnbroken()) {
                    element.setIsUnbroken(false);
                    player.setBudget(player.getBudget() - 6000);
                    car.setPrice(car.getPrice() * element.getComponent().getCarValueIncrease());
                }
            });

            System.out.println("Marian: FIXED!");
        }
    }
}

