package com.pepcoding.basicsofprogramming.gettingstarted;

import java.util.Scanner;
class BenjaminBulbs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String array[] = new String[n];

        //Assigning initial bulbs values
        for(int i=0; i<n; i++)
        {
            array[i]="off";
        }


        for(int i=1; i<=n; i++)
        {
            for(int j=i; j<n; j=j+i)
            {
                //System.out.println("j = "+j);
                if(array[j].equals("off"))
                {
                    array[j] = "on";
                }

                else if(array[j].equals("on"))
                {
                    array[j] = "off";
                }
            }
        }

        //System.out.println("Final O/P:");
        for(int i=0; i<array.length; i++)
        {
            if(array[i].equals("on"))
            {
                System.out.println(i);
            }
        }
    }
}
