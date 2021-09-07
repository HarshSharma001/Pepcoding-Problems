package com.pepcoding.dynamicProgramming;

import java.util.Scanner;

public class ClimbStairsPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //the nth stair step we are at currently
//        System.out.println(countClimbStairsTotalPaths(n, new int[n + 1]));
        System.out.println(countClimbStairsTotalPathsWithTabulation(n));
    }

    //DP with memoization
    private static int countClimbStairsTotalPaths(int n, int[] questionBank){
        //Base Case
        if(n == 0) return 1;
        else if(n < 0) return 0;
        else if(questionBank[n] != 0) return questionBank[n];

        //faith
        int path1 = countClimbStairsTotalPaths(n - 1, questionBank);
        int path2 = countClimbStairsTotalPaths(n - 2, questionBank);
        int path3 = countClimbStairsTotalPaths(n - 3, questionBank);
        //faith * expectation
        int answer = path1 + path2 + path3;
        questionBank[n] = answer;
        return answer;
    }

    //DP with tabulation
    private static int countClimbStairsTotalPathsWithTabulation(int n){
        int[] dp = new int[n + 1];   //storage
        dp[0] = 1;                   //meaning assigned

        for(int i = 1; i<=n; i++){
            if(i == 1){
                dp[i] = dp[i - 1];
            }
            else if(i == 2){
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            else if(i >= 3){
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }
        return dp[n];
    }
}
