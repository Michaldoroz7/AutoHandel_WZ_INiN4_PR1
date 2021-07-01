package com.AutoHandel;

import Control.Menu;
import Person.Player;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Player me = new Player("Michal", "Doroz", 100000.1);
        Menu menu = new Menu();

        menu.setupMenu(me);



    }
}
