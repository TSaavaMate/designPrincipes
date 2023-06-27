package ConreteClasses;

import java.util.List;

public class Move {
    Cell sourceCell;
    Cell destinationCell;
    List<Piece> capturedPieces;

    public Move(Cell sourceCell, Cell destinationCell, List<Piece> capturedPieces) {
        this.sourceCell = sourceCell;
        this.destinationCell = destinationCell;
        this.capturedPieces = capturedPieces;
    }

    public Cell getSourceCell() {
        return sourceCell;
    }

    public Cell getDestinationCell() {
        return destinationCell;
    }

    public List<Piece> getCapturedPieces() {
        return capturedPieces;
    }


}
