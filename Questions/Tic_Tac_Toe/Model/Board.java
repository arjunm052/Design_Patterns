package Design_Patterns.Questions.Tic_Tac_Toe.Model;

import java.util.ArrayList;
import java.util.List;

//Main board that game uses
public class Board {
    // board size
    public int size;
    // board array
    public PlayingPiece[][] board;

    // Constructor for Board. Pass size as parameter when creating board
    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    // Function to add a piece to the board
    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {
        if (row >= size || col >= size || board[row][col] != null) {
            return false;
        }
        board[row][col] = playingPiece;
        return true;
    }

    // Function to get List of all the free spaces currently on the board
    public List<Pair> getFreeSpaces() {
        List<Pair> freeSpaces = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    freeSpaces.add(new Pair(i, j));
                }
            }
        }

        return freeSpaces;
    }

    // Function to print the current board
    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }

            System.out.println();
        }
    }
}
