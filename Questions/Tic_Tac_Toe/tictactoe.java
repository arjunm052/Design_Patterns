package Design_Patterns.Questions.Tic_Tac_Toe;

import Design_Patterns.Questions.Tic_Tac_Toe.TicTacToeGame;

//Demo class to create and start game
public class tictactoe {
    public static void main(String[] args) {
        // Create a new game
        TicTacToeGame game = new TicTacToeGame();
        // Start it and print out the winner
        System.out.println("Winner is: " + game.startGame());
    }
}