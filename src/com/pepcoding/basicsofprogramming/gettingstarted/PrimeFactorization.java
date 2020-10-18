package com.pepcoding.basicsofprogramming.gettingstarted;

import java.util.Scanner;
class PrimeFactorization{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=2; i<=n; i++)
        {
            int quotient =n%i;
            while(quotient==0)
            {
                n = n/i;
                quotient =n%i;
                System.out.print(i+" ");
            }
        }
    }
}
