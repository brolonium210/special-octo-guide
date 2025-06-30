package org.example;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class GoodSubstringWarmupDrillsTest {

    @Test
    public void testExtractLength3Substrings() {
        List<String> expected = List.of("abc", "bcd", "cde");
        assertEquals(expected, GoodSubstringWarmupDrills.extractLength3Substrings("abcde"));
    }

    @Test
    public void testAreThreeCharsUnique() {
        assertTrue(GoodSubstringWarmupDrills.areThreeCharsUnique('a', 'b', 'c'));
        assertFalse(GoodSubstringWarmupDrills.areThreeCharsUnique('a', 'a', 'c'));
    }

    @Test
    public void testSafeCharAt() {
        assertEquals('c', GoodSubstringWarmupDrills.safeCharAt("abc", 2));
        assertEquals('X', GoodSubstringWarmupDrills.safeCharAt("ab", 2));
    }

    @Test
    public void testCollectSubstrings() {
        List<String> expected = List.of("ab", "bc", "cd");
        assertEquals(expected, GoodSubstringWarmupDrills.collectSubstrings("abcd", 2));
    }

    @Test
    public void testAreThreeElementsUnique() {
        assertTrue(GoodSubstringWarmupDrills.areThreeElementsUnique('x', 'y', 'z'));
        assertFalse(GoodSubstringWarmupDrills.areThreeElementsUnique('x', 'y', 'x'));
    }

    @Test
    public void testCountWindowsOfThree() {
        assertEquals(3, GoodSubstringWarmupDrills.countWindowsOfThree("abcdef"));
        assertEquals(0, GoodSubstringWarmupDrills.countWindowsOfThree("ab"));
    }

    @Test
    public void testCountOccurrences() {
        assertEquals(2, GoodSubstringWarmupDrills.countOccurrences("ababc", "ab"));
        assertEquals(0, GoodSubstringWarmupDrills.countOccurrences("xyz", "ab"));
    }

    @Test
    public void testIsValidInput() {
        assertTrue(GoodSubstringWarmupDrills.isValidInput("abc"));
        assertFalse(GoodSubstringWarmupDrills.isValidInput("a"));
    }
}
