package com.bl.game;

public class GameMain {
    public static void main(String[] args) {

        TicTacToeGame game = new TicTacToeGame();

        game.initializeBoard();
        game.showBoard();
        game.selectInput();
        game.selectBoardLocation();
    }
}