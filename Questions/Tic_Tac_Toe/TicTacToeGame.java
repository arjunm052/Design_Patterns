package Design_Patterns.Questions.Tic_Tac_Toe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Design_Patterns.Questions.Tic_Tac_Toe.Model.Board;
import Design_Patterns.Questions.Tic_Tac_Toe.Model.Pair;
import Design_Patterns.Questions.Tic_Tac_Toe.Model.PieceType;
import Design_Patterns.Questions.Tic_Tac_Toe.Model.Player;
import Design_Patterns.Questions.Tic_Tac_Toe.Model.PlayingPiece;
import Design_Patterns.Questions.Tic_Tac_Toe.Model.PlayingPieceO;
import Design_Patterns.Questions.Tic_Tac_Toe.Model.PlayingPieceX;

//Main Game class
public class TicTacToeGame {
    // Dequeue will hold the list of players
    Deque<Player> players;
    // Initialize a board for the game
    Board gameBoard;

    // Constructor for main game class
    public TicTacToeGame() {
        // Call initialize game
        initializeGame();
    }

    // Function to initialize the game
    public void initializeGame() {
        // Initlaize a list to hold player names
        players = new LinkedList<>();

        // Create two new players and their pieces and add them to the players list
        PlayingPiece X = new PlayingPieceX();
        Player player1 = new Player("Arjun", X);

        PlayingPiece O = new PlayingPieceO();
        Player player2 = new Player("Bot", O);

        players.add(player1);
        players.add(player2);

        // Create a board for the required Size
        gameBoard = new Board(3);

    }

    // Function to start the game
    public String startGame() {
        // We will run the game till the point where there is no winner
        boolean noWinner = true;

        // While we dont have a winner
        while (noWinner) {

            // Take out the player whose turn it is
            Player playerTurn = players.removeFirst();

            gameBoard.printBoard();

            // Check if no free space is available and check if it is a draw
            List<Pair> freeSpaces = gameBoard.getFreeSpaces();
            if (freeSpaces.size() == 0) {
                noWinner = false;
                continue;
            }

            // Read the players input
            System.out.print("Player: " + playerTurn.name + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            // place the piece
            boolean pieceAddedSuccesfully = gameBoard.addPiece(inputRow, inputColumn, playerTurn.playingPiece);

            // Check if the piece was added successfully
            if (!pieceAddedSuccesfully) {
                // Player cannot insert the piece in this cell..Try again!!
                System.out.println("Incorrect position chosen, Try again!");
                players.addFirst(playerTurn);
                continue;
            }

            // Check if current player is the winner
            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.playingPiece.pieceType);
            if (winner) {
                return playerTurn.getName();
            }

            // If piece was successfully added then place the current player at the end of
            // list
            players.addLast(playerTurn);

        }

        // If we don't have a winner then return tie
        return "Tie";
    }

    // Function to check whether there is a winner
    public boolean isThereWinner(int row, int col, PieceType pieceType) {
        // We check for row column diagonal and anti diagonal whether there is a match
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // Check Row
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        // Check Column
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[i][col] == null || gameBoard.board[i][col].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        // Check Diagonal
        for (int i = 0, j = 0; i < gameBoard.size; i++, j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        // Check anti-diagonal
        for (int i = 0, j = gameBoard.size - 1; i < gameBoard.size; i++, j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        // If player wins in any one of the above ways then return true elast false;
        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
