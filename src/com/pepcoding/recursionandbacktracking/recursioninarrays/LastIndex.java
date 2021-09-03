package com.pepcoding.recursionandbacktracking.recursioninarrays;

import java.io.*;
import java.util.*;

public class LastIndex {

	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(lastIndex(arr, n-1, x));
    }

    public static int lastIndex(int[] arr, int index, int x){
        //Base Case
        if(index == 0){
            if(arr[index] == x) return index;
            else return -1;
        }
        //faith * expectation
        if(arr[index] == x) return index;
        //faith
        return lastIndex(arr, index-1, x);
    }

}
