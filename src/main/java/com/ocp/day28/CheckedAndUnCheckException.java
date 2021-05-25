package com.ocp.day28;

/*
Checked Exception: 受檢例外
UnChecked Exception: 非受檢例外 (Error, RuntimeException)
*/
public class CheckedAndUnCheckException {
    public static void main(String[] args) {
        /*
        UnChecked Exception: 非受檢例外
        一遇到不是立即停止程式就是程式碼不夠堅固
        立即停止: Error
        程式碼不夠堅固: RuntimeException
        */
        int x = 10;
        int y = 0;
        if(y != 0) { // 避免 ArithmeticException 的發生
            int avg = x / y;
            System.out.println(avg);
        }
        
        int[] nums = {};
        if(nums != null) { // 避免 NullPointerException 的發生
            if(nums.length > 0) { // 避免 ArrayIndexOutOfBoundsException 的發生
             System.out.println(nums[0]);
            }
        }
        
    }
}
