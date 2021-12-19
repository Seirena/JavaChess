package Chess;

public class King extends ChessPiece{

    public King(String color) {
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
        if(toColumn >= 0 &&toColumn <= 7 && toLine >= 0 && toLine <= 7){
            if(chessBoard.board[toLine][toColumn] == null || chessBoard.board[toLine][toColumn].color != this.color){
                if(Math.abs(x) == 1 && Math.abs(y) == 1){
                    return true;
                } else if (toLine == line && Math.abs(y) == 1 || Math.abs(x) == 1 && toColumn == column){
                    return true;
                } else return false;
            } else return false;
        } else return false;
    }

    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column) {
        if (column >= 0 && column <= 7 && line >= 0 && line <= 7) {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    if (chessBoard.board[i][j] != null) {
                        if (!chessBoard.board[i][j].getColor().equals(color) && chessBoard.board[i][j].canMoveToPosition(chessBoard, i, j, line, column)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } else return false;
    }

    @Override
    public String getSymbol() {
        return "K";
    }
}
