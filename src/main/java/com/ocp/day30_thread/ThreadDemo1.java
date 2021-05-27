package com.ocp.day30_thread;

class Walking implements Runnable {

    @Override
    public void run() {
        job();
    }
    
    private void job() {
        String tname = Thread.currentThread().getName();
        for(int i=1;i<=1000;i++) {
            System.out.printf("%s 走了 %d 步\n", tname, i);
        }
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        Walking w1 = new Walking();
        Walking w2 = new Walking();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);
        t1.start();
        t2.start();
    }
}
