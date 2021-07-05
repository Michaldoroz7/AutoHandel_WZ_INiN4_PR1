package com.AutoHandel.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
    int budget;
    String vehicleProducent;
    Boolean damagedAccept;


    public Client(int budget, String vehicleProducent, Boolean damagedAccept) {
        this.budget = budget;
        this.vehicleProducent = vehicleProducent;
        this.damagedAccept = damagedAccept;

    }
}
