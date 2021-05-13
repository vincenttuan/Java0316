package test_rice;

import com.lab.rice.Util;
import org.junit.Test;

public class Test_Util {
    @Test
    public void test_getJson() throws Exception {
        String json = Util.getJson();
        System.out.println(json);
    }
}
