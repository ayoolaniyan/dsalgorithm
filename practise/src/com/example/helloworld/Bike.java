package com.example.helloworld;

public class Bike extends Vehicle {
    String name;
    String color;

    public Bike() {

    }
    public Bike(String name, String color) {
         this.color = color;
         this.name = name;
    }

    @Override
    void makeNoise() {
        System.out.println("PEEP...!!!");
    }
}
