package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class countSym {

    public countSym(int low, int high){
//1. Calculate number of digits for low and high.		use intStream.range output to an array
        List<Integer> myList = new ArrayList<>();
        myList = IntStream.range(low,high).filter(p->p%2==0).boxed().toList();
        System.out.println(myList);
    }

//
//
//
//2. Identify all even-digit numbers in range.		use stream.filter to remove odd numbers
//3. Loop through each even-digit number.
//            4. Split number into two halves.			split whole number into LinkedList using recursion
//5. Sum digits of the first half.
//            6. Sum digits of the second half.
//            7. Compare sums of both halves.
//8. Count if sums are identical.				compare and test
//9. Return the total count of symmetric numbers.		if true add 1 to out number
//10. Optimize for all even-digit numbers.





}
