package com.ocp.day31_thread;

public class Main {
    public static void main(String[] args) {
        Cookies cookies = new Cookies();
        Thread dog = new EatThread(cookies);
        Thread master = new PutThread(cookies);
        dog.start();
        master.start();
    }
}
