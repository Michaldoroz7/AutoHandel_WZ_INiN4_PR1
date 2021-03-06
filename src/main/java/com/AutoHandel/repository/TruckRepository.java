package com.AutoHandel.repository;

import com.AutoHandel.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository {

    private static List<Truck> truckList = new ArrayList<>();

    public static void addTruckList(List<Truck> newTruckList) {
        truckList.addAll(newTruckList);
    }

    public static Truck getTruck(int index) {
        return truckList.get(index);
    }

    public static List<Truck> getTruckList() {
        return truckList;
    }

}
