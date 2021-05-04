package com.ocp.day21;

public class MonkeyWeek {
    public static void main(String[] args) {
        work(2);
        work(Week.MON);
    }
    public static void work(int num) {
        switch(num) {
            case Week.MON:
                System.out.println("猴子穿新衣");
                break;
            case Week.TUES:
                System.out.println("猴子去烤肉");
                break;
        }
    }
}
