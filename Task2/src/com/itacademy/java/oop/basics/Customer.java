package com.itacademy.java.oop.basics;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Customer {
        private String name;
        private String surname;
        private int age;
        private String personalNumber;
        private Loan[] loans;

        public Customer(String name, String surname, int age, String personalNumber, Loan[] loans) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.personalNumber = personalNumber;
            this.loans = loans;
        }

        public Customer() {
        }

    public String getName() { return name; }

    public String getSurname() {
        return surname;
    }

    public int age() {
        return age;
    }

    public String personalNumber() {
        return personalNumber;
    }

    public Loan[] loans() {
        return loans;
    }

    @Override
    public String toString() {
        return "Employee {" + '\n' +
                "\t Name = " + name + '\n' +
                "\t Surname = " + surname + '\n' +
                "\t Age = " + age + '\n' +
                "\t Personal number = " + personalNumber + '\n' +
                "\t Leasing loan = " + loans[0].getAmount() + '\n' +
                "\t Consumer loan = " + loans[1].getAmount() + '\n' +
                "\t Loans amount sum = " + (loans[0].getAmount() + loans[1].getAmount()) + '\n' +
                '}';
    }

}
