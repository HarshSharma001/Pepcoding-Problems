package com.pepcoding.recursionandbacktracking.recursioninarrays;

import java.io.*;
import java.util.*;

public class FirstIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i=0; i<n; i++)
        {
            array[i] = sc.nextInt();
        }

        int element = sc.nextInt();
        System.out.println(firstIndex(array, 0, element));
    }

    static int location=-1;
    public static int firstIndex(int[] array, int index, int element){
        if(array[index] != element && index<array.length-1)
        {
            firstIndex(array,index+1,element);
        }

        else if(array[index] == element)
        {
            location = index;
        }
        return location;
    }

}
