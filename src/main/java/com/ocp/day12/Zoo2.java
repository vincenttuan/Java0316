package com.ocp.day12;

public class Zoo2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        playShout(cat);
        Tiger tiger = new Tiger();
        playShout(tiger);
    }
    public static void playShout(Cat x) {
        x.shout();
    }
}
