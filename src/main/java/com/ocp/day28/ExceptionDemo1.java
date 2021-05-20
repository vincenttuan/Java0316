package com.ocp.day28;

import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("請輸入半徑: ");
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double area = Math.pow(r, 2) * Math.PI;
        System.out.printf("Area: %.2f\n", area);
    }
}
