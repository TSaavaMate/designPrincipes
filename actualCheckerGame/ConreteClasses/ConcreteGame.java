package ConreteClasses;

import abstractclasses.AbstractGame;
import interfaces.Board;
import interfaces.Game;
import interfaces.Player;

public class ConcreteGame extends AbstractGame {
    public ConcreteGame(Board board, Player currentPlayer) {
        super(board, currentPlayer);
    }
}
