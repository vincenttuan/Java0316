package test_square;

import com.ocp.day29_assert.Square;
import junit.framework.Assert;
import org.junit.Test;

public class Test_Square {
    @Test
    public void t1() {
        // 測試要符合 3A
        // Arrange - 安排(目標物件)
        // Act - 目標方法
        // Assert - 驗證是否符合預期
        
        // 1. Arrange - 安排(目標物件)
        Square square = new Square();
        // 參數配置
        int top = 4;
        int bottom = 6;
        int h = 10;
        // 期望結果
        int exp = 50;
        // Act - 目標方法(實際得到的結果)
        int act = square.getArea(top, bottom, h);
        // Assert - 驗證是否符合預期
        Assert.assertEquals(exp, act);
        
    }
}
