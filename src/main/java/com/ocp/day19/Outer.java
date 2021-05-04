package com.ocp.day19;

// 外部類別
public class Outer {
    int x = 10;
    static int y = 100;
    // 一般內部類別
    class Inner {
        void print() {
            System.out.println(Outer.this.x);
            System.out.println(Outer.y);
            System.out.println(SInner.z);
        }
    }
    // 靜態(static)內部類別
    static class SInner {
        static int z = 1000;
        static void print() {
            //System.out.println(Outer.this.x); // 不可呼叫
            System.out.println(Outer.y);
            System.out.println(SInner.z);
        }
    }
}
