package com.ocp.day24;

import java.util.LinkedHashSet;
import java.util.Set;

public class DataCenter {
    public Set<Food> getCatalog() {
        Set<Food> catalog = new LinkedHashSet<>();
        catalog.add(new Food("牛肉拉麵", '大', 130));
        catalog.add(new Food("牛肉拉麵", '小', 110));
        catalog.add(new Food("羊肉拉麵", '大', 110));
        catalog.add(new Food("羊肉拉麵", '小', 90));
        catalog.add(new Food("雞肉拉麵", '大', 70));
        catalog.add(new Food("雞肉拉麵", '小', 50));
        catalog.add(new Food("乾拉麵", '大', 65));
        catalog.add(new Food("乾拉麵", '小', 35));
        catalog.add(new Food("蘿蔔湯", '大', 30));
        catalog.add(new Food("蘿蔔湯", '小', 20));
        return catalog;
    }
}
