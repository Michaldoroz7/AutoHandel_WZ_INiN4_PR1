package com.AutoHandel.repository;

import com.AutoHandel.user.Client;
import java.util.ArrayList;
import java.util.List;

public class ClientRepository {

    private static List<Client> clientList = new ArrayList<>();

    public static void addClientList(List<Client> newClientList) {
        clientList.addAll(newClientList);
    }

    public static void ShowClientList(){
        for(int i = 0; i < clientList.size(); i++){
            System.out.println("ID: " + i);
            System.out.println("Budget: " + clientList.get(i).getBudget());
            System.out.println("Damaged components accept: " + clientList.get(i).getDamagedAccept());
            System.out.println("Preferable Producents: " + clientList.get(i).getPreferableProducent());
            System.out.println("Preferable Vehicle Type: " + clientList.get(i).getPreferableVehicleType());
        }
    }

    public static Client getClient(int index) {
        return clientList.get(index);
    }

    public static void saveClient(Client client) {
        clientList.add(client);
    }

    public static void deleteClient(int index) {
        clientList.remove(index);
    }
}
