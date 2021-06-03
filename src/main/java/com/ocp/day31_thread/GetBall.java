package com.ocp.day31_thread;

class Ball {
    private int max = 10;
    public void get() {
        while(max > 0) {
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
        ball.get();
    }
    
}
public class GetBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        new BallThread(ball).start();
    }
}
