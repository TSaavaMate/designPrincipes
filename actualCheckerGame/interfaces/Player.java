package interfaces;

import ConreteClasses.Color;
import ConreteClasses.Piece;

import java.util.List;

public interface Player {
    Color getColor();
    List<Piece> getCapturedPieces();
}
