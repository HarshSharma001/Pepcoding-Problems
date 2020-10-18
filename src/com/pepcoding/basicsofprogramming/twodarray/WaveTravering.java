package com.pepcoding.basicsofprogramming.twodarray;

import java.io.*;
import java.util.*;

public class WaveTravering {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int array[][] = new int[row][column];

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                array[i][j] = sc.nextInt();
            }
        }

// 		System.out.println("");
// 		System.out.println("");
        waveTraverseArrayElements(array, row, column);

    }


    public static void waveTraverseArrayElements(int array[][], int row, int column){
        int j=0;
        int totalElements=0;

        for(int i=0; i<row; i++)
        {
            System.out.println(array[i][j]);
            totalElements = totalElements+1;

            if(i==(row-1) && j<column-1)
            {
                j = j+1;


                for(int k=i; k>=0; k--)
                {
                    System.out.println(array[k][j]);
                    totalElements = totalElements+1;
                }

                i=-1;

                if(j <= column-2)
                {
                    j = j+1;
                }

            }


            if(totalElements >= (row*column))
            {
                break;
            }

        }
    }
}
