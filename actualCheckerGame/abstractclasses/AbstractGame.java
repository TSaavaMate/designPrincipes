package abstractclasses;

import interfaces.Board;
import interfaces.Game;
import interfaces.Player;

public abstract class AbstractGame implements Game {
    Board board;
    Player currentPlayer;

    public AbstractGame(Board board, Player currentPlayer) {
        this.board = board;
        this.currentPlayer = currentPlayer;
    }

    @Override
    public void startGame() {

    }

    @Override
    public void switchPlayer() {

    }

    @Override
    public void processMove() {

    }
}
