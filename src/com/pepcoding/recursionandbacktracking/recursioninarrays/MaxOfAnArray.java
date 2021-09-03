package com.pepcoding.recursionandbacktracking.recursioninarrays;

import java.io.*;
import java.util.*;

public class MaxOfAnArray {

	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxOfArray(arr, n-1));
    }

    public static int maxOfArray(int[] arr, int index){
        //Base Case
        if(index == 0){
            return arr[index];
        }
        //faith
        int max = maxOfArray(arr, index-1);
        if(arr[index] > max) return arr[index];
        else return max;
    }

}
