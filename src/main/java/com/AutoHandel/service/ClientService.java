package com.AutoHandel.service;

import com.AutoHandel.repository.ClientRepository;
import com.AutoHandel.user.Client;

import java.util.List;

public class ClientService {

    public static void addClientListToRepository(List<Client> clientList){
        ClientRepository.addClientList(clientList);
    }
}
