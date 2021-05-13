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
        return (json.charAt(0) == '?') ? json.substring(1) : json;
    }

    public static CDC[] getCdcs() throws Exception {
        String json = getJson();
        CDC[] cdcs = new Gson().fromJson(json, CDC[].class);
        return cdcs;
    }

    /**
     * 计算地球上任意两点(经纬度)距离
     *
     * @param long1 第一点经度
     * @param lat1 第一点纬度
     * @param long2 第二点经度
     * @param lat2 第二点纬度
     * @return 返回距离 单位：米
     */
    public static double distance(String p1, String p2) {
        // p1 = "22.39,114.12"
        // p1.split(",")[0] 會得到 "22.39" 的字串
        // p1.split(",")[1] 會得到 "114.12" 的字串
        double lat1 = Double.parseDouble(p1.split(",")[0]);
        double long1 = Double.parseDouble(p1.split(",")[1]);
        double lat2 = Double.parseDouble(p2.split(",")[0]);
        double long2 = Double.parseDouble(p2.split(",")[1]);
        double a, b, R;
        R = 6378137; // 地球半径
        lat1 = lat1 * Math.PI / 180.0;
        lat2 = lat2 * Math.PI / 180.0;
        a = lat1 - lat2;
        b = (long1 - long2) * Math.PI / 180.0;
        double d;
        double sa2, sb2;
        sa2 = Math.sin(a / 2.0);
        sb2 = Math.sin(b / 2.0);
        d = 2 * R * Math.asin(Math.sqrt(sa2 * sa2 + Math.cos(lat1)
                        * Math.cos(lat2) * sb2 * sb2));
        return d;
    }
}
