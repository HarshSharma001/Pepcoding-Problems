package com.pepcoding.dynamicProgramming;

import java.util.Scanner;

public class UnboundedKnapsack {
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
        System.out.println(useTabuldation(n, maxCapacity, values, weights));
    }

    private static int useTabuldation(int n, int maxCapacity, int[] values, int[] weights){
        int[] dp = new int[maxCapacity + 1];    //storage
        dp[0] = 0;                              //meaning

        //travel & solve
        for(int weight = 1; weight <= maxCapacity; weight++){
            for(int i = 0; i < n; i++){
                //Whether the current item can be included in the bag or not
                if(weight >= weights[i]) {
                    int currentProfit = values[i] + dp[weight - weights[i]];
                    if(currentProfit > dp[weight]) dp[weight] = currentProfit;
                }
            }
        }
        return dp[maxCapacity];
    }
}