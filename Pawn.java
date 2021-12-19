package Chess;
//пешка ходит только вперед. Реализовать атаки по диагонали????
public class Pawn extends ChessPiece{

    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        int x = toLine - line;
        int y = toColumn - column;
        if (toColumn >= 0 && toColumn < 7 && toLine >= 0 && toLine < 7 && toLine != line && toColumn == column) {
            if (color == "White" && line == 1 || color == "Black" && line == 6) {
                if (Math.abs(x) == 2 || Math.abs(x) == 1) {
                    return true;
                } else return false;
            } else if (Math.abs(x) == 1) {
                return true;
            } else return false;
        } else if (toColumn >= 0 && toColumn < 7 && toLine >= 0 && toLine < 7 && toLine != line && toColumn != column &&
                Math.abs(x) == 1 && Math.abs(y) == 1 &&
                chessBoard.board[toLine][toColumn].color != this.color && chessBoard.board[toLine][toColumn] != null){
            return true;
        } else return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
