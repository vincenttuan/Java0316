package com.ocp.day29_assert;

public class AssertDemo {
    public static void main(String[] args) {
        
        int score = 400;
        
        // 1. 設定 Main class
        // 2. 加上 -ea
        // 3. 找出問題後要把 assert 拔除
        assert(score >= 0 && score <= 100): "分數錯誤: " + score;
        System.out.println(score >= 60 ? "Pass" : "Fail");
        
        
    }
}
