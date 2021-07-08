package com.AutoHandel.model;

import com.AutoHandel.user.Player;

import java.util.List;

public interface MechanicsInterface {

    public void repairDamagedComponent(List<Car> carList, int index, Player player);
}
