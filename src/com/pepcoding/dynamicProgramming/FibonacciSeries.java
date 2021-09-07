package com.pepcoding.dynamicProgramming;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //nth element of the fibonacci series
//        System.out.println(fib(n));
        System.out.println(fibByMemoization(n, new int[n + 1]));
    }

    //with recursion only
    private static int fib(int n){
        //Base Case
        if(n == 0 || n == 1){
            return n;
        }

        //faith
        int ans1 = fib(n - 1);
        int ans2 = fib(n - 2);
        //faith * expectation
        return ans1 + ans2;
    }

    //with memoization inside recursion
    private static int fibByMemoization(int n, int[] questionBank){
        //Base Case
        if(n == 0 || n == 1){
            return n;
        }

        if(questionBank[n] != 0){
            return questionBank[n];
        }

        //faith
        int ans1 = fibByMemoization(n - 1, questionBank);
        int ans2 = fibByMemoization(n - 2, questionBank);
        int answer = ans1 + ans2;
        //faith * expectation
        questionBank[n] = answer;
        return answer;
    }
}
