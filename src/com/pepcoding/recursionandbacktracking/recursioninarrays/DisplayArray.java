package com.pepcoding.recursionandbacktracking.recursioninarrays;

import java.io.*;
import java.util.*;

public class DisplayArray {

	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        displayArr(arr, n-1);
    }

    public static void displayArr(int[] arr, int index){
        //Base Case
        if(index < 0){
            return;
        }
        //faith
        displayArr(arr, index-1);   //It will print n-1 numbers already
        //faith * expectation
        System.out.println(arr[index]);
    }

}
