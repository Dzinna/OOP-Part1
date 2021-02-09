package com.itacademy.java.oop.basics;

public class EmployeeManager {

    public static void main(String[] args) {
        Employee employee = new Employee("Onute", "Petrauskiene", ContractType.fromCode("PT"), "2021-03-01", 1000, "architect");

        System.out.println(employee);
    }
}
