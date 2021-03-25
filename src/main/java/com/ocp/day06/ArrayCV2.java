package com.ocp.day06;

public class ArrayCV2 {
    public static void main(String[] args) {
        double[] nums = {10, 20, 30};
        System.out.println(MyMath.sum(nums));
        System.out.println(MyMath.avg(nums));
        System.out.println(MyMath.sd(nums));
        System.out.println(MyMath.cv(nums));
    }
}
