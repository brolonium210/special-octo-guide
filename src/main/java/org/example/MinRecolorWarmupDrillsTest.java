package org.example;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class MinRecolorWarmupDrillsTest {

    @Test
    public void testCountWhite() {
        assertEquals(3, MinRecolorWarmupDrills.countWhite("WBBWW"));
    }

    @Test
    public void testGetSubstring() {
        assertEquals("BBW", MinRecolorWarmupDrills.getSubstring("WBBWWBB", 2, 3));
    }

    @Test
    public void testAllWindows() {
        List<String> expected = List.of("WBB", "BBW", "BWW", "WWB", "WBB");
        assertEquals(expected, MinRecolorWarmupDrills.allWindows("WBBWWBB", 3));
    }

    @Test
    public void testFindMin() {
        assertEquals(1, MinRecolorWarmupDrills.findMin(List.of(3, 2, 1, 4)));
    }

    @Test
    public void testIsWhite() {
        assertTrue(MinRecolorWarmupDrills.isWhite('W'));
        assertFalse(MinRecolorWarmupDrills.isWhite('B'));
    }

    @Test
    public void testCountNonBlack() {
        assertEquals(2, MinRecolorWarmupDrills.countNonBlack("WBWBB"));
    }

    @Test
    public void testIsValidInput() {
        assertTrue(MinRecolorWarmupDrills.isValidInput("WBBWW", 3));
        assertFalse(MinRecolorWarmupDrills.isValidInput("WB", 3));
    }

    @Test
    public void testSumPositive() {
        assertEquals(7, MinRecolorWarmupDrills.sumPositive(List.of(1, -2, 3, 0, 3)));
    }

    @Test
    public void testCountWhiteInWindows() {
        List<Integer> expected = List.of(1, 1, 2, 2, 1);
        assertEquals(expected, MinRecolorWarmupDrills.countWhiteInWindows("WBBWWBB", 3));
    }

    @Test
    public void testMinWhiteInWindows() {
        assertEquals(1, MinRecolorWarmupDrills.minWhiteInWindows("WBBWWBB", 3));
    }

    @Test
    public void testHasAllBlackWindow() {
        assertTrue(MinRecolorWarmupDrills.hasAllBlackWindow("BBBBBB", 4));
        assertFalse(MinRecolorWarmupDrills.hasAllBlackWindow("WBBWWBB", 4));
    }

    @Test
    public void testMinimumRecolors() {
        assertEquals(3, MinRecolorWarmupDrills.minimumRecolors("WBBWWBBWBW", 7));
        assertEquals(0, MinRecolorWarmupDrills.minimumRecolors("BBBBBBB", 7));
    }
}

