package Chess;
//конь
public class Horse extends ChessPiece{

    public Horse(String color) {
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
        if (toColumn >= 0 &&toColumn <= 7 && toLine >= 0 && toLine <= 7 && toLine != line && toColumn != column){
            if(chessBoard.board[toLine][toColumn] == null || chessBoard.board[toLine][toColumn].color != this.color){
                if (Math.abs(x) == 2 && Math.abs(y) == 1 || Math.abs(y) == 2 && Math.abs(x) == 1){
                    return true;
                } else return false;
            } else return false;
        } else return false;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
