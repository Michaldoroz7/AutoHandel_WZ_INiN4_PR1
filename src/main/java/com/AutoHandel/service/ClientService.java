package com.AutoHandel.service;

import com.AutoHandel.model.Producent;
import com.AutoHandel.model.VehicleType;
import com.AutoHandel.repository.ClientRepository;
import com.AutoHandel.user.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientService {

    public static void addClientListToRepository(List<Client> clientList){
        ClientRepository.addClientList(clientList);
    }

    public static void showClientList(){
        ClientRepository.ShowClientList();
    }

    public static List<Client> getClientList(){
        return ClientRepository.getClientList();
    }

    public static List<Client> getSpecificClient(List <Client> clientList, Producent producent, VehicleType vehicleType) {
        List<Client> specificClientList = new ArrayList<>();

        for (int i = 0; i < clientList.size(); i++){
            if (clientList.get(i).getPreferableProducent() == producent && clientList.get(i).getPreferableVehicleType() == vehicleType) {
                specificClientList.add(clientList.get(i));
            }
        }
        return specificClientList;
    }

    public static void showSpecificClientList(List<Client> specificClientList) {

        for (int i = 0; i < specificClientList.size(); i++) {
            System.out.println("ID: " + i);
            System.out.println("Budget: " + specificClientList.get(i).getBudget());
            System.out.println("Preferable Producent: " + specificClientList.get(i).getPreferableProducent());
            System.out.println("Preferable Vehicle Type: " + specificClientList.get(i).getPreferableVehicleType());

        }
    }

}
