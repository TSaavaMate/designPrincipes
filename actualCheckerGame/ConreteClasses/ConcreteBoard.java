package ConreteClasses;

import interfaces.Board;

public class ConcreteBoard implements Board {
    @Override
    public void initializeBoard() {

    }

    @Override
    public boolean isValidMove(String position) {
        return false;
    }

    @Override
    public void makeMove() {

    }

    @Override
    public boolean isGameOver() {
        return false;
    }
}
