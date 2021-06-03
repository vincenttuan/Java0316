package com.ocp.day32_cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierCar {
    public static void main(String[] args) {
        int parties = 3;
        CyclicBarrier cb = new CyclicBarrier(parties);
        new Car(cb).start();
        new Car(cb).start();
        new Car(cb).start();
        
    }
    
    
    
}
