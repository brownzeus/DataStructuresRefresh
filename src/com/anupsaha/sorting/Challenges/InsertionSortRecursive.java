package com.anupsaha.sorting.Challenges;

import com.anupsaha.Constants;

import static com.anupsaha.Constants.printArray;

public class InsertionSortRecursive {
    public static void main(String[] args) {
        int[] intArray = new Constants().intArray;
        insertionSort(intArray, intArray.length);

        printArray(intArray);
    }

    private static void insertionSort(int[] intArray, int numItems) {
        if(numItems < 2) {
            return;
        }

        insertionSort(intArray, numItems-1);

        int newElement = intArray[numItems-1];
        int i;
        for(i = numItems-1; i > 0 && intArray[i-1] > newElement; i--) {
            intArray[i] = intArray[i-1];
        }
        intArray[i] = newElement;
    }

}
