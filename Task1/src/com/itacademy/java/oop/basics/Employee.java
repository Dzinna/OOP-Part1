package com.itacademy.java.oop.basics;

public class Employee {
    private String name;
    private String surname;
    private ContractType contractType;
    private String contractStartDate;
    private double salary;
    private String position;

    public Employee(String name, String surname, ContractType contractType, String contractStartDate, double salary, String position) {
        this.name = name;
        this.surname = surname;
        this.contractType = contractType;
        this.contractStartDate = contractStartDate;
        this.salary = salary;
        this.position = position;
    }

    public Employee() {
    }

    public String getName() { return name; }

    public String getSurname() {
        return surname;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee {" + '\n' +
                "\t Name = " + name + '\n' +
                "\t Surname = " + surname + '\n' +
                "\t Contract type = " + contractType + '\n' +
                "\t Contract start date = " + contractStartDate + '\n' +
                "\t Salary = " + salary + '\n' +
                "\t Position = " + position + '\n' +
                '}';
    }


}
