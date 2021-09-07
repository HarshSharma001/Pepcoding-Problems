package com.pepcoding.dynamicProgramming;

import java.util.Scanner;

public class ClimbStairsWithVariableJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
//        System.out.println(climbStairPathsWithJumps(0, n, arr, new int[n + 1]));
        System.out.println(climbStairPathsWithJumpsWithTabulation(n, arr));
    }

    //memoization code
    private static int climbStairPathsWithJumps(int index, int n, int[] arr, int[] questionBank){
        //Base Case
        if(index == n) return 1;
        else if(index > n) return 0;
        else if(questionBank[n] != 0) return questionBank[n];

        //faith
        int limit = arr[index];
        int ans = 0;
        for(int i = 1; i <= limit; i++){
            ans += climbStairPathsWithJumps(index + i, n, arr, questionBank);
        }

        return ans;
    }

    //tabulation code
    private static int climbStairPathsWithJumpsWithTabulation(int n, int[] arr){
        int[] dp = new int[n + 1];  //storage
        dp[n] = 1;                  //meaning

        int limit = 0;
        for(int i = n-1; i >= 0; i--){
            limit = arr[i];
            for(int j = 1; j <= limit && i+j <= n; j++){
                dp[i] += dp[i + j];
            }
        }

        return dp[0];
    }
}
