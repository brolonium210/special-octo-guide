package org.example;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class InverseCoinWarmupDrillsTest {

    @Test
    public void testInitDP() {
        int[] result = InverseCoinWarmupDrills.initDP(5);
        assertEquals(1, result[0]);
        for (int i = 1; i < 5; i++) {
            assertEquals(0, result[i]);
        }
    }

    @Test
    public void testApplyCoin() {
        int[] ways = new int[6];
        ways[0] = 1;
        InverseCoinWarmupDrills.applyCoin(ways, 2);
        assertEquals(1, ways[2]);
        assertEquals(1, ways[4]);
    }

    @Test
    public void testCopyArray() {
        int[] original = {1, 2, 3};
        int[] copy = InverseCoinWarmupDrills.copyArray(original);
        assertArrayEquals(original, copy);
        assertNotSame(original, copy);
    }

    @Test
    public void testSubtractArrays() {
        int[] a = {5, 4, 3};
        int[] b = {1, 1, 1};
        int[] result = InverseCoinWarmupDrills.subtractArrays(a, b);
        assertArrayEquals(new int[]{4, 3, 2}, result);
    }

    @Test
    public void testZeroPositions() {
        int[] input = {0, 1, 0, 2};
        List<Integer> result = InverseCoinWarmupDrills.zeroPositions(input);
        assertEquals(List.of(0, 2), result);
    }

    @Test
    public void testAddArrays() {
        int[] a = {1, 2, 3};
        int[] b = {3, 2, 1};
        int[] result = InverseCoinWarmupDrills.addArrays(a, b);
        assertArrayEquals(new int[]{4, 4, 4}, result);
    }

    @Test
    public void testSimulateSingleCoin() {
        int[] result = InverseCoinWarmupDrills.simulateSingleCoin(7, 2);
        assertEquals(1, result[0]);
        assertEquals(1, result[2]);
        assertEquals(1, result[4]);
        assertEquals(1, result[6]);
    }

    @Test
    public void testSimulateWithCoins() {
        List<Integer> coins = List.of(2, 4);
        int[] result = InverseCoinWarmupDrills.simulateWithCoins(9, coins);
        assertEquals(1, result[0]);
        assertEquals(1, result[2]);
        assertEquals(1, result[4]);
        assertEquals(2, result[6]); // 2+2+2, 2+4
        assertEquals(2, result[8]); // 4+4, 2+2+4
    }

    @Test
    public void testExample1() {
        // Arrange
        int[] numWays = {0, 1, 0, 2, 0, 3, 0, 4, 0, 5};  // Example input

        // Act
        List<Integer> result = InverseCoinWarmupDrills.findCoins(numWays);

        // Assert
        List<Integer> expected = List.of(1, 3, 5);  // Based on i % numWays[i] == 0
        assertEquals(expected, result);
    }

    @Test
    public void testWithZerosOnly() {
        int[] numWays = {0, 0, 0, 0, 0};
        List<Integer> result = InverseCoinWarmupDrills.findCoins(numWays);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testWithOnesOnly() {
        int[] numWays = {1, 1, 1, 1, 1};
        List<Integer> result = InverseCoinWarmupDrills.findCoins(numWays);
        List<Integer> expected = List.of(1, 2, 3, 4);
        assertEquals(expected, result);
    }

    @Test
    public void testWithNoValidCoins() {
        int[] numWays = {0, 2, 3, 4, 5};  // None of these satisfy i % numWays[i] == 0
        List<Integer> result = InverseCoinWarmupDrills.findCoins(numWays);
        assertTrue(result.isEmpty());
    }

}
