package com.anupsaha.sorting;

import com.anupsaha.Constants;

public class CountingSort {
    public static void main(String[] args) {
        int[] intArray ={2,5,9,8,2,8,7,10,4,3};
        countingSort(intArray,1,10);
        Constants.printArray(intArray);
    }

    public static void countingSort(int[] input, int min, int max) {
        int[] countArray = new int[max - min + 1];

        for(int i : input){
            countArray[i - min]++;
        }
        int j = 0;
        for(int i = min; i <= max; i++){
            while(countArray[i-min] > 0){
                input[j++] = i;
                countArray[i - min]--;
            }

        }
    }
}
