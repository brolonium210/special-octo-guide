package org.example;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeFrequencyWarmupDrillsTest {

    @Test
    public void testCountFrequencies() {
        Map<Integer, Integer> expected = Map.of(1, 1, 2, 2, 3, 1);
        assertEquals(expected, PrimeFrequencyWarmupDrills.countFrequencies(new int[]{1, 2, 2, 3}));
    }

    @Test
    public void testGetFrequencies() {
        Map<Integer, Integer> map = Map.of(4, 2, 6, 3);
        List<Integer> result = PrimeFrequencyWarmupDrills.getFrequencies(map);
        assertTrue(result.containsAll(List.of(2, 3)));
    }

    @Test
    public void testIsPrime() {
        assertTrue(PrimeFrequencyWarmupDrills.isPrime(2));
        assertTrue(PrimeFrequencyWarmupDrills.isPrime(3));
        assertFalse(PrimeFrequencyWarmupDrills.isPrime(4));
        assertFalse(PrimeFrequencyWarmupDrills.isPrime(1));
    }

    @Test
    public void testIsGreaterThanOne() {
        assertTrue(PrimeFrequencyWarmupDrills.isGreaterThanOne(2));
        assertFalse(PrimeFrequencyWarmupDrills.isGreaterThanOne(1));
    }

    @Test
    public void testAddToMap() {
        Map<Integer, Integer> map = new HashMap<>();
        PrimeFrequencyWarmupDrills.addToMap(map, 5);
        PrimeFrequencyWarmupDrills.addToMap(map, 5);
        assertEquals(2, map.get(5));
    }

    @Test
    public void testBuildFrequencyMap() {
        Map<Integer, Integer> expected = Map.of(4, 2, 2, 3);
        assertEquals(expected, PrimeFrequencyWarmupDrills.buildFrequencyMap(new int[]{2, 2, 2, 4, 4}));
    }

    @Test
    public void testAnyFrequencyIsPrime() {
        assertTrue(PrimeFrequencyWarmupDrills.anyFrequencyIsPrime(List.of(1, 2, 4)));
        assertFalse(PrimeFrequencyWarmupDrills.anyFrequencyIsPrime(List.of(1, 4, 6)));
    }

    @Test
    public void testNoneArePrime() {
        assertTrue(PrimeFrequencyWarmupDrills.noneArePrime(List.of(1, 4, 6)));
        assertFalse(PrimeFrequencyWarmupDrills.noneArePrime(List.of(1, 2, 4)));
    }
}
