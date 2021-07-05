package com.AutoHandel;

import com.AutoHandel.service.Menu;
import com.AutoHandel.user.Player;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Player me = new Player("Michal", "Doroz", 100000.1);
        Menu menu = new Menu();

        menu.setupMenu(me);


    }
}
