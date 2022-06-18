package com.bl.game;

public class TicTacToeGame {

    char[] board = new char[10];

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
}
