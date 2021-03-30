package com.ocp.day07;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("吃蒲萄吐葡萄");
        System.out.println(sb);
        // 吃葡萄不吐葡萄皮
        sb.append("皮");
        System.out.println(sb);
        sb.insert(3, "不");
        System.out.println(sb);
        sb.replace(1, 2, "葡");
        System.out.println(sb);
        // 吐葡萄
        sb.delete(0, 4);
        System.out.println(sb);
        System.out.println(sb.length());
        sb.delete(3, sb.length());
        System.out.println(sb);
    }
}
