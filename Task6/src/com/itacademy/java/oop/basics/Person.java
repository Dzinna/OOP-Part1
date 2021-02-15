package com.itacademy.java.oop.basics;

import java.util.Arrays;

public class Person {
    private String name;
    private String surname;
    private String gender;
    private int age;

    public Person(String name, String surname, String gender, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "\n*** Family member ***" +
                "\nName: " + name +
                "\nSurname: " + surname +
                "\nGender: " + gender +
                "\nAge: " + age + "\n" ;

    }
}
