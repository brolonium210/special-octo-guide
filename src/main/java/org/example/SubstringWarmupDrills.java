package org.example;
import java.io.*;
import java.util.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SubstringWarmupDrills {

    // 1. Count how many times each character appears in a string using Map
    public static Map<Character, Integer> charFrequency(String input) {
        Map<Character, Integer> myMap = new HashMap<>();
        char[] ch = input.toCharArray();
        for(char c:ch){
            int temp = myMap.getOrDefault(c,0);
            temp++;
            myMap.put(c,temp);
        }
        return myMap;
    }

    // 2. Check if a string has all unique characters using Set
    public static boolean allUniqueCharacters(String input) {
        // TODO: Implement
        Set<Character> mySet = new HashSet<>();

        for(int i=0;i<input.length();i++){
            mySet.add(input.charAt(i));
        }

        int temp2 = mySet.size();
        int temp3 = input.length();

        return temp2 == temp3;
    }

    // 3. Return all substrings of length k from a string
    public static List<String> substringsOfLengthK(String input, int k) {
        // TODO: Implement
        char[] myArr1 = new char[k];
        char[] myArr2 = input.toCharArray();
        List<String> myList = new ArrayList<>();

        for(int i=0;i<(input.length()-(k-1));i++){
            String mySub = input.substring(i,i+k);
            myList.add(mySub);
        }
        return myList;
    }

    // 4. Use a Deque to simulate a fixed-size sliding window
    public static List<Character> simulateWindow(String input, int windowSize) {
        // TODO: Implement
        Deque<Character> dq = new ArrayDeque<>();
        char[] ch = input.toCharArray();
        List<Character> myList = new ArrayList<>();

        for(char c:ch){
            if(dq.size() >= windowSize){
                dq.removeLast();
                dq.addFirst(c);
            }else{
                dq.addFirst(c);
            }
        }
        myList.addAll(dq);

        return myList;
    }

    // 5. Practice putIfAbsent, getOrDefault, containsKey with Map
    public static boolean testMapMethods(String input) {
        // TODO: Implement
        Map<Integer,Character> myMap = new HashMap<>();
        char[] myArr = input.toCharArray();
        for(char c:myArr){
            myMap.putIfAbsent((int)c,c);
        }
        return true;
    }

    // 6. Practice HashSet add, contains, remove to count duplicates
    public static int countRemovableDuplicates(String input) {
        // TODO: Implement
        char[] ch = input.toCharArray();
        Set<Character> mySet = new HashSet<>();

        for(char c:ch){
            mySet.add(c);
        }
        return input.length() - mySet.size();
    }

    // 7. Calculate max ASCII sum in any window of size k
    public static int manualWindowMax(String input, int windowSize) {
        // TODO: Implement
        Deque<Character> dq = new ArrayDeque<>();
        char[] ch = input.toCharArray();
        int maxVal = 0;
        int tempVal = 0;
        for(char c:ch){
            if(dq.size() >= windowSize){
                tempVal -= (int)dq.pollLast();
                tempVal += (int)c;
                dq.addFirst(c);
            }else{
                dq.addFirst(c);
                tempVal += (int)c;
            }
            if(tempVal >= maxVal){
                maxVal = tempVal;
            }
        }
        return maxVal;
    }

    // 8. Return all possible substrings using substring(start, end)
    public static List<String> extractSubstrings(String input) {
        // TODO: Implement
        int start =0;
        int end = input.length();
        List<String> myList = new ArrayList<>();

        for(int i = start;i<end;i++){
            if(start != i){
            myList.add(input.substring(start,i));
            }
            myList.add(input.substring(i,end));
        }

        return myList;
    }

    // 9. Longest prefix of unique characters starting at index 0
    public static int longestUniqueFromStart(String input) {
        // TODO: Implement
        int maxVal = 0;
        int start = 0;
        for(int i=0;i<input.length();i++){
            String myString = input.substring(start,i);
            if(myString.contains(input.substring(i,i+1))){
                start = i;
            }
            if(myString.length() > maxVal){
                maxVal = myString.length();
            }
        }

        return maxVal;
    }

    // 10. Sliding window: shrink on duplicate character
    public static int slidingWindowLength(String input) {
        // TODO: Implement
        int maxVal = 0;
        int start = 0;
        for(int i=0;i<input.length();i++){
            String myString = input.substring(start,i);
            if(myString.contains(input.substring(i,i+1))){
                start = i;
            }
            if(myString.length() > maxVal){
                maxVal = myString.length();
            }
        }

        return maxVal;

    }

    // 11. Use Map to track last seen index and update window
    public static int longestWithLastSeenMap(String input) {
        // TODO: Implement
        Map<Character,Integer> myMap = new HashMap<>();
        char[] ch = input.toCharArray();
        for(int i=0;i<input.length();i++){
            int temp = myMap.getOrDefault(input.charAt(i),0);
            if(temp == 0){
                myMap.put(input.charAt(i),i);
            }else{
                myMap.put(input.charAt(i),i);
            }
        }
        int maxVal = 0;
        for(Map.Entry<Character,Integer> m:myMap.entrySet()){
            if(m.getValue() > maxVal){
                maxVal = m.getValue();
            }
        }


        return maxVal;
    }

    // 12. Validate window of size k contains only unique characters
    public static boolean hasUniqueWindow(String input, int k) {
        // TODO: Implement
        int start = 0;
        int maxVal = 0;
        List<String> myList = new ArrayList<>();
        for(int i=0;i<input.length()-k;i++){
            String temp = input.substring(i,i+k);
            char[] ch = temp.toCharArray();
            Set<Character> mySet = new HashSet<>();
            for(char c:ch){
                mySet.add(c);
            }
            if(mySet.size() != temp.length()){
                return false;
            }else{
                myList.add(temp);
                }
        }

        return true;
    }

    // 13. Optimize window start using Map of last seen characters
    public static int optimizedStartIndex(String input) {
        // TODO: Implement
        Map<Character,Integer> myMap = new HashMap<>();
        int mindex = 1000;
        char[] ch = input.toCharArray();
        for(int i=0;i<ch.length;i++){
            myMap.put(ch[i],i);
        }
        for(Map.Entry<Character,Integer> e:myMap.entrySet()){
            if(e.getValue() < mindex){
                mindex = e.getValue();
            }
        }


        return mindex;
    }

    // 14. Handle empty string, 1-char string, and normal input
    public static int longestEdgeCases(String input) {
        // TODO: Implement
        return 0;
    }

    // 15. Return all sliding window snapshots of size k
    public static List<String> windowSnapshots(String input, int k) {
        // TODO: Implement
        return null;
    }

    // 16. LeetCode #3: Longest substring without repeating characters
    public static int lengthOfLongestSubstring(String s) {
        // TODO: Implement
        int maxVal = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            String current = s.substring(start, i);
            if (current.contains(s.substring(i, i + 1))) {
                start++;  // move start forward by one
                i = start - 1;  // reset i to re-check from new start
                continue;
            }
            maxVal = Math.max(maxVal, i - start + 1);
        }

        return maxVal;
    }
}

