package com.lab.cdc;

// 工具程式

import com.google.gson.Gson;
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
        
//        if(json.charAt(0) == '?') {
//            return json.substring(1);
//        } else {
//            return json;
//        }
        
        return (json.charAt(0) == '?')?json.substring(1):json;
    }
    
    public static CDC[] getCdcs() throws Exception{
        String json = getJson();
        CDC[] cdcs = new Gson().fromJson(json, CDC[].class);
        return cdcs;
    }
    
}
