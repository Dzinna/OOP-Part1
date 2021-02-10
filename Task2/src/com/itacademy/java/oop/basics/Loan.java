package com.itacademy.java.oop.basics;

public class Loan {
    private int id;
    private int amount;
    private Loans loanType;
    private String terminationDate;

    public Loan(int id, int amount, Loans loanType, String terminationDate) {
        this.id = id;
        this.amount = amount;
        this.loanType = loanType;
        this.terminationDate = terminationDate;
    }

    public Loan() {
    }

    public int getId() { return id; }

    public int getAmount() {
        return amount;
    }

    public void setLoanType(Loans loanType) { this.loanType = loanType; }

    public String getTerminationDate() {
        return terminationDate;
    }
}
