package com.pepcoding.basicsofprogramming.functionsandarrays;

import java.io.*;
import java.util.*;

public class RotateAnArray {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void rotate(int[] ar, int k){
        // write your code here
        int length = ar.length;
        int array[] = new int[length];

        k = k%length;

        if(k < 0)
        {
            k = k+length;
        }

        int index = length-k;
        int j=0;
        for(int i=index; i<length; i++)
        {
            array[j] = ar[i];
            j=j+1;
        }

        for(int i=0; i<index; i++)
        {
            array[j] = ar[i];
            j=j+1;
        }

        display(array);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        //display(a);
    }

}
