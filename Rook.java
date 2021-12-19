package Chess;
//ладья
public class Rook extends ChessPiece {

    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toColumn >= 0 && toColumn <= 7 && toLine >= 0 && toLine <= 7) {
            if (chessBoard.board[toLine][toColumn] == null || chessBoard.board[toLine][toColumn].color != this.color) {
                if (toLine != line && toColumn == column || toLine == line && toColumn != column) {
                    return true;
                } else return false;
            } else return false;
        } else return false;
    }



    @Override
    public String getSymbol() {
        return "R";
    }
}
