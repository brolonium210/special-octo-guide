package org.example;

import java.util.*;

public class KDistantIndices {

    /**
     * Main method to return all k-distant indices in nums.
     * Search terms: Sliding window index range, Absolute difference in arrays
     *
     * we set k and key example 3 and 2
     * we cycle through i and j
     * each step we find the absolute value of i-j so 0-0 = 0 ,0-1 = 1
     * we then test if arr[j] equals key if true
     * then we test if absolute val of i-j is less than or equal to k
     * if both these are true we add this number to the list of k-distance terms
     *
     * find the
     *
     *
     *
     */
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        // TODO: Implement main logic
        return new ArrayList<>();
    }

    /**
     * Mini problem: Find all indices j such that nums[j] == key
     * Search term: Array element indexing
     */
    private List<Integer> findKeyIndices(int[] nums, int key) {
        return new ArrayList<>();
    }

    /**
     * Mini problem: Mark all indices i such that |i - j| <= k for a given j
     * Search term: Range marking in arrays
     */
    private Set<Integer> markKDistantIndices(List<Integer> keyIndices, int k, int n) {
        return new HashSet<>();
    }

    public static void main(String[] args) {
        KDistantIndices solver = new KDistantIndices();
        int[] nums = {3,4,9,1,3,9,5};
        int key = 9, k = 1;
        System.out.println(solver.findKDistantIndices(nums, key, k)); // Expected: [1,2,3,4,5,6]
    }
}
