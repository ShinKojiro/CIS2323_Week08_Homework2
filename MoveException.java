public class MoveException extends Exception{
    public MoveException(){
        super("There is already a piece there. Select a different piece or position.");
    }
    
}