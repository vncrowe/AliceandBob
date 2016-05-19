package io.veronicacrowe;

import java.util.Scanner;

/**
 * Created by veronicacrowe on 5/19/16.
 */
public class Greeting {

    public void askForName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        if (name.toUpperCase().equals("ALICE")) {
            System.out.println("Hello Alice!");
        } else if (name.toUpperCase().equals("BOB")) {
            System.out.println("Hello Bob!");
        } else {
            System.out.println("I'm sorry I do not know who you are!");
        }
    }
}
