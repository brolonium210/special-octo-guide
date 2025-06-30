package org.example;

import java.util.*;
import java.util.stream.IntStream;

public class ScoreDifferenceWarmupDrills {

    // 1. Return a sorted version of the array
    public static int[] sortedArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }

    // 2. Return min and max from a list
    public static int[] findMinMax(List<Integer> scores) {
        int myMin = Collections.min(scores);
        int myMax = Collections.max(scores);
        int[]myArr = new int[2];
        myArr[0] = myMin;
        myArr[1] = myMax;
        return myArr;
    }

    // 3. Return sublist from index i to i+k (exclusive)
    public static List<Integer> slice(List<Integer> list, int i, int k) {
        List<Integer> myList = list.subList(i,k+1);

        return myList;
    }

    // 4. Loop through sorted array using window size k
    public static List<List<Integer>> slidingWindows(int[] sorted, int k) {
        List<List<Integer>> myListList = new ArrayList<>();
        List<Integer> mySorted = IntStream.of(sorted).boxed().toList();
        int trueStop = mySorted.size()-(k-1);
        for(int i=0;i<trueStop;i++){
            myListList.add(mySorted.subList(i,i+k));
        }
        return myListList;
    }

    // 5. Return max - min of an array
    public static int range(int[] nums) {
        List<Integer>myList = new ArrayList<>();
        myList = IntStream.of(nums).boxed().toList();
        int myMin = Collections.min(myList);
        int myMax = Collections.max(myList);

        return myMax - myMin;
    }

    // 6. If k == 1, return 0
    public static int handleSingleStudentCase(int[] nums, int k) {
        // TODO: Implement
        return -1;
    }

    // 7. Return smallest diff between adjacent elements in sorted array
    public static int minAdjacentDifference(int[] sorted) {
        int minDiff = 100000;
        List<Integer>myList = new ArrayList<>();
        myList = IntStream.of(sorted).boxed().toList();
        for(int i=1;i<sorted.length;i++){
            int temp = Math.abs(sorted[i]-sorted[i-1]);
            if(temp < minDiff){
                minDiff = temp;
            }
        }

        return minDiff;
    }

    // 8. Convert int[] to List<Integer>
    public static List<Integer> toIntegerList(int[] nums) {




        return null;
    }
}

