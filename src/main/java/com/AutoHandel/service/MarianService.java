package com.AutoHandel.service;

import com.AutoHandel.model.Car;
import com.AutoHandel.model.ComponentInfo;
import com.AutoHandel.model.MechanicsInterface;
import com.AutoHandel.user.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MarianService implements MechanicsInterface {

    JanuszService januszService = new JanuszService();


    @Override
    public void repairDamagedComponent(List<Car> carList, int index, Player player) {

        Random random = new Random();
        int chance = random.nextInt(10);

        List<ComponentInfo> componentList = new ArrayList<>();


        for (int i = 0; i < carList.get(index).getComponentInfoList().size(); i++) {
            componentList.add(carList.get(index).getComponentInfoList().get(i));
        }

        if (chance == 1){
            System.out.println("Marian cant repair your car, Janusz will do it");
            januszService.repairDamagedComponent(carList, index, player);
        }
        for (int i = 0; i < componentList.size(); i++) {
            if (componentList.get(i).getIsUnbroken()) {
                componentList.get(i).setIsUnbroken(false);
                player.setBudget(player.getBudget() - 6000);
                carList.get(index).setPrice(carList.get(index).getPrice() * componentList.get(i).getComponent().getCarValueIncrease());
            }
        }

    }
}

