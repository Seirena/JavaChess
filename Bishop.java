package Chess;
// слон ходит по диагонали бесконечно))
public class Bishop extends ChessPiece {

    public Bishop(String color) {
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
        if (toColumn >= 0 &&toColumn <= 7 && toLine >= 0 && toLine <= 7 && toLine != line && toColumn != column &&
                Math.abs(x) == Math.abs(y)){
            if (chessBoard.board[toLine][toColumn] == null || chessBoard.board[toLine][toColumn].color != this.color){
                return true;
            } else return false;
        } else return false;
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
