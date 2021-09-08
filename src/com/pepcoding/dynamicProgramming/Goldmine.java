package com.pepcoding.dynamicProgramming;

import java.util.Scanner;

public class Goldmine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(useTabulation(n-1, m-1, arr));
    }

    private static int useTabulation(int n, int m, int[][] arr){
        int[][] dp = new int[n+1][m+1];     //storage
        //meaning
        for(int i=0, j=m; i<=n; i++){
            dp[i][j] = arr[i][j];
        }

        int maximumGold = Integer.MIN_VALUE;

        for(int j = m-1; j >= 0; j--){
            for(int i = 0; i <= n; i++){
                int row = i, col = j, ans1 = 0, ans2 = 0, ans3 = 0;
                //topRightCall
                row -= 1;
                col += 1;
                if(row >= 0 && row <= n && col >= 0 && col <= m){
                    ans1 = arr[i][j] + dp[row][col];
                }

                row = i; col = j;
                //rightCall
                col += 1;
                if(row >= 0 && row <= n && col >= 0 && col <= m){
                    ans2 = arr[i][j] + dp[row][col];
                }

                row = i; col = j;
                //bottomRightCall
                row += 1;
                col += 1;
                if(row >= 0 && row <= n && col >= 0 && col <= m){
                    ans3 = arr[i][j] + dp[row][col];
                }

                int maxGold = getMax(ans1, ans2, ans3);
                dp[i][j] = maxGold;
                if(maxGold > maximumGold){
                    maximumGold = maxGold;
                }
            }
        }

        return maximumGold;
    }

    private static int getMax(int a, int b, int c){
        if(a >= b && a >= c) return a;
        else if(b >= a && b >= c) return b;
        else return c;
    }
}
