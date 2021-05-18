package com.ocp.day26;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // 考試科目:國文, 英文, 數學 -> Set<String> 集合
        // 考試成績:100,  90 , 100 -> List<Integer> 集合
        
        Map<String, Integer> exams = new HashMap<>();
        exams.put("國文", 100);
        exams.put("英文", 90);
        exams.put("數學", 100);
        System.out.println(exams);
    }
}
