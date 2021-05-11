package com.lab.order_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Food> order = new ArrayList<>();
    private static DataCenter dc = new DataCenter();
    private static ServiceCenter sc = new ServiceCenter();
    private static boolean play = true;
    
    public static void main(String[] args) {
        while (play) {            
            menu();
        }
    }
    
    public static void menu() {
        sc.menu();
        System.out.print("請輸入: ");
        Scanner scanner = new Scanner(System.in);
        int itemId = scanner.nextInt();
        switch(itemId) {
            case 1: // 檢視 Catalog
                sc.printCatalog();
                break;
            case 2: // 新增訂單餐點
                System.out.print("請輸入No: ");
                int addNo = scanner.nextInt();
                // 在 order 集合中加入 Food
                Food food = sc.getFoodByNo(addNo);
                order.add(food);
                break;
            case 3: // 查詢訂單餐點
                for(int i=0;i<order.size();i++) {
                    System.out.printf("id: %d %s\n", i, order.get(i));
                }
                break;
            case 4: // 取消訂單餐點
                System.out.print("請輸入取消No: ");
                int cancelId = scanner.nextInt();
                order.remove(cancelId); // 移除單筆元素
                break;
            case 5: // 刪除全部訂單
                order = new ArrayList<>();
                break;
            case 6: // 結帳
                int sum = order.stream().mapToInt(Food::getPrice).sum();
                System.out.printf("結帳: %d\n", sum);
                order = new ArrayList<>();
                break;
            case 0: // 離開
                play = false;
        }
    }
}
