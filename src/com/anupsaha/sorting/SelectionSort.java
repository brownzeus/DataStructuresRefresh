package com.anupsaha.sorting;

import com.anupsaha.Constants;

import static com.anupsaha.Constants.printArray;

public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray = new Constants().intArray;
        printArray(intArray);
        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
        }

        printArray(intArray);
    }

    public static void swap(int[] arr, int i , int j) {
        if (i == j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
