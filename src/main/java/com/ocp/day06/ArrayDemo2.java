package com.ocp.day06;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] scores = {50, 90, 90, 80, 70, 100, 40, 100, 75, 15};
        System.out.printf("%s, 長度: %d\n", Arrays.toString(scores), scores.length);
        // 總分?
        int sum = 0;
        for(int i=0;i<scores.length;i++) {
            sum += scores[i]; // += 累加
        }
        // 平均?
        double avg = (double)sum/scores.length;
        System.out.printf("總分: %d 平均: %.1f\n", sum, avg);
        // 求最高分?
    }
}
