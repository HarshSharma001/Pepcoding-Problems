package com.pepcoding.basicsofprogramming.patterns;
import java.util.Scanner;
class Pattern13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            int val=1;
            for(int j=0; j<=i; j++)
            {

                if(j < n){
                    System.out.print(val+"\t");
                }
                else{
                    System.out.print(val);
                }

                int val2 = val *(i-j)/(j+1);
                val = val2;
            }
            System.out.println("");
        }
    }
}
