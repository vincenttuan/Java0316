package com.lab.rice;

import java.net.URL;
import java.util.Scanner;

public class Util {
    public static String getJson() throws Exception {
        String path = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
        URL url = new URL(path);
        String json = new Scanner(url.openStream()).useDelimiter("\\A").next();
        return json;
    }
}
