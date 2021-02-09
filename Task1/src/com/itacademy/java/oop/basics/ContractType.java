package com.itacademy.java.oop.basics;

public enum ContractType {
    FULL_TIME("FT"), PART_TIME("PT");

    private String displayValue;

    public String getDisplayValue() {
        return displayValue;
    }

    public static ContractType fromCode(String code) {
        for (ContractType d : values()) {
            if (d.getDisplayValue().equals(code)) {
                return d;
            }
        }
        throw new IllegalArgumentException("enum does not exist");
    }

    ContractType(String displayValue) {
        this.displayValue = displayValue;
    }
}
