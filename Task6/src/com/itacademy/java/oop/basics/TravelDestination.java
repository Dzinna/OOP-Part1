package com.itacademy.java.oop.basics;

import java.util.Arrays;

public class TravelDestination {
    private String name;
    private String city;
    private double distance;

    public TravelDestination(String name, String city, double distance) {
        this.name = name;
        this.city = city;
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\n--- Travel Destination ---" +
                "\nname: " + name +
                "\ncity: " + city +
                "\ndistance: " + distance;

    }
}
