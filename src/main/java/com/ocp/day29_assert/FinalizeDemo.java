package com.ocp.day29_assert;

class Ball {
    // 建構子
    public Ball() {
        System.out.println("Ball 建立-棒球");
    }
    
    // 商業邏輯
    void play() {
        System.out.println("打棒球");
    }
    
    // Finalize
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Ball 消失了");
    }

}

public class FinalizeDemo {
    
}
