package com.example.helloworld;

public class Vehicle {
    String name;
    String color;

    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Vehicle(){}

    void makeNoise() {
        System.out.println("peep ..! peep..!");
    }
}
