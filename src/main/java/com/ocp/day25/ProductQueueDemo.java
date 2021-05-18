package com.ocp.day25;

import java.util.LinkedList;
import java.util.Queue;

public class ProductQueueDemo {
    public static void main(String[] args) {
        Product p1 = new Product("口罩", 20);
        Product p2 = new Product("酒精", 50);
        Product p3 = new Product("手套", 15);
        
        Queue<Product> products = new LinkedList<>();
        products.offer(p1);
        products.offer(p1);
        products.offer(p2);
        products.offer(p2);
        products.offer(p2);
        products.offer(p3);
        System.out.println("購物車: " + products);
        // 結帳
        int amount = 0;
        // 應付帳款
        while (!products.isEmpty()) {            
            amount += products.poll().getPrice();
        }
        System.out.println("應付帳款: " + amount);
        // 查看購物車
        System.out.println("購物車: " + products);
    }
}
