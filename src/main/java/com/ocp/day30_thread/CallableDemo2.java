package com.ocp.day30_thread;

import java.math.BigDecimal;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

/*
利用 Callable 與 YahooFinance api 取得台積電最新報價
台積電的代號: 2330.TW
*/

class MyStock implements Callable<Double> {
    private String symbol;
    
    public MyStock(String symbol) {
        this.symbol = symbol;
    }
    
    @Override
    public Double call() throws Exception {
        Stock stock = YahooFinance.get(symbol);
        BigDecimal price = stock.getQuote().getPrice();
        return price.doubleValue();
    }
    
}

public class CallableDemo2 {
    public static void main(String[] args) throws Exception {
        // 假設欲購買台積電 1500 股請問交易成本為何 ?
        // 手續費 = 交易成本 * 0.001425
        String symbol = "3008.TW"; // "2330.TW";
        int amount = 1500; // 股
        
        MyStock myStock = new MyStock(symbol);
        FutureTask<Double> task = new FutureTask<>(myStock);
        new Thread(task).start();
        
        double price = task.get();
        double cost  = price * amount;
        double fee = cost * 0.001425;
        double total = cost + fee;
        // 印出交易成本（含手續費）
        
        System.out.printf("買進 %s price: $%,.1f amount: %,d 股 cost: $%,.1f fee: $%,.1f total: $%,.1f\n",
                symbol, price, amount, cost, fee, total);
    }
}
