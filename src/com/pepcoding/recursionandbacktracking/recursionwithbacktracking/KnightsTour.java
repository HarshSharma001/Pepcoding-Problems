package com.pepcoding.recursionandbacktracking.recursionwithbacktracking;

import java.util.Scanner;

public class KnightsTour {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //n X n chess board
        int row = sc.nextInt(); //current row of the knight
        int col = sc.nextInt(); //current column of the knight
        printKnightsTour(new int[n][n], row, col, 1);
    }

    public static void printKnightsTour(int[][] chess, int row, int col, int upcomingMove) {
        //Base Case
        if(row < 0 || col < 0 || row >= chess.length || col >= chess.length || chess[row][col] != 0){
            return; //invalid move return back
        }

        else if(upcomingMove == chess.length * chess.length){
            chess[row][col] = upcomingMove;
            displayBoard(chess);
            chess[row][col] = 0;
            return;
        }

        //faith * expectation
        chess[row][col] = upcomingMove;
        printKnightsTour(chess, row - 2, col + 1, upcomingMove + 1);
        printKnightsTour(chess, row - 1, col + 2, upcomingMove + 1);
        printKnightsTour(chess, row + 1, col + 2, upcomingMove + 1);
        printKnightsTour(chess, row + 2, col + 1, upcomingMove + 1);
        printKnightsTour(chess, row + 2, col - 1, upcomingMove + 1);
        printKnightsTour(chess, row + 1, col - 2, upcomingMove + 1);
        printKnightsTour(chess, row - 1, col - 2, upcomingMove + 1);
        printKnightsTour(chess, row - 2, col - 1, upcomingMove + 1);
        chess[row][col] = 0;    //undoing the action when coming back from recursive call
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
