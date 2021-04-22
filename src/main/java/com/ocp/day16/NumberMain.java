package com.ocp.day16;

public class NumberMain {
    public static void main(String[] args) {
        // Lambda 實作 EvenNumber, n = 50 是否是偶數
        EvenNumber even = (n) -> n % 2 == 0;
        System.out.println(even.isEven(50));
        // Lambda 實作 PrimeNumber, n = 9973 是否是質數
        
    }
}
