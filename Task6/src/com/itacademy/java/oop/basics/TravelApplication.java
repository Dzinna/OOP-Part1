package com.itacademy.java.oop.basics;

public class TravelApplication {

    public static void main(String[] args) {
        Family firstFamily = new Family(
                new Person[]{
                        new Person("Ona", "Petrauskiene", "moteris", 18),
                        new Person("Jurgis", "Jonaitis", "vyras", 35)},
                new Vehicle("SuperB", "Skoda", 14, 5.50),
                new TravelDestination("Komandiruote", "Stokholmas", 890.40));

        Family secondFamily = new Family(
                new Person[]{
                        new Person("Paulina", "Meilaite", "moteris", 25),
                        new Person("Jonas", "Smailaitis", "vyras", 30)},
                new Vehicle("Avensis", "Toyota", 10, 7.90),
                new TravelDestination("Atostogos", "Sventoji", 40.95));

        TravelManager.printFamilyMembers(firstFamily);
        TravelManager.printFamilyMembers(secondFamily);
        TravelManager.changeDestination(firstFamily, new TravelDestination("Atostogos", "Vilnius", 400));
        System.out.println(firstFamily.getTravelDestination());

        TravelManager.travel(secondFamily);
        TravelManager.travel(firstFamily);
    }
}
