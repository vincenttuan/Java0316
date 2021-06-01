package com.ocp.day30_thread;

import java.util.Random;

class Account { // 銀行帳戶
    private int balance; // 帳戶餘額

    public Account(int balance) {
        this.balance = balance;
    }
    
    public void withdraw(int cash) throws Exception { // 提款方法
        String name = Thread.currentThread().getName();
        System.out.printf("%s 準備提款...\n", name);
        // 取得目前的帳戶餘額
        int currentBalance = balance;
        if(currentBalance >= cash) { // 是否餘額足夠提款
            // 開始提款
            Thread.sleep(new Random().nextInt(100)); // 模擬提款所花費的時間
            // 提款成功
            // 回寫帳戶餘額
            balance = balance - cash;
            // 印出交易單
            System.out.printf("%s 提款: $%,d 成功 帳戶餘額: $%,d\n",
                              name, cash, balance);
        } else {
            System.out.printf("%s 提款: $%,d 失敗(餘額不足) 帳戶餘額: $%,d\n",
                              name, cash, balance);
        }
    }

}

public class ATM {
    
}
