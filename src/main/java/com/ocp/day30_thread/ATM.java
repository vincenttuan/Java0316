package com.ocp.day30_thread;

import java.util.Random;

class Account { // 銀行帳戶
    private int balance; // 帳戶餘額

    public Account(int balance) {
        this.balance = balance;
    }
    
    public synchronized void withdraw(int cash) throws Exception { // 提款方法
        String name = Thread.currentThread().getName(); // 提款人
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

class WithDraw implements Runnable { // 提款執行緒(Runnable)
    private Account account; // 帳號
    private int cash; // 提款金額

    public WithDraw(Account account, int cash) {
        this.account = account;
        this.cash = cash;
    }
    
    @Override
    public void run() {
        try {
            account.withdraw(cash); // 進行提款的作業
        } catch (Exception e) {
        }
    }
}

public class ATM {
    public static void main(String[] args) {
        Account account = new Account(10000); // 資源：帳號
        Thread t1 = new Thread(new WithDraw(account, 5000), "小明");
        Thread t2 = new Thread(new WithDraw(account, 3000), "小華");
        Thread t3 = new Thread(new WithDraw(account, 4000), "小英");
        t1.start();
        t2.start();
        t3.start();
    }
}
