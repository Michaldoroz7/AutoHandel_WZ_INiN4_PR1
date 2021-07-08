package com.AutoHandel.service;

import com.AutoHandel.model.Car;
import com.AutoHandel.model.ComponentInfo;
import com.AutoHandel.model.MechanicsInterface;
import com.AutoHandel.user.Player;

import java.util.ArrayList;
import java.util.List;

public class JanuszService implements MechanicsInterface {


    public static void repairDamagedComponent(List<Car> carList, int index, Player player){
        List<ComponentInfo> componentList = new ArrayList<>();


        for (int i = 0; i < carList.get(index).getComponentInfoList().size(); i++){
            componentList.add(carList.get(index).getComponentInfoList().get(i));
        }

        for (int i = 0; i < componentList.size(); i++){
            if (componentList.get(i).getIsUnbroken()) {
                componentList.get(i).setIsUnbroken(false);
                player.setBudget(player.getBudget() - 10000);
                carList.get(index).setPrice(carList.get(index).getPrice() * componentList.get(i).getComponent().getCarValueIncrease());
            }
        }

    }


}
