package com.ocp.day20;

public class StringEqualsDemo {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = new String(new char[]{'J', 'a', 'v', 'a'});
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        // 物件型別若要使用 == 的時機, a 與 b 是不是指向同一個物件
        String a = "Java";
        String b = a;
        System.out.println(a == b);
    }
}
