package com.ocp.day08;

public class MultiArrayDemo3 {
    public static void main(String[] args) {
        // 3人的身高與體重如下:
        double[][] hw = {{170, 60},{160, 45},{180, 90}};
        // 求3人的BMI
        for(double[] x : hw) {
            double h = x[0];
            double w = x[1];
            double bmi = w / Math.pow(h/100, 2);
            System.out.printf("%.2f\n", bmi);
        }
    }
}
