package com.itacademy.java.oop.basics;

public class Account {
    private String id;
    private String name;
    int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() { return id; }

    public String getName() { return name; }

    public int getBalance() { return balance; }

    public int credit(int amount){
        return balance += amount;
    }

    public int debit(int amount){
        if( amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Amount exceeded");
        }
        return balance;
    }

    public int transferTo(Account another, int amount){
        if( amount <= balance){
            another.balance += amount;
        } else {
            System.out.println("Amount exceeded");
        }
        return balance;

    }


    @Override
    public String toString() {
        return "Account [" + '\n' +
                "\t Id = " + id + '\n' +
                "\t Name = " + name + '\n' +
                "\t Balance = " + balance + '\n' +
                "]";
    }

}
