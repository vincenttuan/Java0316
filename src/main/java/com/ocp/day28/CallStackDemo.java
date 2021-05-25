package com.ocp.day28;

public class CallStackDemo {
    public static void main(String[] args) {
        a();
    }
    
    public static void a() {
        b();
    }
    
    public static void b() {
        c();
    }
    
    public static void c() {
        System.out.println(10/0);
        System.out.println("程式繼續執行");
    }
}
