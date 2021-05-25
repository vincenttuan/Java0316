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
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println(e);
            //e.printStackTrace(System.out);
        }
        System.out.println("程式繼續執行");
    }
}
