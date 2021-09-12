package com.pepcoding.dynamicProgramming;

import java.util.Scanner;

public class ZeroOneKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];  //value of each individual item corresponding to it's index
        for(int i=0; i<n; i++){
            values[i] = sc.nextInt();
        }
        int[] weights = new int[n];  //weight of each individual item corresponding to it's index
        for(int i=0; i<n; i++){
            weights[i] = sc.nextInt();
        }
        int maxCapacity = sc.nextInt(); //maximum weight the bag can occupy
//        System.out.println(useRecursion(n-1, 0, 0, maxCapacity,
//                values, weights));
        System.out.println(useRecursionWithMemoization(n-1, 0, 0, maxCapacity,
                values, weights, new Integer[n]));
    }

    private static int useRecursion(int n, int currentProfit, int currentWeight, int maxCapacity,
                                    int[] values, int[] weights){
        //Base Case
        if(n < 0) return currentProfit;
        if(currentWeight >= maxCapacity) return currentProfit;

        //faith
        int profit1 = useRecursion(n-1, currentProfit + values[n],
                currentWeight + weights[n], maxCapacity, values, weights);  //aayega
        int profit2 = useRecursion(n-1, currentProfit, currentWeight,
                maxCapacity, values, weights);  //nhi aayega

        //faith * expectations
        if(profit1 > profit2) return profit1;
        return profit2;
    }

    //memoized code but not working
    private static int useRecursionWithMemoization(int n, int currentProfit, int currentWeight, int maxCapacity,
                                    int[] values, int[] weights, Integer[] questionBank){
        //Base Case
        if(n < 0) return currentProfit;
        if(questionBank[n] != null) return questionBank[n];
        if(currentWeight >= maxCapacity) return currentProfit;

        //faith
        int profit1 = useRecursionWithMemoization(n-1, currentProfit + values[n],
                currentWeight + weights[n], maxCapacity, values, weights, questionBank);  //aayega
        int profit2 = useRecursionWithMemoization(n-1, currentProfit, currentWeight,
                maxCapacity, values, weights, questionBank);  //nhi aayega

        //faith * expectations
        if(profit1 > profit2) {
            questionBank[n] = profit1;
            return profit1;
        }
        questionBank[n] = profit2;
        return questionBank[n];
    }
}
