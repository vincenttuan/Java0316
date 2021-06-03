package com.ocp.day31_thread;

public class Cookies {
    public synchronized void eat(int i) {
        System.out.printf("小狗吃了第 %d 塊餅乾\n", i);
    }
    public synchronized void put(int i) {
        System.out.printf("主人放了第 %d 塊餅乾\n", i);
    }
}
