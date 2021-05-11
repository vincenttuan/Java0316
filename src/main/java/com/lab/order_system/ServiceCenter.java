package com.lab.order_system;

import java.util.Set;

public class ServiceCenter {
    private Set<Food> catalog = new DataCenter().getCatalog();
    // 檢視 Catalog
    public void printCatalog() {
        System.out.println("訂單系統");
        System.out.println("--------------------------------------------");
        for(Food food : catalog) {
            System.out.printf("編號: %2d 品名: %s 尺寸: %c 價格: %3d\n",
                    food.getNo(), food.getName(), food.getSize(), food.getPrice());
        }
        System.out.println("--------------------------------------------");
    }
}
