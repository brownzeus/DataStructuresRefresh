package com.anupsaha.sorting.Challenges;

public class StringRadixSort {

    public static void main(String[] args) {
        String[] stringArray = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        //do radix sort
        radixSort(stringArray, 26, 5);

        for(String str : stringArray) {
            System.out.print(str + " ");
        }
    }

    public static void radixSort(String[] radixArray, int radix, int width) {
        for (int i = width-1; i >= 0; i--) {
            radixSingleSort(radixArray, i, radix);
        }
    }

    public static void radixSingleSort(String[] input, int position, int radix) {

        int numItems = input.length;
        int[] countArray = new int[radix];

        for(String value : input){
            countArray[getIndex(position, value)]++;
        }
        //Adjust the count array
        for(int j = 1; j < radix; j++){
            countArray[j] += countArray[j - 1];
        }

        String[] temp = new String[numItems];
        for(int tempIndex = numItems-1; tempIndex >= 0 ; tempIndex--){
            temp[--countArray[getIndex(position, input[tempIndex])]] =
                    input[tempIndex];
        }

        for(int tempIndex = 0; tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static int getIndex (int postion, String value){
        return value.charAt(postion) - 'a';
    }
}
