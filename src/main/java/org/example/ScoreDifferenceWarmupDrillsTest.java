package org.example;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class ScoreDifferenceWarmupDrillsTest {

    @Test
    public void testSortedArray() {
        int[] result = ScoreDifferenceWarmupDrills.sortedArray(new int[]{3, 1, 2});
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    public void testFindMinMax() {
        List<Integer> scores = List.of(10, 40, 20);
        int[] result = ScoreDifferenceWarmupDrills.findMinMax(scores);
        assertArrayEquals(new int[]{10, 40}, result);
    }

    @Test
    public void testSlice() {
        List<Integer> list = List.of(1, 2, 3, 4);
        List<Integer> result = ScoreDifferenceWarmupDrills.slice(list, 1, 2);
        assertEquals(List.of(2, 3), result);
    }

    @Test
    public void testSlidingWindows() {
        int[] input = {1, 2, 3, 4};
        List<List<Integer>> result = ScoreDifferenceWarmupDrills.slidingWindows(input, 2);
        List<List<Integer>> expected = List.of(List.of(1, 2), List.of(2, 3), List.of(3, 4));
        assertEquals(expected, result);
    }

    @Test
    public void testRange() {
        assertEquals(5, ScoreDifferenceWarmupDrills.range(new int[]{1, 6}));
    }

    @Test
    public void testHandleSingleStudentCase() {
        assertEquals(0, ScoreDifferenceWarmupDrills.handleSingleStudentCase(new int[]{90}, 1));
        assertEquals(-1, ScoreDifferenceWarmupDrills.handleSingleStudentCase(new int[]{90, 91}, 2));
    }

    @Test
    public void testMinAdjacentDifference() {
        assertEquals(1, ScoreDifferenceWarmupDrills.minAdjacentDifference(new int[]{1, 3, 4, 10}));
    }

    @Test
    public void testToIntegerList() {
        List<Integer> expected = List.of(3, 5, 7);
        assertEquals(expected, ScoreDifferenceWarmupDrills.toIntegerList(new int[]{3, 5, 7}));
    }
}
