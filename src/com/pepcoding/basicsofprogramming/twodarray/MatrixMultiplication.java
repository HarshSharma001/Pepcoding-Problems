package com.pepcoding.basicsofprogramming.twodarray;

import java.io.*;
import java.util.*;

public class MatrixMultiplication{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();
    int array1[][] = new int[r1][c1];
    
    List<Integer> list = new ArrayList<>();
    
    for(int i=0; i<r1; i++)
    {
        for(int j=0; j<c1; j++)
        {
            array1[i][j] = sc.nextInt();
        }
    }
    
    
    int r2 = sc.nextInt();
    int c2 = sc.nextInt();
    int array2[][] = new int[r2][c2];
    for(int i=0; i<r2; i++)
    {
        for(int j=0; j<c2; j++)
        {
            array2[i][j] = sc.nextInt();
        }
    }
    
    
    if(c1 == r2){

        int newArray[][] = new int[c2][r2];
        
        int newRow=0, newColumn=0;
        for(int i=0; i<c2; i++)
        {
            for(int j=0; j<r2; j++)
            {
                newArray[i][j] = array2[newRow][newColumn];
                newRow = newRow+1;
            }
            newColumn = newColumn+1;
            newRow = 0;
        }

        printMultipliedMatrix(array1, r1, c1, newArray, c2, r2);
    }
    else{
        System.out.println("Invalid input");
    }
    
    
    }
    
    
    public static void printMultipliedMatrix(int array1[][], int r1, int c1, int array2[][], int r2, int c2)
    {
        int row, element=0;
        for(int i=0; i<r1; i++)
        {
            row = 0;
            while(row < r2)
            {
                for(int j=0; j<c1; j++)
                {
                    element = element + (array1[i][j] * array2[row][j]);
                }
                    System.out.print(element+" ");
                    element=0;
                row++;
            }
            System.out.println("");
        }
    }
    
}