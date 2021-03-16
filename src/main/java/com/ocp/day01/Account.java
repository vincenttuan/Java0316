package com.ocp.day01;

public class Account {
    int balance; // 帳戶餘額
    void withdraw(int money) { // 提款方法
        // 驗證 money 是否符合存款的條件
        if(money <= 0) {
            System.out.println("提款金額不符!");
            return; // 提款方法到此結束 !
        }
        // 驗證 money 是否大於 balance ?
        if(money > balance) {
            System.out.println("帳戶餘額不足!");
            return; // 提款方法到此結束 !
        }
        balance -= money;
    }
    void deposit(int money) { // 存款方法
        // 驗證 money 是否符合存款的條件
        if(money <= 0) {
            System.out.println("存款金額不符!");
            return; // 存款方法到此結束 !
        }
        balance += money;
    }
}
