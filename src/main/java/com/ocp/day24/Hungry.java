package com.ocp.day24;

import java.util.Set;

public class Hungry {
    public static void main(String[] args) {
        DataCenter dc = new DataCenter();
        Set<Food> catalog = dc.getCatalog();
        System.out.println(catalog);
        System.out.println(catalog.size());
    }
}
