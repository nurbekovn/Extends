package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Djek","worker");
        System.out.println(person);

        System.out.println();

        Programmer programmer = new Programmer("Niyazov",
            "programmer","Peaksoft");
        System.out.println(programmer);
        programmer.eat();
        programmer.coding();
        programmer.learn();
        programmer.walk();

        System.out.println();

        Dancer dancer = new Dancer("Roza",
                "dancer", "Vals");
        System.out.println(dancer);
        dancer.eat();
        dancer.learn();
        dancer.walk();
        dancer.dancing();

        System.out.println();

        Singer singer = new Singer("Zain",
                "singer","Nashid");
        System.out.println(singer);
        dancer.eat();
        dancer.learn();
        dancer.walk();
        singer.singing();
        singer.playGitar();

    }
}