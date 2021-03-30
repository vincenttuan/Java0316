package com.ocp.day07;

public class StringReplaceDemo {
    public static void main(String[] args) {
        String s1 = "Jbvb";
        String s2 = "Java";
        s1 = s1.replace('b', 'a');
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        
    }
}
