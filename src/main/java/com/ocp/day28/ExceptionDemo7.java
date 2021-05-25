package com.ocp.day28;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class ExceptionDemo7 {
    public static void main(String[] args) {
        String mybirthday = "2000/1/一";
        DateFormat df = DateFormat.getDateInstance();
        try {
            Date date = df.parse(mybirthday);
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("日期轉換失敗, " + e);
        }
    }
}
