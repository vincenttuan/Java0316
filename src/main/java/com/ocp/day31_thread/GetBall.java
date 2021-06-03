package com.ocp.day31_thread;

class Ball {
    private int max = 100;
    public synchronized void get() {
        if(max > 0) {
            String name = Thread.currentThread().getName();
            System.out.printf("%s 取到第 %d 顆球\n", name, max);
            max--;
        }
    }
}

class BallThread extends Thread {
    private Ball ball;

    public BallThread(Ball ball) {
        this.ball = ball;
    }

    @Override
    public void run() {
        for(int i=1;i<=100;i++) {
            ball.get();
        }
    }
    
}
public class GetBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        new BallThread(ball).start();
        new BallThread(ball).start();
    }
}
