package com.ocp.day08;

public class XOGame {
    public static void main(String[] args) {
        char[][] xo = { {'O', 'X', 'O'}, {' ', 'X', 'X'}, {'O', ' ', ' '}};
        print(xo);
        System.out.println("輸入 xo[1][0] = 'O'");
        xo[1][0] = 'O';
        print(xo);
    }
    public static void print(char[][] xo) {
        for(char[] x : xo) {
            System.out.print("| ");
            for(char y : x) {
                System.out.print(y + " | ");
            }
            System.out.println();
        }
    }
}
