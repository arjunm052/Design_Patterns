package Design_Patterns.Questions.Tic_Tac_Toe.Model;

//Main player class
public class Player {
    // Player name
    public String name;
    // PlayingPiece that the player has
    public PlayingPiece playingPiece;

    // Constructor for player
    public Player(String name, PlayingPiece playingPiece) {
        this.name = name;
        this.playingPiece = playingPiece;
    }

    // Getters and setters for instance variables of player
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }

    public void setPlayingPiece(PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
    }
}
