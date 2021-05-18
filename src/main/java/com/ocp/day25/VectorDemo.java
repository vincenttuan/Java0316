package com.ocp.day25;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        int n = 1300;
        for(int i=1;i<=n;i++) {
            v.add(i);
        }
        System.out.printf("capacity(容積空間): %d\n", v.capacity());
        System.out.printf("size(已使用): %d\n", v.size());
        System.out.printf("殘餘空間: %d\n", v.capacity() - v.size());
    }
}
