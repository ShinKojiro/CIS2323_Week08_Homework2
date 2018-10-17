public class CheckersPiece{
    private static int numOfPieces;
    private Color color;
    private int id;

    public CheckersPiece(){
        id = numOfPieces;
        numOfPieces++;
    }
    
    public void setColor(Color c){
        color = c;
    }
    
    public Color getColor(){
        return color;
    }
    
    
    // private Color color;
    // // private int vPos;
    // // private int hPos;
    // // private String pieceType;
    // private int[][] checkersPiece = new int[8][8];

    // public checkesPiece(Color c, int x, int y){
    //     color = c;
    // }
    // public void setColor(String c){
    //     Color = c;
    // }
    // public String getColor(){
    //     Return Color;
    // }

    // public int getPosition(){
    //     return vPos + " " + hPos;
    // }
    // public void setPosition(int x, int y){
    //     vPos = x;
    //     hPos = y;
    // }
    // public String getColor(){
    //     return color;
    // }
    // public void setColor(String pieceColor){
    //     color = pieceColor;
    // }
    // public String getPieceType(){
    //     return pieceType;
    // }
    // public void setPieceType(String name){
    //     pieceType = name;
    // }
    // public String printInfo(){
    //     return getPieceType() + " is " + getColor() + " at " getPosition();
    // }
}