package org.example;


import java.util.*;

public class MinRecolorWarmupDrills {

    // 1. Count number of 'W' in a string
    public static int countWhite(String s) {
        char[] ch = s.toCharArray();
        int count =0;
        for(char c:ch){
            if(c == 'W'){
                count++;
            }
        }

        return count;
    }

    // 2. Return substring of length k from index i
    public static String getSubstring(String s, int i, int k) {


        return s.substring((i-1),(i-1)+k);
    }

    // 3. Loop over string with fixed window size k
    public static List<String> allWindows(String s, int k) {
        List<String> myList = new ArrayList<>();
        for(int i=0;i<(s.length()-(k-1));i++){
            myList.add(s.substring(i,i+k));
        }
        return myList;
    }

    // 4. Track minimum value in list
    public static int findMin(List<Integer> values) {

        return Collections.min(values);
    }

    // 5. Return true if char is white
    public static boolean isWhite(char c) {


        return c=='W';
    }

    // 6. Count non-'B' characters in string
    public static int countNonBlack(String s) {
        char[] ch = s.toCharArray();
        int count = 0;
        for(char c:ch){
            if(c != 'B'){
                count++;
            }
        }


        return count;
    }

    // 7. Return true if input is long enough
    public static boolean isValidInput(String s, int k) {
        return s.length() >= k;
    }

    // 8. Sum up values > 0 in list
    public static int sumPositive(List<Integer> values) {
        int count = 0;
        for(Integer i:values){
            if(i>0){
                count += i;
            }
        }

        return count;
    }

    // 9. Count 'W' in every window of size k
    public static List<Integer> countWhiteInWindows(String blocks, int k) {

        List<Integer> myList = new ArrayList<>();

        int trueStop = blocks.length()-(k-1);

        for(int i=0;i<trueStop;i++){
            String temp = blocks.substring(i,i+k);
            int count = 0;
            char[] ch = temp.toCharArray();
            for(char c:ch){
                if(c == 'W'){
                    count++;
                }
            }
            myList.add(count);
        }

        return myList;
    }

    // 10. Find minimum 'W' count across all windows
    public static int minWhiteInWindows(String blocks, int k) {
        List<Integer> myList = countWhiteInWindows(blocks, k);


        return Collections.min(myList);
    }

    // 11. Return true if any window is all 'B'
    public static boolean hasAllBlackWindow(String blocks, int k) {
        List<Integer> myList = countWhiteInWindows(blocks, k);
        int temp = Collections.min(myList);

        return temp==0;
    }

    // 12. Final solution: minimum recolors to get k black blocks
    public static int minimumRecolors(String blocks, int k) {
        List<Integer> myList = countWhiteInWindows(blocks, k);
        int temp = Collections.min(myList);


        return temp;
    }
}
