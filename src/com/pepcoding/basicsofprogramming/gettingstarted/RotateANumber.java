package com.pepcoding.basicsofprogramming.gettingstarted;

import java.util.Scanner;
class RotateANumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();	//the number to be rotated
        int k = sc.nextInt();

        rotateTheNumber(s,k);
    }

    public static void rotateTheNumber(String s, int k){
        int length = s.length();
        int div=1, mul=1;

        k = k%length;

        if(k < 0)
        {
            k = k+length;
        }

        int i=k;
        while(i>0){
            div = div*10;
            i=i-1;
        }

        i = length-k;
        while(i>0)
        {
            mul = mul*10;
            i=i-1;
        }

        int n = Integer.parseInt(s);
        int quotient = n/div;
        int remainder = n%div;

        int result = (mul*remainder)+quotient;
        System.out.println(result);
    }
}
