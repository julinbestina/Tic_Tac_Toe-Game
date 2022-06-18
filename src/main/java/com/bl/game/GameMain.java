package com.bl.game;

import java.util.Random;

public class GameMain {
    public static void main(String[] args) {

        TicTacToeGame game = new TicTacToeGame();

        game.initializeBoard();
        game.showBoard();
        game.selectInput();
        game.selectStartingPlayer();
        game.selectBoardLocation();

    }
}