package com.lab.order_system;

import java.util.Objects;

public class Food {
    private int no; // 餐點編號
    private String name;
    private char size;
    private int price;

    public Food(int no, String name, char size, int price) {
        this.no = no;
        this.name = name;
        this.size = size;
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.no;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + this.size;
        hash = 29 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Food other = (Food) obj;
        if (this.no != other.no) {
            return false;
        }
        if (this.size != other.size) {
            return false;
        }
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" + "no=" + no + ", name=" + name + ", size=" + size + ", price=" + price + '}';
    }
    
    
    
    
}
