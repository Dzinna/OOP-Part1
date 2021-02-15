package com.itacademy.java.oop.basics;

public final class TravelManager {
    public static void changeDestination(Family family, TravelDestination destination) {
        if(!isEqual(family.getTravelDestination(), destination)){
            family.setTravelDestination(destination);
            System.out.println("Destination changed.");
        }
        System.out.println("Destination not changed.");
    }

    private static boolean isEqual(TravelDestination destinationFirst, TravelDestination destinationSecond) {
        if (destinationFirst.getCity().toUpperCase() == destinationSecond.getCity().toUpperCase()
                && destinationFirst.getName().toUpperCase() == destinationSecond.getName().toUpperCase()) {
            return true;

        } else {
            return false;
        }
    }

    public static void travel(Family family) {
        if(fuelDistance(family) >= family.getTravelDestination().getDistance()){
            System.out.println("Destination reached");
        } else {
            System.out.println("Destination not reached. Need to fill " + Math.round(fillFuel(family))/100.0 + " litters fuel.");
        }
    }

    private static double fuelDistance(Family family){
        return (family.getVehicle().getFuel() / family.getVehicle().getConsumption()) * 100;
    }

    private static double fillFuel(Family family){
        return (family.getTravelDestination().getDistance() - fuelDistance(family));
    }

    public static void printFamilyMembers(Family family) {
            System.out.println(family.toString());
    }

}
