package ConreteClasses;

public class Cell {
    private final String position;
    private Piece piece;

    public Cell(String position, Piece piece) {
        this.position = position;
        this.piece = piece;
    }
    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    public boolean isEmpty(){return false;}


}

