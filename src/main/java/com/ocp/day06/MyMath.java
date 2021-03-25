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
}
