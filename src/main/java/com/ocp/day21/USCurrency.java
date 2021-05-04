package com.ocp.day21;

// PENNY 一美分, NICKLE 五美分, DIME 十美分, QUARTER 25美分

public class USCurrency {
    private int value;

    public USCurrency(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
}
