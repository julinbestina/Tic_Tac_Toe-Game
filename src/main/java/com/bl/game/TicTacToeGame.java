package com.bl.game;

import java.util.Scanner;

public class TicTacToeGame {

    char[] board = new char[10];
    char userInput, computerInput;
    Scanner sc = new Scanner(System.in);

    public void initializeBoard() {

        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    public void showBoard() {

        System.out.println(board[1] + "   " + "| " + board[2] + "  " + "| " + board[3] + " " +
                "\n----|----|-----\n" +
                board[4] + "   " + "| " + board[5] + "  " + "| " + board[6] + " " +
                "\n----|----|-----\n" +
                board[7] + "   " + "| " + board[8] + "  " + "| " + board[9] + " ");
    }

    public void selectInput() {

        System.out.println("Select your input : X?O");

        userInput = sc.next().toUpperCase().charAt(0);
        computerInput = (userInput == 'X' ? 'O' : 'X');

        System.out.println("User input: " + userInput + ", " + "Computer input: " + computerInput);
    }

    public void selectBoardLocation() {

        System.out.println("Select Locations in the board to insert input from 1-9: ");
        int userLocation = sc.nextInt();

        do {
            if (userLocation > board.length - 1) {
                System.out.println("Enter correct location \n Select Locations in the board to insert input from 1-9: ");
                userLocation = sc.nextInt();
            }
        } while (userLocation >= board.length);


        for (int i = 0; i < board.length; i++) {
            if (userLocation == i && board[i] == ' ') {
                board[i] = userInput;
                showBoard();
                break;
            }
        }
    }
}

