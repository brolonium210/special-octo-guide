package org.example;

import org.junit.jupiter.api.Test;

import java.util.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class SubstringWarmupDrillsTest {

    @Test
    public void testCharFrequency() {
        Map<Character, Integer> expected = Map.of('a', 2, 'b', 1);
        assertEquals(expected, SubstringWarmupDrills.charFrequency("aba"));
    }

    @Test
    public void testAllUniqueCharacters() {
        assertTrue(SubstringWarmupDrills.allUniqueCharacters("abc"));
        assertFalse(SubstringWarmupDrills.allUniqueCharacters("aabc"));
    }

    @Test
    public void testSubstringsOfLengthK() {
        List<String> expected = List.of("he", "el", "ll", "lo");
        assertEquals(expected, SubstringWarmupDrills.substringsOfLengthK("hello", 2));
    }

    @Test
    public void testSimulateWindow() {
        List<Character> expected = List.of('a', 'b', 'c');
        assertEquals(expected, SubstringWarmupDrills.simulateWindow("abcdef", 3));
    }

    @Test
    public void testMapMethods() {
        assertTrue(SubstringWarmupDrills.testMapMethods("aba"));
    }

    @Test
    public void testCountRemovableDuplicates() {
        assertEquals(3, SubstringWarmupDrills.countRemovableDuplicates("banana"));
    }

    @Test
    public void testManualWindowMax() {
        assertEquals('d' + 'e', SubstringWarmupDrills.manualWindowMax("abcde", 2));
    }

    @Test
    public void testExtractSubstrings() {
        List<String> expected = List.of("a", "ab", "b");
        assertEquals(expected, SubstringWarmupDrills.extractSubstrings("ab"));
    }

    @Test
    public void testLongestUniqueFromStart() {
        assertEquals(3, SubstringWarmupDrills.longestUniqueFromStart("abcabcbb"));
        assertEquals(1, SubstringWarmupDrills.longestUniqueFromStart(" "));
    }

    @Test
    public void testSlidingWindowLength() {
        assertEquals(3, SubstringWarmupDrills.slidingWindowLength("abcabcbb"));
    }

    @Test
    public void testLongestWithLastSeenMap() {
        assertEquals(3, SubstringWarmupDrills.longestWithLastSeenMap("abcabcbb"));
    }

    @Test
    public void testHasUniqueWindow() {
        assertTrue(SubstringWarmupDrills.hasUniqueWindow("abcdef", 3));
        assertFalse(SubstringWarmupDrills.hasUniqueWindow("abca", 3));
    }

    @Test
    public void testOptimizedStartIndex() {
        assertEquals(3, SubstringWarmupDrills.optimizedStartIndex("abcabcbb"));

    }

    @Test
    public void testLongestEdgeCases() {
        assertEquals(0, SubstringWarmupDrills.longestEdgeCases(""));
        assertEquals(1, SubstringWarmupDrills.longestEdgeCases("a"));
        assertEquals(3, SubstringWarmupDrills.longestEdgeCases("abcabcbb"));
    }

    @Test
    public void testWindowSnapshots() {
        List<String> expected = List.of("abc", "bcd", "cde");
        assertEquals(expected, SubstringWarmupDrills.windowSnapshots("abcde", 3));
    }

    @Test
    public void testLengthOfLongestSubstring() {
        assertEquals(3, SubstringWarmupDrills.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, SubstringWarmupDrills.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, SubstringWarmupDrills.lengthOfLongestSubstring("pwwkew"));
        assertEquals(1, SubstringWarmupDrills.lengthOfLongestSubstring(" "));
    }
}
