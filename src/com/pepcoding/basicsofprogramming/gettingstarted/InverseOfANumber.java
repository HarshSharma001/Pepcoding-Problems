package com.pepcoding.basicsofprogramming.gettingstarted;

import java.util.Scanner;
public class InverseOfANumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();


        int length = s.length();
        int div = 1, mul=1;

        k = k%length;

        if(k < 0)
        {
            k = length+k; //length + (-k);
        }

        int i=k;
        while(i > 0)
        {
            div = div*10;
            i=i-1;
        }

        int muliplierLength = length-k;

        while(muliplierLength > 0)
        {
            mul = mul*10;
            muliplierLength = muliplierLength-1;
        }

        int n = Integer.parseInt(s);
        int quotient = n/div;
        int remainder = n%div;

        // System.out.println("quotient = "+quotient);
        // System.out.println("remainder = "+remainder);
        int result = mul*remainder;
        result = result+quotient;

        System.out.println(result);

    }

}
