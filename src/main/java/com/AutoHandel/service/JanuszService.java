package com.AutoHandel.service;

import com.AutoHandel.model.Car;
import com.AutoHandel.model.MechanicsInterface;
import com.AutoHandel.user.Player;

public class JanuszService implements MechanicsInterface {

    @Override
    public void repairDamagedComponent(Car car, Player player){

        car.getComponentInfoList().forEach(element -> {
            if (element.getIsUnbroken()) {
                element.setIsUnbroken(false);
                player.setBudget(player.getBudget() - 10000);
                car.setPrice(car.getPrice() * element.getComponent().getCarValueIncrease());
            }
        });


        System.out.println("Janusz: FIXED!");
    }


}
