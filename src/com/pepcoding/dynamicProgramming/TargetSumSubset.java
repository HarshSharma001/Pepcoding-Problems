package com.pepcoding.dynamicProgramming;

import java.util.Scanner;

public class TargetSumSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(useRecursion(0, n-1, target, arr));
    }

    private static boolean useRecursion(int sum, int n, int target, int[] arr){
        //Base Case
        if(n < 0) {
            if(sum == target) return true;
            return false;
        }

        if(sum > target) return false;

        if(sum == target) return true;

        //faith
        boolean ans1 = useRecursion(sum + arr[n], n - 1, target, arr); //aayega
        if(ans1){
            return ans1;
        }
        else if(!ans1){
            boolean ans2 = useRecursion(sum, n - 1, target, arr); //nhi aayega
            if(ans2) return ans2;
        }
        return false;
    }
}
