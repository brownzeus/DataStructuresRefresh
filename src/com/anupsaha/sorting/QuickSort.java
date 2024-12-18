package com.anupsaha.sorting;

import com.anupsaha.Constants;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new Constants().intArray;

        quickSort(array, 0, array.length);

        Constants.printArray(array);
    }

    public static void quickSort(int[] input, int start, int end) {
        if(end-start < 2 ){
            return;
        }
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex+1, end);
    }

    private static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start;
        int j = end;
        while(i < j) {
            while(i < j && input[--j] >= pivot);
            if(i < j) {
                input[i] = input[j];
            }
            while(i < j && input[++i] <= pivot);
            if(i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }

}
