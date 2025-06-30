package org.example;

import java.util.*;

public class KBeautyWarmupDrills {

    // 1. Convert int to String
    public static String toString(int num) {
        return Integer.toString(num);
    }

    // 2. Return all substrings of length k
    public static List<String> substringsOfLengthK(String s, int k) {
        int trueStop = s.length()-(k-1);
        List<String> myList = new ArrayList<>();
        for(int i=0;i<trueStop;i++){
            myList.add(s.substring(i,i+k));
        }
        return myList;
    }

    // 3. Convert String to int safely
    public static int safeParseInt(String s) {

        return Integer.parseInt(s);
    }

    // 4. Return true if a is divisible by b
    public static boolean isDivisible(int a, int b) {
        if(a%b == 0){
            return true;
        }else{
            return false;
        }
    }

    // 5. Return false if divisor is 0
    public static boolean safeDivideCheck(int divisor) {
        if(divisor == 0){
            return false;
        }else{
            return true;
        }
    }

    // 6. Count how many numbers divide the target
    public static int countDivisors(int target, List<Integer> divisors) {
        int total = 0;
        for(int i:divisors){
            if(target % i == 0){
                total++;
            }
        }
        return total;
    }

    // 7. Parse substrings with leading zeros
    public static int parseWithLeadingZeros(String s) {
        // TODO: Implement
        return -1;
    }

    // 8. Return 0 if length < k
    public static boolean isValidLength(String s, int k) {
        // TODO: Implement
        return false;
    }
}
