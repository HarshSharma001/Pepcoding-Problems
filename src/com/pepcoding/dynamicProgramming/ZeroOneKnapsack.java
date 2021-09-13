package com.pepcoding.dynamicProgramming;

import java.util.Scanner;

public class ZeroOneKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];  //value of each individual item corresponding to it's index
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        int[] weights = new int[n];  //weight of each individual item corresponding to it's index
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }
        int maxCapacity = sc.nextInt(); //maximum weight the bag can occupy
//        System.out.println(useRecursion(n-1, 0, 0, maxCapacity,
//                values, weights));
//        System.out.println(useRecursionWithMemoization(n-1, 0, 0, maxCapacity,
//                values, weights, new Integer[n]));
        System.out.println(useTabulation(n, maxCapacity, values, weights));
    }

    private static int useRecursion(int n, int currentProfit, int currentWeight, int maxCapacity,
                                    int[] values, int[] weights) {
        //Base Case
        if (n < 0) return currentProfit;
        if (currentWeight >= maxCapacity) return currentProfit;

        //faith
        int profit1 = useRecursion(n - 1, currentProfit + values[n],
                currentWeight + weights[n], maxCapacity, values, weights);  //aayega
        int profit2 = useRecursion(n - 1, currentProfit, currentWeight,
                maxCapacity, values, weights);  //nhi aayega

        //faith * expectations
        if (profit1 > profit2) return profit1;
        return profit2;
    }

    //memoized code but not working
    private static int useRecursionWithMemoization(int n, int currentProfit, int currentWeight, int maxCapacity,
                                                   int[] values, int[] weights, Integer[] questionBank) {
        //Base Case
        if (n < 0) return currentProfit;
        if (questionBank[n] != null) return questionBank[n];
        if (currentWeight >= maxCapacity) return currentProfit;

        //faith
        int profit1 = useRecursionWithMemoization(n - 1, currentProfit + values[n],
                currentWeight + weights[n], maxCapacity, values, weights, questionBank);  //aayega
        int profit2 = useRecursionWithMemoization(n - 1, currentProfit, currentWeight,
                maxCapacity, values, weights, questionBank);  //nhi aayega

        //faith * expectations
        if (profit1 > profit2) {
            questionBank[n] = profit1;
            return profit1;
        }
        questionBank[n] = profit2;
        return questionBank[n];
    }

    private static int useTabulation(int n, int capacity, int[] values, int weights[]) {
        int[][] dp = new int[n + 1][capacity + 1];  //storage
        /*** dp meaning is already assigned as 0 ****/

        int index = 0;
        //travel & solve
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= capacity; j++) {
                int currentBalls = j;
                //when the current player has 2 choices available to opt
                if (currentBalls >= weights[index]) {
                    //when the current player decides to bat by playing 'i' balls
                    int totalRuns1 = values[index] + dp[i - 1][j - weights[index]];
                    //when the current player decides not to bat
                    int totalRuns2 = dp[i - 1][j];
                    dp[i][j] = Math.max(totalRuns1, totalRuns2);
                } else {
                    dp[i][j] += dp[i - 1][j];
                }
            }
            index += 1;
        }
        return dp[n][capacity];
    }
}
