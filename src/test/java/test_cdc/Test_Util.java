package test_cdc;

import com.lab.cdc.CDC;
import com.lab.cdc.Util;
import org.junit.Test;

public class Test_Util {
    
    @Test
    public void test_getJson() throws Exception {
        String json = Util.getJson();
        System.out.println(json);
    }
    
    @Test
    public void test_getCdcs() throws Exception {
        CDC[] cdcs = Util.getCdcs();
        System.out.println(cdcs.length);
    }
    
    @Test
    public void test_distance() {
        String circle = "22.39,114.12";
        String tw     = "24.0,121.0";
        double m = Util.distance(circle, tw);
        System.out.printf("%.2f km\n", m/1000);
    }
}
