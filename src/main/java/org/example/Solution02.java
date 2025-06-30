package org.example;

public class Solution02 {
    int[] shifter(int[] inArr,int index){
        int nLength = inArr.length;
        int[] shifted = new int[nLength];

        for(int i=0;i<nLength;i++){
            if(i<index){
                shifted[i] = inArr[i];
            }
            if(i==index){
                shifted[i+1] = 0;
            }
            if(i>index){
                shifted[i] = inArr[i-1];
            }

        }
        return shifted;
    }




    public void duplicateZeros(int[] arr) {
            for(int i=arr.length-1;i>0;i--){
                if(arr[i-1] == 0){
                    arr[i] = 0;
                }
            }
    }


}
