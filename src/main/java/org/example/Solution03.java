package org.example;

public class Solution03 {

    public void duplicateZeros(int[] arr) {
        int dups = 0;
        int nLen = arr.length-1;
        for(int i=0;i<nLen;i++){
            if((arr[i] == 0) && (i < nLen-1)){
                dups++;
            }
        }



    }











    /*
    ### DRILLS

1. **Goal: Identify and count zeros in array**
   - Pseudocode:
     ```
     Init count = 0
     For each element num in arr
         If num is 0
             Increment count
     ```
*/
    void countZeros(){
        int[] myArr = {1,0,2};
        int total = 0;
        for(int num:myArr){
            if(num == 0){
                total++;
            }
        }
        System.out.println(total);
    }
/*
2. **Goal: Simulate how zero duplicates affect element positions**
   - Pseudocode:
     ```
     Init zeros = 0
     For i from 0 to length(arr) - 1
         If arr[i] is 0
             zeros += 1
             If shift + i >= length(arr)
                 Break
     ```

*/




    /*


3. **Goal: Modify array elements from back to front in-place**
   - Pseudocode:
     ```
     Init end = length(arr) - 1
     For i from end to 0
         If arr[i] is 0
             If end < length(arr) - 1
                 arr[end] = 0
                 end--
             arr[end] = 0
         Else
             arr[end] = arr[i]
         Decrement end
     ```

4. **Goal: Efficiently duplicate zeros with minimal space**
   - Pseudocode:
     ```
     Init zeros = countZeros(arr)
     Init i = length(arr) - 1
     while zeros > 0 and i >= 0
         If arr[i] is 0
             shift elements right twice
             i--
             zeros--
         Else
             shift elements right once
             i--
     ```




     */






}
