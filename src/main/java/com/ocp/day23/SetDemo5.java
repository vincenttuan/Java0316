package com.ocp.day23;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo5 {
    public static void main(String[] args) {
        // 排序性(小 -> 大)
        Set<Integer> nums = new TreeSet<>();
        // 1~9 任意 5 個
        Random r = new Random();
        while(nums.size() < 7) {
            int n = r.nextInt(9) + 1;
            System.out.println("n: " + n);
            nums.add(n);
        }
        System.out.println(nums);
        
        
    }
}
