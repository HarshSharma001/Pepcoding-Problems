package com.pepcoding.recursionandbacktracking.recursionwithbacktracking;

import java.util.Scanner;

public class TargetSumSubsets {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        printTargetSumSubsets(arr, 0, 0, tar, "", n);
    }

    public static void printTargetSumSubsets(int[] arr, int index, int sum, int tar, String answer, int n) {
        //Base Case
        if(index == n){
            if(sum == tar){
              System.out.println(answer+".");  
            } 
            return;
        }
        
        //faith
        printTargetSumSubsets(arr, index + 1, sum + arr[index], tar, answer + arr[index]+ ", ", n);    //aayega
        printTargetSumSubsets(arr, index + 1, sum, tar, answer, n);    //nhi aayega
        
    }
}
