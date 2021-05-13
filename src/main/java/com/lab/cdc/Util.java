package com.lab.cdc;

// 工具程式

import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class Util {
    
    public static String getJson() throws Exception {
        // 資料來源
        String path = "https://www.cdc.gov.tw/TravelEpidemic/ExportJSON";
        // 建立 URL 物件
        URL url = new URL(path);
        // 取得 json 文字資料 ("\\A" 全部選擇)
        String json = new Scanner(new InputStreamReader(url.openStream(), "UTF-8"))
                .useDelimiter("\\A")
                .next();
        return json.substring(1);
    }
    
}
