import java.util.*;

public class Play {
	public static void main(String[] args){
		// Get out our board and pieces
		Board board = new Board();
        CheckersPiece r1 = new CheckersPiece();
        CheckersPiece r2 = new CheckersPiece();
        CheckersPiece r3 = new CheckersPiece();
        CheckersPiece r4 = new CheckersPiece();
        CheckersPiece r5 = new CheckersPiece();
        CheckersPiece r6 = new CheckersPiece();
        CheckersPiece r7 = new CheckersPiece();
        CheckersPiece r8 = new CheckersPiece();
        CheckersPiece r9 = new CheckersPiece();
        CheckersPiece r10 = new CheckersPiece();
        CheckersPiece r11 = new CheckersPiece();
        CheckersPiece r12 = new CheckersPiece();

        CheckersPiece b1 = new CheckersPiece();
        CheckersPiece b2 = new CheckersPiece();
        CheckersPiece b3 = new CheckersPiece();
        CheckersPiece b4 = new CheckersPiece();
        CheckersPiece b5 = new CheckersPiece();
        CheckersPiece b6 = new CheckersPiece();
        CheckersPiece b7 = new CheckersPiece();
        CheckersPiece b8 = new CheckersPiece();
        CheckersPiece b9 = new CheckersPiece();
        CheckersPiece b10 = new CheckersPiece();
        CheckersPiece b11 = new CheckersPiece();
        CheckersPiece b12 = new CheckersPiece();
			
			// Setup board and pieces
        r1.setColor(Color.RED);
        r2.setColor(Color.RED);
        r3.setColor(Color.RED);
        r4.setColor(Color.RED);
        r5.setColor(Color.RED);
        r6.setColor(Color.RED);
        r7.setColor(Color.RED);
        r8.setColor(Color.RED);
        r9.setColor(Color.RED);
        r10.setColor(Color.RED);
        r11.setColor(Color.RED);
        r12.setColor(Color.RED);

        b1.setColor(Color.BLACK);
        b2.setColor(Color.BLACK);
        b3.setColor(Color.BLACK);
        b4.setColor(Color.BLACK);
        b5.setColor(Color.BLACK);
        b6.setColor(Color.BLACK);
        b7.setColor(Color.BLACK);
        b8.setColor(Color.BLACK);
        b9.setColor(Color.BLACK);
        b10.setColor(Color.BLACK);
        b11.setColor(Color.BLACK);
        b12.setColor(Color.BLACK);

        board.setPiece(b1,0,0);
        board.setPiece(b2,0,2);
        board.setPiece(b3,0,4);
        board.setPiece(b4,0,6);
        board.setPiece(b5,1,1);
        board.setPiece(b6,1,3);
        board.setPiece(b7,1,5);
        board.setPiece(b8,1,7);
        board.setPiece(b9,2,0);
        board.setPiece(b10,2,2);
        board.setPiece(b11,2,4);
        board.setPiece(b12,2,6);

        board.setPiece(r1,7,7);
        board.setPiece(r2,7,5);
        board.setPiece(r3,7,3);
        board.setPiece(r4,7,1);
        board.setPiece(r5,6,6);
        board.setPiece(r6,6,4);
        board.setPiece(r7,6,2);
        board.setPiece(r8,6,0);
        board.setPiece(r9,5,7);
        board.setPiece(r10,5,5);
        board.setPiece(r11,5,3);
        board.setPiece(r12,5,3);
		
			// Check some stuff on the board
        System.out.println("Location 2x2 is occupied: " + board.checkOccupied(2,2));
        System.out.println("Location 3x2 is occupied: " + board.checkOccupied(3,2));
        System.out.println("Location 1x3 is occupied: " + board.checkOccupied(1,3));
            
        try {
            System.out.println("Location 8x7 is occupied: " + board.checkOccupied(8,7));
        } catch (ArrayIndexOutOfBoundsException e) {
            //TODO: handle exception
            System.out.println("8x7 is out of bounds");
        }
        System.out.println("Color of the piece at 7x7 is: " + board.checkColor(7,7));
        System.out.println("Location 1x4 is occupied: " + board.checkOccupied(1,4));
        System.out.println("Location 2x4 is occupied: " + board.checkOccupied(2,4));
        System.out.println("Location 7x7 is occupied: " + board.checkOccupied(7,7));
    }
}