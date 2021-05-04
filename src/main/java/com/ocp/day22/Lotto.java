package com.ocp.day22;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
    
    public String getValues() {
        Random r = new Random();
        int[] values = {
            r.nextInt(9) + 1,
            r.nextInt(9) + 1,
            r.nextInt(9) + 1,
            r.nextInt(9) + 1
        };
        return Arrays.toString(values);
    }
    
}
