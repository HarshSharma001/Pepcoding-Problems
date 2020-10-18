package com.pepcoding.basicsofprogramming.functionsandarrays;

import java.io.*;
import java.util.*;

public class InverseOfAnArray {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static int[] inverse(int[] arr){
        // write your code here
        int length = arr.length;
        int array[] = new int[length];

        int element,index, temp;
        for(int i=0; i<length; i++)
        {
            element = arr[i];
            index = i;
            temp = index;
            index = element;
            element = temp;

            array[index] = element;
        }
        return array;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] inv = inverse(a);
        display(inv);
    }

}
