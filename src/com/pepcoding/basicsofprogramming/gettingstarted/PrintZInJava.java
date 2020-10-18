package com.pepcoding.basicsofprogramming.gettingstarted;

public class PrintZInJava {
    public static void main(String[] args) {
        // Write your code here
        for(int i=0; i<5; i++)
        {
            System.out.print("*");
        }
        System.out.println("");

        int blankSpace=3, counter=0;
        while(counter < blankSpace && blankSpace > 0)
        {
            System.out.print(" ");

            if(counter == blankSpace-1 && blankSpace >= 1)
            {
                System.out.print("*");
                System.out.println("");
                counter = 0;
                blankSpace = blankSpace-1;
            }

            else
            {
                counter = counter+1;
            }
        }


        for(int i=0; i<5; i++)
        {
            System.out.print("*");
        }
    }
}
