package com.bl.game;

import java.util.Scanner;

import static java.lang.System.exit;

public class TicTacToeGame {

    char[] board = new char[10];
    char userInput, computerInput, player;
    int count = 0;
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

    public void selectBoardLocation(char turn) {

        if (turn == computerInput) {
            System.out.println("\nComputer turn to play:");
            playComputerTurn(turn);
            playComputerTurn(userInput);
        }
        System.out.println("Select Location in the board to insert input from 1-9 for " + turn + ": ");
        int userLocation = sc.nextInt();
        selectBoardLocationRec(userLocation, turn);
    }

    private void selectBoardLocationRec(int userLocation, char turn) {

        if (userLocation > board.length - 1) {
            System.out.println("Enter correct location");
            selectBoardLocation(turn);
        }

        for (int i = 1; i < board.length; i++) {
            if (userLocation == i && board[i] == ' ') {
                board[i] = turn;
                count++;
                showBoard();
                checkNextMove(turn);
            } else if (userLocation == i && board[i] != ' ') {
                System.out.println("Location already used");
                selectBoardLocation(turn);
            }
        }
    }

    public char selectStartingPlayer() {

        int coinFlip = (int) ((Math.random() * 10) % 2);
        player = (coinFlip == 1) ? userInput : computerInput;
        System.out.println("Starting Player is " + player);
        return player;
    }

    public void checkNextMove(char turn) {
        for (int i = 1; i < 8; i = i + 3) {
            if (board[i] == turn && board[i + 1] == turn && board[i + 2] == turn) {
                System.out.println("winner is " + turn);
                exit(0);
            }
        }

        for (int i = 1; i < 4; i = i + 1) {
            if (board[i] == turn && board[i + 3] == turn && board[i + 6] == turn) {
                System.out.println("winner is " + turn);
                exit(0);
            }
        }

        if (board[1] == turn && board[5] == turn && board[9] == turn) {
            System.out.println("winner is " + turn);
            exit(0);
        } else if (board[3] == turn && board[5] == turn && board[7] == turn) {
            System.out.println("winner is " + turn);
            exit(0);
        } else {
            for (int i = 1; i < board.length; i++) {
                if (board[i] == ' ') {
                    selectBoardLocation((turn == computerInput) ? userInput : computerInput);
                }
                if (count == 9) {
                    System.out.println("draw and Thank you");
                    exit(0);
                }
            }

        }

    }

    public void playComputerTurn(char turn) {

        for (int i = 1; i < 8; i = i + 3) {
            if (board[i] == turn && board[i + 1] == turn && board[i + 2] == ' ') {
                turn = computerInput;
                selectBoardLocationRec(i + 2, turn);
            } else if (board[i] == turn && board[i + 2] == turn && board[i + 1] == ' ') {
                turn = computerInput;
                selectBoardLocationRec(i + 1, turn);
            } else if (board[i + 2] == turn && board[i + 1] == turn && board[i] == ' ') {
                turn = computerInput;
                selectBoardLocationRec(i, turn);
            }
        }

        for (int i = 1; i < 4; i = i + 1) {
            if (board[i] == turn && board[i + 3] == turn && board[i + 6] == ' ') {
                turn = computerInput;
                selectBoardLocationRec(i + 6, turn);
            } else if (board[i] == turn && board[i + 6] == turn && board[i + 3] == ' ') {
                turn = computerInput;
                selectBoardLocationRec(i + 3, turn);
            } else if (board[i + 3] == turn && board[i + 6] == turn && board[i] == ' ') {
                turn = computerInput;
                selectBoardLocationRec(i, turn);
            }
        }

        if (board[1] == turn && board[5] == turn && board[9] == ' ') {
            turn = computerInput;
            selectBoardLocationRec(9, turn);
        } else if (board[1] == turn && board[9] == turn && board[5] == ' ') {
            turn = computerInput;
            selectBoardLocationRec(5, turn);
        } else if (board[5] == turn && board[9] == turn && board[1] == ' ') {
            turn = computerInput;
            selectBoardLocationRec(1, turn);
        } else if (board[3] == turn && board[5] == turn && board[7] == ' ') {
            turn = computerInput;
            selectBoardLocationRec(7, turn);
        } else if (board[3] == turn && board[7] == turn && board[5] == ' ') {
            turn = computerInput;
            selectBoardLocationRec(5, turn);
        } else if (board[5] == turn && board[7] == turn && board[3] == ' ') {
            turn = computerInput;
            selectBoardLocationRec(3, turn);
        }
        //checkNextMove(turn);
    }
}














