package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {

    // 静态内部类Calc
    public static class Calc {
        public int subtract(int a, int b) {
            return a - b; // 实现subtract方法
        }

        public int add(int a, int b) {
            return a + b; // 实现add方法
        }
    }

    Calc c = new Calc(); // 使用静态内部类的实例

    @Test
    void testAddition() {
        assertEquals(4, c.add(2, 2));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, c.subtract(4, 2));
    }
}