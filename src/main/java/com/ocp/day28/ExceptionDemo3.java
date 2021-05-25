package com.ocp.day28;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        int[] nums = {10, 5}; // {10, 0}  {10}  null
        
        try {
            int avg = nums[0] / nums[1];
            // ArithmeticException
            // ArrayIndexOutOfBoundsException
            // NullPointerException
            System.out.println(avg);
        } catch (ArithmeticException e) {
            System.out.println("數學錯誤, 錯誤原因: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("陣列維度(個數)不足, 錯誤原因: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("陣列實體沒有建立, 錯誤原因: " + e.getMessage());
        }
        
    }
}
