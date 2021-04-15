package com.ocp.day12;

public class Zoo2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        playShout(cat);
        Tiger tiger = new Tiger();
        playShout(tiger);
        Cat cat2 = new Tiger();
        playShout(cat2);
    }
    public static void playShout(Cat x) {
        x.shout();
    }
}
