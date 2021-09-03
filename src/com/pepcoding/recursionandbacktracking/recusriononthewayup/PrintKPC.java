package com.pepcoding.recursionandbacktracking.recusriononthewayup;

import java.io.*;
import java.util.*;

public class PrintKPC {

	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printKPC(str, "");
    }
    
    static String arr[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printKPC(String str, String asf) {
        //Base Case
        if(str.isEmpty()){
            System.out.println(asf);
            return;
        }
        
        char ch = str.charAt(0);    //first digit
        String remaining = str.substring(1);    //remaining digits
        
        String keyPadValues = arr[ch - '0'];
        char[] keyValues = keyPadValues.toCharArray();
        
        //faith * expectation
        for(char c: keyValues){
            printKPC(remaining, asf + c);    
        }
    }

}