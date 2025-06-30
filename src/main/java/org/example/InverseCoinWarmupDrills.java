package org.example;

import java.util.*;

public class InverseCoinWarmupDrills {

    // 1. Initialize DP array with base case
    public static int[] initDP(int size) {
        int[]myWays = new int[size];
        myWays[0] = 1;
        return myWays;
    }

    // 2. Simulate one round of DP update with coin c
    public static void applyCoin(int[] ways, int coin) {
        for(int i=1;i<ways.length;i++){
            if(i%coin == 0){
                ways[i] += 1;
            }
        }
    }

    // 3. Copy an array
    public static int[] copyArray(int[] original) {

        return Arrays.copyOf(original,original.length);
    }

    // 4. Subtract two arrays element-wise
    public static int[] subtractArrays(int[] a, int[] b) {
        int myLen = Math.max(a.length,b.length);
        int[] myArr = new int[myLen];
        for(int i=0;i<myLen;i++){
            myArr[i] = a[i] - b[i];
        }
        return myArr;
    }

    // 5. Get all indexes where value == 0
    public static List<Integer> zeroPositions(int[] arr) {
        List<Integer> myList = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                myList.add(i);
            }
        }
        return myList;
    }

    // 6. Add two arrays element-wise
    public static int[] addArrays(int[] a, int[] b) {
        int tempLen = a.length;
        int[] c = new int[tempLen];
        for(int i=0;i<tempLen;i++){
            c[i] = a[i]+b[i];
        }

        return c;
    }

    // 7. Build ways[] using just one coin
    public static int[] simulateSingleCoin(int size, int coin) {
        int[] ways = new int[size];
        ways[0] = 1;
        for(int i = coin;i<size;i++){
            ways[i] += ways[i-coin];
        }

        return ways;
    }

    // 8. Try building result using candidate set
    public static int[] simulateWithCoins(int size, List<Integer> coins) {
        int[] ways = new int[size];
        int[] temp = new int[size];
        ways[0] = 1;
        temp[0] = 1;

        for(int c:coins) {
            for (int i = 1; i < size; i++) {
                if (i % c == 0) {
                    temp[i] += 1;
                }
            }

            for(int j = 1;j<size;j++){
                ways[j] += temp[j];
            }
            temp = new int[size];
        }

        return ways;
    }

    public static List<Integer> findCoins(int[] numWays) {
        int size = numWays.length;
        int[] myWays = new int[size+1];
        myWays[0] = 1;
        List<Integer> myCoins = new ArrayList<>();
        int currCoin = 0;

        for(int i=0;i<size;i++){
            myWays[i+1] = numWays[i];
        }

        boolean done = false;

        while(!done) {
            for (int i = 1; i < size + 1; i++) {
                if (myWays[i] == 1) {
                    myCoins.add(i);
                    currCoin = i;
                    break;
                }
            }

            int[] temp = new int[size + 1];
            temp[0] = 1;

            for (int i = currCoin; i < size + 1; i++) {
                temp[i] = temp[i - currCoin];
            }

            for (int i = 1; i < size + 1; i++) {
                myWays[i] -= temp[i];
            }
            int count = 1;
            for (int i = 1; i < size + 1; i++) {
                if(myWays[i] == 0){
                   count++;
                }
            }
            if(count == size+1){
                done = true;
            }else{
                done = false;
            }
        }




        return myCoins;
    }


}
