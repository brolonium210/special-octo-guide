package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GoodSubstringWarmupDrills {

    // 1. Extract all substrings of length 3
    public static List<String> extractLength3Substrings(String s) {
        List<String> myList = new ArrayList<>();
        for(int i=0;i<s.length()-2;i++){
            myList.add(s.substring(i,i+3));
        }
        return myList;
    }

    // 2. Check if 3 characters are all unique
    public static boolean areThreeCharsUnique(char a, char b, char c) {
        Set<Character> mySet = new HashSet<>();
        mySet.add(a);
        mySet.add(b);
        mySet.add(c);
        return mySet.size() == 3;
    }

    // 3. Return character at index if safe, else 'X'
    public static char safeCharAt(String s, int index) {
        if(index >= s.length()){
            return 'X';
        }else{
            return s.charAt(index);
        }
    }

    // 4. Store all substrings of length k in a list
    public static List<String> collectSubstrings(String s, int k) {
        if(s.length() < k){
            return null;
        }
        List<String> myList = new ArrayList<>();
        int trueStop = s.length()-(k-1);
        for(int i=0;i<trueStop;i++){
            myList.add(s.substring(i,i+k));
        }

        return myList;
    }

    // 5. Try adding 3 elements to a Set and check size
    public static boolean areThreeElementsUnique(char a, char b, char c) {
        Set<Character> mySet = new HashSet<>();
        mySet.add(a);
        mySet.add(b);
        mySet.add(c);
        return mySet.size() == 3;
    }

    // 6. Return number of windows of size 3
    public static int countWindowsOfThree(String s) {
        int trueStop = s.length()-(3);
        int count = 0;
        for(int i=0;i<trueStop;i++){
            count++;
        }
        return count;
    }

    // 7. Count how many times a pattern appears in s
    public static int countOccurrences(String s, String pattern) {
        int pLen = pattern.length();
        int trueStop = s.length()-(pLen-1);
        int count = 0;
        for(int i=0;i<trueStop;i++){
            String temp = s.substring(i,i+pLen);
            if(temp.equals(pattern)){
                count++;
            }
        }
        return count;
    }

    // 8. Return true if string has at least 3 characters
    public static boolean isValidInput(String s) {
        // TODO: Implement



        return s.length()>=3;
    }
}
