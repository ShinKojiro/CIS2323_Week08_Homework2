public class Board{
    // private int vPos;
    // private int hPos;
    // private final int PIECES_PER_PLAYER = 12;
    //private String boardPosition;
    //private String pieceName;
    // private final int BOARD_SQUARES = 8;
    // private int b = 0;
    //private Boolean isFilled = false;
    private CheckersPiece[][] board = new CheckersPiece[8][8];

    public void setPiece(CheckersPiece p, int x, int y) throws MoveException{
        // error if x or y are > 7
        if (checkOccupied(x, y) == false){
             board[x][y] = p;
        }
        else{
            throw(new MoveException());
        }
        
    }

    public void movePiece(){
        
    }

    public Boolean checkOccupied(int x, int y){
        return (board[x][y] != null);
    }

    public Color checkColor(int x, int y){
        return board[x][y].getColor();
    }

    // public Board(int x, int y){
    //     vPos = x;
    //     hPos = y;
    // }

    // public void boardSize(int h, int v){
    //     chessBoard = new String[h][v];
    // }
    // public void fillEmptyBoard(){
    //     for (int x = 0; x < 8; x++) {
    //         for (int y = 0; y < 8; y++) {
    //             Board[x][y] = 0;
    //         }
    //     }
    // }
    
    // public String getPiece(){
    //     String boardPosition = (hPos + "" + vPos);
    //     return boardPosition;
    // }
    // public void printBoard(int x, int y){
    //     System.out.print(" " + Board[x][y].toString());
    // }
}