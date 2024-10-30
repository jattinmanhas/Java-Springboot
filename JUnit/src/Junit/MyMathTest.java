package Junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {
    private MyMath math = new MyMath();

    @Test
    void calculateSum() {
        int result = math.calculateSum(new int[]{1,2,3});

        int expectedResult = 6;

        assertEquals(expectedResult, result);
        // Absence of Failure is Success...
        // Test Condition or Assert to check behaviour of application
//        fail("Not yet Implemented");
    }

    @Test
    void calculateSumEmptyArray() {
        int result = math.calculateSum(new int[]{});

        int expectedResult = 0;

        assertEquals(expectedResult, result);
    }
}