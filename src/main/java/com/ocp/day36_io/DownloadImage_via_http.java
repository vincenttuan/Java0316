package com.ocp.day36_io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
// Download 讀取 -> 寫檔

public class DownloadImage_via_http {

    public static void main(String[] args) throws Exception {
        String fromPath = "https://ichef.bbci.co.uk/news/976/cpsprodpb/C448/production/_117684205_lotus.jpg";
        URL url = new URL(fromPath);
        
        String savePath = "src/main/java/com/ocp/day36_io/files/car.jpg";
        try (InputStream is = url.openConnection().getInputStream();
             FileOutputStream fos = new FileOutputStream(savePath, false);) {

            int ch = 0;
            // 邊讀邊寫
            while ((ch = is.read()) != -1) { // 邊讀 
                System.out.print(ch);
                fos.write(ch); // 邊寫
            }

        } catch (Exception e) {
        }

    }
}
