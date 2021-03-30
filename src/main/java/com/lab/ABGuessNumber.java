package com.lab;

import java.util.Scanner;

public class ABGuessNumber {
    public static void main(String[] args) {
        int[] ansArray = Util.getAnsArray();//{5, 8, 4, 1};
        do {            
            Scanner sc = new Scanner(System.in);
            System.out.print("請輸入一組不重複的四位數: ");
            String guess = sc.next();
            int[] guessArray = {guess.charAt(0)-48, guess.charAt(1)-48, guess.charAt(2)-48, guess.charAt(3)-48};
            // 判斷 a, b
            int a = 0, b = 0;
            for(int i=0;i<4;i++) {
                if(ansArray[i] == guessArray[i]) {
                    a++;
                }
            }
            for(int i=0;i<4;i++) {
                for(int k=0;k<4;k++) {
                    if(ansArray[i] == guessArray[k]) {
                        b++;
                        break;
                    }
                }
            }
            b -= a; //b = b - a;
            System.out.printf("%d A %d B\n", a, b);
            if(a == 4) {
                System.out.println("Bingo");
                break;
            }
        } while (true);
    }
}
