package com.anupsaha.sorting.Challenges;

import com.anupsaha.Constants;

public class MergeSortDescending {
    public static void main(String[] args) {
        int[] intArray = new Constants().intArray;

        mergeSort(intArray, 0, intArray.length);

        Constants.printArray(intArray);

    }

    public static void mergeSort(int[] intArray, int start, int end) {
        if(end-start < 2) {
            return;
        }

        int mid = (start+end)/2;

        //sort left
        mergeSort(intArray, start, mid);
        //sort right
        mergeSort(intArray, mid, end);
        //merge left and right
        merge(intArray, start, mid, end);

    }

    public static void  merge(int[] intArray, int start, int mid, int end) {
        if(intArray[mid-1]>=intArray[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end-start];

        while(i<mid && j<end) {
            temp[tempIndex++] = intArray[i] >= intArray[j] ? intArray[i++] : intArray[j++];
        }

        System.arraycopy(intArray, i, intArray, start+tempIndex, mid-i);
        System.arraycopy(temp, 0, intArray, start, tempIndex);
    }
}
