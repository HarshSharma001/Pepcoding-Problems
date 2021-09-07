package com.pepcoding.dynamicProgramming;

import java.util.Scanner;

public class ClimbStairsWithMinimumMoves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
//        System.out.println(climbStairsWithMinimumMoves(0, 0, n, arr, new int[n + 1]));
//        System.out.println(climbStairsWithMinimumMoves(0, 0, n, arr));
        System.out.println(climbStairsWithMinimumMovesWithTabulation(n, arr));
    }

    /**
     * We will charge 1 unit cost for each individual jump..
     * The smallest cost of jumps will be our final answer..
     */

    //with recursion only
    private static int climbStairsWithMinimumMoves(int index, int cost, int n, int[] arr){
        //Base Case
        if(index == n) return cost;
        else if(index > n) return Integer.MAX_VALUE;

        //faith
        int limit = arr[index];
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= limit; i++){
            int minCost = climbStairsWithMinimumMoves(index + i, cost + 1, n, arr);
            //faith * expectation
            if(minCost < min) min = minCost;
        }
        return min;
    }


    //memoization code but not working
    private static int climbStairsWithMinimumMoves(int index, int cost, int n, int[] arr, int[] questionBank){
        //Base Case
        if(index == n) return 1;
        else if(index > n) return Integer.MAX_VALUE;
        else if(questionBank[index] != 0) {
            if(questionBank[index] != Integer.MAX_VALUE) return questionBank[index] + 1;
            return questionBank[index];
        }

        //faith
        int limit = arr[index];
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= limit; i++){
            int minCost = climbStairsWithMinimumMoves(index + i, cost + 1, n, arr, questionBank);
            System.out.println("MinCost for index "+index+" is = "+minCost);
            //faith * expectation
            if(minCost < min) min = minCost;
        }

        System.out.println("Final Minimum for index "+index+" is = "+min);
        questionBank[index] = min;
        return min;
    }

    //tabulation code
    private static int climbStairsWithMinimumMovesWithTabulation(int n, int arr[]){
        int[] dp = new int[n + 1];  //storage
        dp[n] = 0;

        for(int i = n-1; i>=0; i--){
            int limit = arr[i];
            int min = Integer.MAX_VALUE;
            for(int j = 1; j <= limit && i+j <= n; j++){
                int temp = dp[i+j];
                if(temp != 0){
                    temp += 1;
                    if(temp < min) min = temp;
                }
                else if(temp == 0 && i+j == n){
                    temp += 1;
                    if(temp < min) min = temp;
                }
            }
            if(min != Integer.MAX_VALUE) dp[i] = min;
        }

        return dp[0];
    }
}
