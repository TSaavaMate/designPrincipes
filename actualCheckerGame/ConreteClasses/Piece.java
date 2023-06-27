package ConreteClasses;

public class Piece {
    Color color;
    Type type;

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }

    public Piece(Color color, Type type) {
        this.color = color;
        this.type = type;
    }

    public boolean isKing(){return false;}
}
