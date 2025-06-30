package org.example;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class KBeautyWarmupDrillsTest {

    @Test
    public void testToString() {
        assertEquals("240", KBeautyWarmupDrills.toString(240));
    }

    @Test
    public void testSubstringsOfLengthK() {
        List<String> expected = List.of("24", "40");
        assertEquals(expected, KBeautyWarmupDrills.substringsOfLengthK("240", 2));
    }

    @Test
    public void testSafeParseInt() {
        assertEquals(40, KBeautyWarmupDrills.safeParseInt("40"));
    }

    @Test
    public void testIsDivisible() {
        assertTrue(KBeautyWarmupDrills.isDivisible(240, 40));
        assertFalse(KBeautyWarmupDrills.isDivisible(240, 13));
    }

    @Test
    public void testSafeDivideCheck() {
        assertTrue(KBeautyWarmupDrills.safeDivideCheck(10));
        assertFalse(KBeautyWarmupDrills.safeDivideCheck(0));
    }

    @Test
    public void testCountDivisors() {
        List<Integer> divisors = List.of(10, 12, 20, 24);
        assertEquals(2, KBeautyWarmupDrills.countDivisors(240, divisors));
    }

    @Test
    public void testParseWithLeadingZeros() {
        assertEquals(9, KBeautyWarmupDrills.parseWithLeadingZeros("09"));
    }

    @Test
    public void testIsValidLength() {
        assertTrue(KBeautyWarmupDrills.isValidLength("240", 2));
        assertFalse(KBeautyWarmupDrills.isValidLength("5", 2));
    }
}
