package org.example;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class CollectionsDrillsTests {

    @Test
    public void testReverseList() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4));
        CollectionsDrillsProblems.reverseList(list);
        assertEquals(List.of(4, 3, 2, 1), list);
    }

    @Test
    public void testRotateDequeRight() {
        Deque<Integer> dq = new ArrayDeque<>(List.of(1, 2, 3, 4));
        CollectionsDrillsProblems.rotateDequeRight(dq, 2);
        assertEquals(List.of(3, 4, 1, 2), new ArrayList<>(dq));
    }

    @Test
    public void testPrefixSums() {
        List<Integer> input = List.of(1, 2, 3, 4);
        List<Integer> result = CollectionsDrillsProblems.prefixSums(input);
        assertEquals(List.of(1, 3, 6, 10), result);
    }

    @Test
    public void testHasPairWithSum() {
        List<Integer> sorted = List.of(1, 2, 3, 4, 6);
        assertTrue(CollectionsDrillsProblems.hasPairWithSum(sorted, 7));
        assertFalse(CollectionsDrillsProblems.hasPairWithSum(sorted, 100));
    }

    @Test
    public void testFrequencyCount() {
        List<String> input = List.of("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Integer> result = CollectionsDrillsProblems.frequencyCount(input);
        assertEquals(3, result.get("apple"));
        assertEquals(2, result.get("banana"));
        assertEquals(1, result.get("orange"));
    }
}
