package com.ocp.day29_assert;

// 用來計算面積的類別
public class Square {
    // 計算梯形面積
    public int getArea(int top, int bottom, int h) {
        int area = ((top + bottom)) * h / 2;
        return area;
    }
}
