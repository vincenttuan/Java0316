package com.ocp.day09;

public class WrapperDemo {
    public static void main(String[] args) {
        // 取得 int 的最大值
        int max = Integer.MAX_VALUE;
        System.out.printf("int 的最大值: %d\n", max);
        int max2 = Integer.max(10, 20);
        System.out.printf("10 與 20 的最大值: %d\n", max2);
        String chinese = "100";
        String english = "90";
        System.out.printf("總分: %s\n", chinese+english);
        System.out.printf("總分: %d\n", Integer.parseInt(chinese) + Integer.parseInt(english));
        
    }
}
