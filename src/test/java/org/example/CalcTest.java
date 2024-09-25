package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }

    // 新增的测试用例
    @Test
    void testSubtraction() {
        // 检查subtract方法是否按预期工作
        assertEquals(2, c.subtract(4, 2));
    }

}




