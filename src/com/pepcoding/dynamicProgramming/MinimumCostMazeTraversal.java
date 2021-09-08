package com.pepcoding.dynamicProgramming;

import java.util.Scanner;

public class MinimumCostMazeTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
//        System.out.println(useRecursion(0, 0, 0, n-1, m-1, arr));
        int qb[][] = new int[n+1][m+1];
        qb = fillArray(qb, n+1, m+1);
        System.out.println(useRecursionWithMemoization(0, 0, n-1, m-1,arr, qb));
//        System.out.println(useTabulation(0, 0, n - 1, m - 1, arr));
    }

    private static int[][] fillArray(int[][] arr, int n, int m){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = -1;
            }
        }
        return arr;
    }

    private static int useRecursion(int cost, int sr, int sc, int dr, int dc, int arr[][]) {
        //Base Case
        if (sr == dr && sc == dc) {
            return cost + arr[sr][sc];
        } else if (sr > dr || sc > dc) {
            return Integer.MAX_VALUE;
        }

        //faith
        int minCost1 = useRecursion(cost + arr[sr][sc], sr, sc + 1, dr, dc, arr);  //horizontal step
        int minCost2 = useRecursion(cost + arr[sr][sc], sr + 1, sc, dr, dc, arr);  //vertical step

        //faith * expectation
        if (minCost1 < minCost2) return minCost1;
        return minCost2;
    }

    private static int useRecursionWithMemoization(int sr, int sc, int dr, int dc, int arr[][], int[][] questionBank) {
        //Base Case
        if (sr == dr && sc == dc) {
            return arr[sr][sc];
        } else if (sr > dr || sc > dc) {
            return Integer.MAX_VALUE;
        } else if(questionBank[sr][sc] != -1) return questionBank[sr][sc];

        //faith
        int minCost1 = useRecursionWithMemoization(sr, sc + 1, dr, dc, arr, questionBank);  //horizontal step
        int minCost2 = useRecursionWithMemoization( sr + 1, sc, dr, dc, arr, questionBank);  //vertical step

        //faith * expectation
        if(minCost1 != Integer.MAX_VALUE){
            minCost1 += arr[sr][sc];
        }
        if(minCost2 != Integer.MAX_VALUE){
            minCost2 += arr[sr][sc];
        }

        if (minCost1 < minCost2){
            questionBank[sr][sc] = minCost1;
            return minCost1;
        }
        questionBank[sr][sc] = minCost2;
        return minCost2;
    }

    private static int useTabulation(int sr, int sc, int dr, int dc, int arr[][]) {
        Integer[][] dp = new Integer[dr + 1][dc + 1];   //storage
        dp[dr][dc] = arr[dr][dc];                       //meaning

        for (int i = dr; i >= 0; i--)
            for (int j = dc; j >= 0; j--) {
                if (i == dr && j == dc) continue;
                int nextCol = j + 1;
                int nextRow = i + 1;
                if (nextCol <= dc) {
                    if (dp[i][nextCol] != null) dp[i][j] = arr[i][j] + dp[i][nextCol];
                }
                if (nextRow <= dr) {
                    if (dp[nextRow][j] != null) {
                        int value = arr[i][j] + dp[nextRow][j];
                        if (dp[i][j] == null || dp[i][j] != null && dp[i][j] > value) {
                            dp[i][j] = value;
                        }
                    }
                }
            }

        return dp[0][0];
    }
}
