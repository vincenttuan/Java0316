package com.ocp.day26;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        // 考試科目:國文, 英文, 數學 -> Set<String> 集合
        // 考試成績:100,  90 , 100 -> List<Integer> 集合
        
        //Map<String, Integer> exams = new HashMap<>();
        Map<String, Integer> exams = new LinkedHashMap<>();
        exams.put("國文", 100);
        exams.put("數學", 100);
        exams.put("英文", 90);
        System.out.println(exams);
        // 取得考試科目
        Set<String> subjects = exams.keySet();
        System.out.println(exams.keySet());
        // 取得單一考試成績
        System.out.println(exams.get("國文"));
        // 取得所有考試成績
        Collection<Integer> scores = exams.values();
        System.out.println(scores);
    }
}
