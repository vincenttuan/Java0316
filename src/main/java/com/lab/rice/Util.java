package com.lab.rice;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class Util {
    public static String getJson() throws Exception {
        String path = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
        URL url = new URL(path);
        String json = new Scanner(new InputStreamReader(url.openStream(), "UTF-8"))
                .useDelimiter("\\A")
                .next();
        return json;
    }
}
