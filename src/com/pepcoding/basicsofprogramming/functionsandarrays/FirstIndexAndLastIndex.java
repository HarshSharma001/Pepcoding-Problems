package com.pepcoding.basicsofprogramming.functionsandarrays;

import java.io.*;
import java.util.*;

public class FirstIndexAndLastIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++)
        {
            array[i] = sc.nextInt();
        }

        int element = sc.nextInt();

        applyBinarySearch(array, n, element);
    }


    public static void applyBinarySearch(int array[], int n, int element){
        int beg=0, end=array.length-1, mid=(beg+end)/2;
        int location = -1;
        while(beg<=end && array[mid]!=element)
        {
            if(array[mid] < element)
            {
                beg = mid+1;
            }

            else if(array[mid] > element)
            {
                end = end-1;
            }

            mid = (beg+end)/2;
        }


        if(array[mid] == element)
        {
            location = mid;
        }

        if(location != -1)
        {
            findIndexes(array, n, location, element);
        }

        else if(location == -1)
        {
            System.out.println(location);
            System.out.println(location);
        }

    }


    public static void findIndexes(int array[], int n, int location, int element){
        int i=location, j=location;

        while(array[i] == element)
        {
            i = i-1;
        }

        while(array[j] == element)
        {
            j = j+1;
        }

        System.out.println(i+1);
        System.out.println(j-1);
    }
}
