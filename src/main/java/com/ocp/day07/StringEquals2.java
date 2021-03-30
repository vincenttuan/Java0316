package com.ocp.day07;

public class StringEquals2 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = "Java";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        // 將 s1 放入 String pool
        s1 = s1.intern();
        System.out.println(s1 == s2);
        String s3 = "jAvA";
        System.out.println(s2.equals(s3)); // 有分大小寫的比較
        System.out.println(s2.equalsIgnoreCase(s3)); // 不分大小寫的比較
    }
}
