package com.ocp.day31_thread;

public class PutThread extends Thread {
    private Cookies cookies;

    public PutThread(Cookies cookies) {
        this.cookies = cookies;
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++) {
            cookies.put(i);
        }
    }
    
}
