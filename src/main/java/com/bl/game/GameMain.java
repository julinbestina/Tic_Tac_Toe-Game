package com.bl.game;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {

        TicTacToeGame game = new TicTacToeGame();
        System.out.println("Welcome to Tic Tac Toe Game\n");
            game.initializeBoard();
            game.showBoard();
            game.selectInput();
            char turn = game.selectStartingPlayer();
            game.selectBoardLocation(turn);

    }
}