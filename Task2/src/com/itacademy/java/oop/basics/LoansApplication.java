package com.itacademy.java.oop.basics;

import java.util.ArrayList;

public class LoansApplication {

    public static void main(String[] args) {
        Loan loanLeasing = new Loan(1, 1250, Loans.fromCode("leasing"), "2021-08-05");
        Loan loanConsumer = new Loan(2, 400, Loans.fromCode("consumer"), "2021-12-31");

        Loan[] loans = {loanConsumer, loanLeasing};

        Customer customer = new Customer("Jonas", "Jonaitis", 25, "39310230123", loans);

        System.out.println(customer);
    }
}
