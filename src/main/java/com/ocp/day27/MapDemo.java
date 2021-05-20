package com.ocp.day27;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    
    public static void main(String[] args) {
        
        Map map1 = new Hashtable(); //LinkedHashMap(); //TreeMap(); //HashMap(); 
        map1.put("B", 100);
        map1.put("C", 80);
        map1.put("E", 80);
        map1.put("D", 80);
        map1.put("A", 90);
        System.out.println(map1);
    }
    
}
