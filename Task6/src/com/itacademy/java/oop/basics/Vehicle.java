package com.itacademy.java.oop.basics;

import java.util.Arrays;

public class Vehicle {
    private String name;
    private String brand;
    private double fuel;
    private double consumption;

    public Vehicle(String name, String brand, double fuel, double consumption) {
        this.name = name;
        this.brand = brand;
        this.fuel = fuel;
        this.consumption = consumption;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getFuel() {
        return fuel;
    }

    public double getConsumption() {
        return consumption;
    }

    @Override
    public String toString() {
        return "\n--- Vehicle ---" +
                "\nname: " + name +
                "\nbrand: " + brand +
                "\nfuel: " + fuel +
                "\nconsumption: " + consumption;

    }
}
