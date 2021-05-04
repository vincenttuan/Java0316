package com.ocp.day21;

public class MonkeyWeek {
    public static void main(String[] args) {
        work(Week.MON);
    }
    public static void work(Week week) {
        switch(week) {
            case MON:
                System.out.println("猴子穿新衣");
                break;
            case TUES:
                System.out.println("猴子去烤肉");
                break;
        }
    }
}
