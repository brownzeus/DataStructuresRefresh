package com.anupsaha.sorting;

import com.anupsaha.Constants;

import java.util.Arrays;

public class JDKSort {
    public static void main(String[] args) {
        int[] intArray = new Constants().intArray;

        Arrays.sort(intArray);

        Constants.printArray(intArray);
    }
}
