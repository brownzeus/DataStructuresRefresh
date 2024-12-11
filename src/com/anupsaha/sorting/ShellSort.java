package com.anupsaha.sorting;
import com.anupsaha.Constants;
public class ShellSort {
    public static void main(String[] args) {
        int[] intArray = new Constants().intArray;
        for(int gap = intArray.length/2; gap > 0; gap/=2){
            for(int i = gap; i < intArray.length; i++){
                int newElement = intArray[i];
                int j =i;

                while(j>= gap && intArray[j-gap] > newElement){
                    intArray[j] = intArray[j-gap];
                    j-=gap;
                }
                intArray[j] = newElement;
            }
        }
        Constants.printArray(intArray);
    }
}
