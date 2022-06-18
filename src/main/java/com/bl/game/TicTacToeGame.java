package com.bl.game;

import java.util.Scanner;

public class TicTacToeGame {

    char[] board = new char[10];
    Scanner sc = new Scanner(System.in);
    private void initializeIndex() {

        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    public void initializeBoard() {

        initializeIndex();
        System.out.println(board[1] + "   " + "| " + board[2] + "  " + "| " + board[3] + " " +
                "\n----|----|-----\n" +
                board[4] + "   " + "| " + board[5] + "  " + "| " + board[6] + " " +
                "\n----|----|-----\n" +
                board[4] + "   " + "| " + board[5] + "  " + "| " + board[6] + " ");
    }

    public void selectInput() {

        System.out.println("Select your input : X?O");

        char userInput = sc.next().toUpperCase().charAt(0);
        char computerInput = (userInput == 'X' ?  'O' : 'X');

        System.out.println("User input: " + userInput + ", " + "Computer input: " + computerInput);
    }
}
