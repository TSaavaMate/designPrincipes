package abstractclasses;

import ConreteClasses.Color;
import ConreteClasses.Piece;
import interfaces.Player;

import java.util.List;

public abstract class AbstractPlayer implements Player {
    Color color;
    List<Piece> capturedPiece;
}
