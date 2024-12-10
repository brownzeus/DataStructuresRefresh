package com.anupsaha.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        printArray(intArray);
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for(int i = 0; i < lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[i+1]) {
                    swap(intArray, i, i+1);
                }
            }
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

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}
