package com.anupsaha.sorting;

import com.anupsaha.Constants;

import static com.anupsaha.Constants.printArray;

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = new Constants().intArray;
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for(i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--) {
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;
        }

        printArray(intArray);
    }
}
