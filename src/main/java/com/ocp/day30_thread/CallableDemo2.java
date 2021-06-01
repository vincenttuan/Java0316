package com.ocp.day30_thread;

import java.math.BigDecimal;
import java.util.concurrent.Callable;
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
    public static void main(String[] args) {
        // 假設欲購買台積電 1500 股請問交易成本為何 ?
        // 手續費 = 交易成本 * 0.001425
        String symbol = "2330.TW";
        int amount = 1500; // 股
        
        // 印出交易成本（含手續費）
    }
}
