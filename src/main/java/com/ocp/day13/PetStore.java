package com.ocp.day13;

public class PetStore {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.eat();
        a1.move();
        a2.eat();
        a2.move();
        System.out.println(Animal.legs);
        System.out.println(Dog.legs);
        System.out.println(Cat.legs);
    }
}
