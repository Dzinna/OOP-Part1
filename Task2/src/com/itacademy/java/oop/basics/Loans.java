package com.itacademy.java.oop.basics;

public enum Loans {
    LEASING("leasing"), CONSUMER("consumer");

    private String displayValue;

    public String getDisplayValue() {
        return displayValue;
    }

    public static Loans fromCode(String code) {
        for (Loans d : values()) {
            if (d.getDisplayValue().equals(code)) {
                return d;
            }
        }
        throw new IllegalArgumentException("enum does not exist");
    }

    Loans(String displayValue) {
        this.displayValue = displayValue;
    }
}
