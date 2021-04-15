package com.ocp.day12;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OverloadingDemo2 {
    public void calc(int x, int y) {
        System.out.println(x + y);
    }
    public void calc(int x, int y, int z) {
        System.out.println(x + y + z);
    }
    public void calc(int[] array) {
        System.out.println(IntStream.of(array).sum());
    }
    
    public static void main(String[] args) {
        OverloadingDemo2 o = new OverloadingDemo2();
        o.calc(10, 20);
        o.calc(10, 20, 30);
        int[] array = {10, 20, 30, 40, 50, 60};
        o.calc(array);
    }
}
