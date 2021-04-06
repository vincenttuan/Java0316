package com.lab;

public class Java8Study2 {
    public static void main(String[] args) {
        int[] scores = {80, 50, 70, 90, 40};
        // 列印及格的分數
        // java 7
        for(int s : scores) {
            if(s >= 60) {
                System.out.println(s);
            }
        }
    }
}
