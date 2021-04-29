package com.ocp.day18;

import java.util.Arrays;

public class School {
    public static void main(String[] args) {
        Arrays.stream(DataCenter.getPeople())
                .forEach(System.out::println);
        // 請問考試的總分與平均 = ?
        Arrays.stream(DataCenter.getPeople());
    }
}
