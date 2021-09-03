package com.pepcoding.recursionandbacktracking.recursioninarrays;

import java.io.*;
import java.util.*;

public class AllIndicesOfArray {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, n, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int index, int n, int fsf) {
        // write ur code here
        //Base Case
        if(index == n){
            return new int[fsf];
        }
        
        //faith * expectation 1st half
        if(arr[index] == x) fsf += 1;      
        //faith
        int[] array = allIndices(arr, x, index+1, n, fsf);
        //faith * expectation 2nd half
        if(arr[index] == x) {
            fsf -= 1;
            array[fsf] = index;
        }
        return array;
    }

}
