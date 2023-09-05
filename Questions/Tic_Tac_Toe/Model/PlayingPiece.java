package Design_Patterns.Questions.Tic_Tac_Toe.Model;

//PlayingPiece will have one of the values from enum
public class PlayingPiece {
    public PieceType pieceType;

    PlayingPiece(PieceType type) {
        this.pieceType = type;
    }
}
