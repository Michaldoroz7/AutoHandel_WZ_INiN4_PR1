package com.AutoHandel.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    String firstName;
    String lastName;
    Double budget;


    public Player(String firstName, String lastName, Double budget){
        this.firstName = firstName;
        this.lastName = lastName;
        this.budget = budget;
    }

}
