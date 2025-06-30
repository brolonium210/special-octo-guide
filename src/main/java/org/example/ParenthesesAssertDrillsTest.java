package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParenthesesAssertDrillsTest {

    @Test public void testGetStaticFoo() {
        assertEquals(1, ParenthesesAssertDrills.getStaticFoo());
    }

    @Test public void testGetLocalFoo() {
        assertEquals(10, ParenthesesAssertDrills.getLocalFoo());
    }

    @Test public void testCompareFoos() {
        assertTrue(ParenthesesAssertDrills.compareFoos(10));
    }

    @Test public void testExpressionReturns10() {
        assertEquals(10, ParenthesesAssertDrills.expressionReturns10(0));
    }

    @Test public void testTestAssertion() {
        assertTrue(ParenthesesAssertDrills.testAssertion(10, 10));
    }

    @Test public void testGetExpectedValue() {
        assertEquals(10, ParenthesesAssertDrills.getExpectedValue(0) + 0);
        assertEquals(11, ParenthesesAssertDrills.getExpectedValue(1) + 1);
        assertEquals(12, ParenthesesAssertDrills.getExpectedValue(2) + 2);
        assertEquals(13, ParenthesesAssertDrills.getExpectedValue(3) + 3);
    }

    @Test public void testShadowingTest() {
        assertEquals(11, ParenthesesAssertDrills.shadowingTest(10));
    }

    @Test public void testSumLocalAndStatic() {
        assertEquals(11, ParenthesesAssertDrills.sumLocalAndStatic(10));
    }
}

