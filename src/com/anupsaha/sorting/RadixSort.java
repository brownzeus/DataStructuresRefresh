package com.anupsaha.sorting;

import com.anupsaha.Constants;

public class RadixSort {
    public static void main(String[] args) {
        int[] radixArray = {4725,4586,1330,8792,1594,5729};
        radixSort(radixArray, 10, 4);
        Constants.printArray(radixArray);
    }

    public static void radixSort(int[] radixArray, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(radixArray, i, radix);
        }
    }

    public static void radixSingleSort(int[] radixArray, int position, int radix) {
        int numItems = radixArray.length;
        int[] countArray = new int[radix];

        for(int value : radixArray){
            countArray[getDigit(position, value, radix)]++;
        }

        for(int j = 1; j < radix; j++){
            countArray[j] += countArray[j - 1];
        }
        int[] temp = new int[numItems];
        for(int tempIndex = numItems-1; tempIndex >= 0 ; tempIndex--){
            temp[--countArray[getDigit(position, radixArray[tempIndex], radix)]] = radixArray[tempIndex];
        }

        for(int tempIndex = 0; tempIndex < numItems; tempIndex++){
            radixArray[tempIndex] = temp[tempIndex];
        }
    }

    public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }
}
