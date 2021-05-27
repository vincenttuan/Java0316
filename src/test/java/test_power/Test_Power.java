package test_power;

import com.ocp.day29_assert.Power;
import junit.framework.Assert;
import org.junit.Test;

public class Test_Power {
    @Test
    public void t1() {
        // 3A
        Power power = new Power();
        int a = 100;
        int v = 220;
        int exp_w = 22000;
        int act_w = power.getW(v, a);
        Assert.assertEquals(exp_w, act_w);
    }
    
    @Test
    public void t2() {
    
    }
    
    @Test
    public void t3() {
    
    }
}
