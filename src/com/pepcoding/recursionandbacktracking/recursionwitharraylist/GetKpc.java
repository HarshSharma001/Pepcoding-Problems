package com.pepcoding.recursionandbacktracking.recursionwitharraylist;
import java.util.*;

public class GetKpc {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(getKPC(str));
    }
    
    static String arr[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str) {
        //Base Case
        if(str.isEmpty()){
            ArrayList<String> baseCaseList = new ArrayList<>();
            baseCaseList.add("");
            return baseCaseList;
        }
        
        char ch = str.charAt(0);
        String remaining = str.substring(1);
        //faith
        ArrayList<String> list = getKPC(remaining);
        
        //faith * expectations
        String keyPadValues = arr[ch-'0'];
        char[] array = keyPadValues.toCharArray();
        ArrayList<String> output = new ArrayList<>();
        for(char c: array){
            for(String s: list){
                output.add(c+s);        
            }   
        }
        return output;
    }
}