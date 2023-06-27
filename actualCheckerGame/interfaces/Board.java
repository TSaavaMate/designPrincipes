package interfaces;

public interface Board {
    void initializeBoard();
    boolean isValidMove(String position);
    void makeMove();
    boolean isGameOver();
}
