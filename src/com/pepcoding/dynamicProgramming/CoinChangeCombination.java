package com.pepcoding.dynamicProgramming;

import java.util.Scanner;

public class CoinChangeCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();  //infinite supply of each individual coin
        }
        int amount = sc.nextInt();      //amount to be paid
        System.out.println(totalCoinCombinations(n, amount, arr));
    }

    //using tabulation
    private static int totalCoinCombinations(int n, int amount, int arr[]){
        int[] dp = new int[amount+1];    //storage
        dp[0] = 1;                  //meaning

        //travel and solve
        for(int i = 0; i<n; i++){
            for(int j=0; j<=amount; j++){
                //When this coin decides to contribute in the whole payment
                int currentTargetAmount = j;
                if(currentTargetAmount >= arr[i]){
                    int remainingAmount = currentTargetAmount - arr[i];
                    dp[j] += dp[remainingAmount];
                }
            }
        }
        return dp[amount];
    }
}
