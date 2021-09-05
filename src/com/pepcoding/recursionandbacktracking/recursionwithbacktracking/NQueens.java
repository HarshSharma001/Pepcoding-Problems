package com.pepcoding.recursionandbacktracking.recursionwithbacktracking;

import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    //number of queens to be placed, as well as n X n chess board
        int[][] chess = new int[n][n];
        printNQueens(chess, "", 0);
    }

    private static void printNQueens(int[][] chess, String qsf, int row) {
        //Base Case
        if(row == chess.length){
            System.out.println(qsf+".");
            return;
        }

        for(int col = 0; col < chess.length; col++){
            if(isThisASafePlaceForQueen(chess, row, col)){
                chess[row][col] = 1;
                printNQueens(chess, qsf + row +"-"+ col+", ", row + 1);
                chess[row][col] = 0;
            }
        }
    }

    private static boolean isThisASafePlaceForQueen(int[][] chess, int row, int col){
        //check vertically
        for(int i=row-1, j=col; i>=0; i--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        //check left diagonal
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        //check right diagonal
        for(int i=row-1, j=col+1; i>=0 && j<chess.length; i--, j++){
            if(chess[i][j] == 1){
                return false;
            }
        }
        return true;
    }
}
