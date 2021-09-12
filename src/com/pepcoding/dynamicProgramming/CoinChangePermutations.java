package com.pepcoding.dynamicProgramming;

import java.util.Scanner;

public class CoinChangePermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();  //infinite supply of each individual coin
        }
        int amount = sc.nextInt();      //amount to be paid
        System.out.println(totalCoinPermutations(n, amount, arr));
    }

    private static int totalCoinPermutations(int n, int amount, int[] arr){
        int[] dp = new int[amount + 1];     //storage
        dp[0] = 1;                          //meaning

        //travel & solve
        for(int i = 1; i <= amount; i++){
            int currentTargetAmount = i;
            for(int j = 0; j < n; j++){
                //When the current coin wants to contribute in the whole payment
                if(currentTargetAmount >= arr[j]){
                    int remainingAmount = currentTargetAmount - arr[j];
                    dp[i] += dp[remainingAmount];
                }
            }
        }
        return dp[amount];
    }
}
