package com.ocp.day31_thread;

import java.util.LinkedHashMap;
import java.util.Map;

class Ball {
    private int max = 500;
    public void get() {
        // ... code
        synchronized(this) {
            if(max > 0) {
                String name = Thread.currentThread().getName();
                System.out.printf("%s 取到第 %d 顆球\n", name, max);
                max--;
                GetBall.map.put(name, GetBall.map.get(name)+1);
            }
        }
        // ... code
    }
}

class BallThread extends Thread {
    private Ball ball;

    public BallThread(Ball ball) {
        this.ball = ball;
    }

    @Override
    public void run() {
        for(int i=1;i<=500;i++) {
            ball.get();
        }
        System.out.println(GetBall.map);
    }
    
}
public class GetBall {
    static Map<String, Integer> map = new LinkedHashMap<>();
    static {
        map.put("Thread-0", 0);
        map.put("Thread-1", 0);
        map.put("Thread-2", 0);
    }
    public static void main(String[] args) {
        Ball ball = new Ball();
        new BallThread(ball).start();
        new BallThread(ball).start();
        new BallThread(ball).start();
    }
}
