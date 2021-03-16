package com.ocp.day01;

public class Account {
    int balance; // 帳戶餘額
    void withdraw(int money) { // 提款方法
        balance -= money;
    }
    void deposit(int money) { // 存款方法
        balance += money;
    }
}
