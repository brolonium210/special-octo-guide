package org.example;

import java.util.*;

public class PrimeFrequencyWarmupDrills {

    // 1. Count frequencies of elements
    public static Map<Integer, Integer> countFrequencies(int[] nums) {
        Map<Integer,Integer> myMap = new HashMap<>();
        for(Integer n:nums){
            int temp = myMap.getOrDefault(n,0);
            if(temp == 0){
                myMap.put(n,1);
            }else{
                myMap.put(n,temp+1);
            }
        }
        return myMap;
    }

    // 2. Return all frequency values from map
    public static List<Integer> getFrequencies(Map<Integer, Integer> freqMap) {
        List<Integer> myList = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:freqMap.entrySet()){
            myList.add(e.getValue());
        }
        return myList;
    }

    // 3. Check if a number is prime
    public static boolean isPrime(int n) {
        if(n == 1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    // 4. Check if number is greater than 1
    public static boolean isGreaterThanOne(int n) {


        return n>1;
    }

    // 5. Safely increment map count using getOrDefault
    public static void addToMap(Map<Integer, Integer> map, int key) {
        int temp = map.getOrDefault(key,0);
        if(temp==0){
            map.put(key,1);
        }else{
            map.put(key,temp+1);
        }
    }

    // 6. Populate a frequency map from an array
    public static Map<Integer, Integer> buildFrequencyMap(int[] nums) {


        return null;
    }

    // 7. Return true if any frequency is prime
    public static boolean anyFrequencyIsPrime(List<Integer> freqs) {
        // TODO: Implement
        return false;
    }

    // 8. Return false if all frequencies are non-prime
    public static boolean noneArePrime(List<Integer> freqs) {
        Map<Integer,Integer> myMap = new HashMap<>();

        return false;
    }
}

