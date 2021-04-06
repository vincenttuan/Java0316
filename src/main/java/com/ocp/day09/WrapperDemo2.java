package com.ocp.day09;

public class WrapperDemo2 {
    // auto boxing/unboxing (自動裝箱與拆箱)
    public static void main(String[] args) {
        // Java 5.0 版以前的寫法
        Integer a = new Integer(100);
        Integer b = new Integer(200);
        System.out.println(a.intValue() + b.intValue());
        // Java 5.0 版以後的寫法
        Integer a2 = 100; // 相當於編譯器幫你產生 new Integer(100) *auto-boxing (自動裝箱)
        Integer b2 = 200;
        System.out.println(a2 + b2); // 相當於編譯器幫你調用 intValue() 方法 *auto-unboxing (自動拆箱)
        
    }
}
