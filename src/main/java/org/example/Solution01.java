package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Solution01 {

    public int countSymmetricIntegers(int low, int high) {
        List<Integer> myList = new ArrayList<>();
        int total = 0;
        myList = IntStream.rangeClosed(low, high).filter(p->p%2==0).boxed().toList();

        for (int num : myList) {
            List<Integer> tempList = new ArrayList<>();
            while (num > 0) {
                tempList.add(0,num % 10);
                num /= 10;
            }
            List<Integer> top = new ArrayList<>();
            List<Integer> bot = new ArrayList<>();
            bot = tempList.subList(0, tempList.size() / 2);
            top = tempList.subList(tempList.size() / 2, tempList.size());
            int topSum = 0;
            int botSum = 0;

            for (int n : top) {
                topSum += n;
            }
            for (int n : bot) {
                botSum += n;
            }
            if (topSum == botSum) {
                total++;
            }

        }
        return total;
    }
}