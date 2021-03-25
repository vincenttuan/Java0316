package com.ocp.day06;

public class MyMath {
    public static double sum(double[] nums) {
        int sum = 0;
        for(double n : nums) {
            sum += n;
        }
        return sum;
    }
    
    public static double avg(double[] nums) {
        double sum = sum(nums);
        double n = nums.length;
        double avg = sum / n;
        return avg;
    }

    public static double sd(double[] nums) {
        double avg = avg(nums);
        double sumOfSquares = 0;
        for(double n : nums) {
            sumOfSquares += Math.pow(n-avg, 2);
        }
        int n = nums.length;
        double sd = Math.sqrt((1.0/n)*sumOfSquares);
        return sd;
    }
}
