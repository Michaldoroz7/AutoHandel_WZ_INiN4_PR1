package com.AutoHandel.service;

import com.AutoHandel.model.Car;
import com.AutoHandel.model.ComponentInfo;
import com.AutoHandel.model.MechanicsInterface;
import com.AutoHandel.user.Player;

import java.util.List;
import java.util.Random;

public class AdrianService implements MechanicsInterface {

    @Override
    public void repairDamagedComponent(Car car, Player player) {

        Random random = new Random();
        int chance = random.nextInt(100);
        int randomComponent = random.nextInt(5);
        List<ComponentInfo> componentList = car.getComponentInfoList();

        if (chance <= 20) {
            System.out.println("Adrian: cant repair your car");
            if (chance <= 2){
                componentList.get(randomComponent).setIsUnbroken(false);
            }
        } else {

            componentList.forEach(element -> {
                if (element.getIsUnbroken()) {
                    element.setIsUnbroken(false);
                    player.setBudget(player.getBudget() - 2000);
                    car.setPrice(car.getPrice() * element.getComponent().getCarValueIncrease());
                }
            });

            System.out.println("Adrian: FIXED!");
        }
    }
}

