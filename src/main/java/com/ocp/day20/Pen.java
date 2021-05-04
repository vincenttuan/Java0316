package com.ocp.day20;

public class Pen {
    private String color;
    private int price;

    public Pen(String color, int price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        Pen p = (Pen)obj;
        if(price == p.price && color.equals(p.color)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 7;
    }
        
    @Override
    public String toString() {
        return "Pen{" + "color=" + color + ", price=" + price + '}';
    }
    
}
