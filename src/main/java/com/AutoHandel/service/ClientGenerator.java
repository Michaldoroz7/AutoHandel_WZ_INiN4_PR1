package com.AutoHandel.service;

import com.AutoHandel.model.Producent;
import com.AutoHandel.model.VehicleType;
import com.AutoHandel.user.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClientGenerator {

    public static Client generateClient(){
        return Client.builder()
                .budget(generateBudget())
                .preferableProducent(generateProducent())
                .damagedAccept(generateBoolean())
                .preferableVehicleType(generateVehicleType())
                .build();
    }

    public static List<Client> generateClientList(int amount) {
        List<Client> clientList = new ArrayList<>();
        for (int i = 1; i <= amount; i++){
            clientList.add(generateClient());
        }
        return clientList;
    }

    public static Double generateBudget(){
        Double min = 10000.0;
        Double max = 100000.0;
        Double random = new Random().nextDouble();

        return min + (random * (max - min));
    }

    public static Producent generateProducent(){
        return Producent.randomProducent();
    }

    public static Boolean generateBoolean(){
        Random random = new Random();
        return random.nextBoolean();
    }

    public static VehicleType generateVehicleType(){
        return VehicleType.randomVehicleType();
    }
}
