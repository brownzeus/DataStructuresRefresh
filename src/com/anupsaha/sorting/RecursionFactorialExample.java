package com.anupsaha.sorting;

public class RecursionFactorialExample {
    public static void main(String[] args) {
        System.out.println(iterativeFactorial(3));
        System.out.println(recursiveFactorial(3));
    }

    public static int recursiveFactorial(int n) {
        if(n == 0){
            return 1;
        }
        return n * recursiveFactorial(n-1);
    }

    public static int iterativeFactorial(int n) {
        if(n == 0){
            return 1;
        }

        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }
}
