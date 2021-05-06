package com.ocp.day23;

public class Score {
    // 判斷分數是否在合理範圍(0~100)
    public static boolean isValid(int score) {
        return score >= 0 && score <= 100 ? true : false;
    }
}
