package com.AutoHandel.repository;

import com.AutoHandel.user.Client;
import java.util.ArrayList;
import java.util.List;

public class ClientRepository {

    private static List<Client> clientList = new ArrayList<>();

    public static void addClientList(List<Client> newClientList) {
        clientList.addAll(newClientList);
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
