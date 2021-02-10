package com.itacademy.java.oop.basics;

public class AccountApplication {

    public static void main(String[] args){
        Account accountFirst = new Account("100100", "BankOne", 100);
        Account accountSecond = new Account("100200", "BankTwo", 50);

        accountFirst.credit(20);
        accountFirst.credit(10);
        System.out.println("First account balance after 2 times credit: " + accountFirst.balance);

        accountSecond.credit(10);
        System.out.println("Second account balance after credit: " + accountSecond.balance);

        accountFirst.debit(500);
        accountSecond.transferTo(accountFirst, 70);
        accountFirst.debit(30);
        System.out.println("First account balance after operations: " + accountFirst.balance);

        accountFirst.transferTo(accountSecond, 10);
        System.out.println("\nFirst account balance: " + accountFirst.balance);
        System.out.println("Second account balance: " + accountSecond.balance + "\n");

        System.out.println(accountFirst);
        System.out.println(accountSecond);

    }
}
