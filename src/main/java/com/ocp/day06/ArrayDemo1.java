package com.ocp.day06;
import java.util.Arrays;
public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] scores = new int[3];
        scores[0] = 100;
        scores[1] = 90;
        scores[2] = 90;
        int lens = scores.length; // 取得陣列長度
        System.out.printf("陣列長度: %d\n", lens); 
        // 印出陣列每一個元素資料
        System.out.println("[" + scores[0] + ", " + scores[1] + ", " + scores[2] + "]");
        System.out.println(Arrays.toString(scores));
        // 總分
        int sum = scores[0] + scores[1] + scores[2];
        // 平均
        double avg = (double)sum / lens;
        System.out.printf("總分: %d 平均: %.1f\n", sum, avg);
    }
}
