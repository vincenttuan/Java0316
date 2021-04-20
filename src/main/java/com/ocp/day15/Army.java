package com.ocp.day15;

import java.util.stream.Stream;

public class Army {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        Tank tank = new Tank();
        Truck truck = new Truck();
        
        Car[] cars = {tank, truck};
        Weapon[] weapons = {fighter, tank};
        
        Stream.of(cars).forEach(c -> c.move());
        Stream.of(weapons).forEach(w -> w.shoot());
        
        // 請問 fighter, tank, truck 總油耗 = ?
        Oil[] oils = {fighter, tank, truck};
        //int sum = Stream.of(oils).mapToInt(o -> o.spend()).sum();
        int sum = Stream.of(oils).mapToInt(Oil::spend).sum();
        System.out.println(sum);
    }
}
