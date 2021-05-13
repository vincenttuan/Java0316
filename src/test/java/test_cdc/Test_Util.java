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
}
