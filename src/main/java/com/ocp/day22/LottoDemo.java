package com.ocp.day22;

public class LottoDemo {
    public static void main(String[] args) {
        Lotto a = new Lotto();
        System.out.println("小明回報今日四星彩: " + a.getValues());
        Lotto b = new Lotto();
        System.out.println("小華回報今日四星彩: " + b.getValues());
        Lotto c = new Lotto();
        System.out.println("小英回報今日四星彩: " + c.getValues());
        
    }
}
