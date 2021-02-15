package com.itacademy.java.oop.basics;
import java.util.Arrays;

public class Family {
    private Person[] people;
    private Vehicle vehicle;
    private TravelDestination travelDestination;

    public Family(Person[] people, Vehicle vehicle, TravelDestination travelDestination) {
        this.people = people;
        this.vehicle = vehicle;
        this.travelDestination = travelDestination;
    }

    public TravelDestination getTravelDestination() {
        return travelDestination;
    }

    public void setTravelDestination (TravelDestination travelDestination) {
        this.travelDestination = travelDestination;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Person[] getPeople() { return people; }

    @Override
    public String toString() {
        return "Family Data :\n " +
                Arrays.toString(people) +
                vehicle.toString() +
                travelDestination.toString();

    }
}
