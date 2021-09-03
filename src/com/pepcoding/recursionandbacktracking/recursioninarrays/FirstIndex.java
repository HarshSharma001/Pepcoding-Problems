package com.pepcoding.recursionandbacktracking.recursioninarrays;

import java.io.*;
import java.util.*;

public class FirstIndex {

	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();   //element to be searched for 1st index
        System.out.println(firstIndex(arr, n-1, x));
    }

    public static int firstIndex(int[] arr, int index, int x){
        //Base Case
        if(index == 0){
            if(arr[index] == x) return index;
            else return -1;
        }
        
        //faith
        int elementIndex = firstIndex(arr, index-1, x);
        //faith * expectations
        if(elementIndex != -1) return elementIndex;
        else
            if(arr[index] == x) return index;
            else return -1;
    }

}
