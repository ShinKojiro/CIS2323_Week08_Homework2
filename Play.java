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
            r1.set(Color.RED);
            r2.set(Color.RED);
            r3.set(Color.RED);
            r4.set(Color.RED);
            r5.set(Color.RED);
            r6.set(Color.RED);
            r7.set(Color.RED);
            r8.set(Color.RED);
            r9.set(Color.RED);
            r10.set(Color.RED);
            r11.set(Color.RED);
            r12.set(Color.RED);

            b1.set(Color.BLACK);
            b2.set(Color.BLACK);
            b3.set(Color.BLACK);
            b4.set(Color.BLACK);
            b5.set(Color.BLACK);
            b6.set(Color.BLACK);
            b7.set(Color.BLACK);
            b8.set(Color.BLACK);
            b9.set(Color.BLACK);
            b10.set(Color.BLACK);
            b11.set(Color.BLACK);
            b12.set(Color.BLACK);

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
            board.setPiece(r1,7,7);
            board.setPiece(r1,7,7);
            board.setPiece(r1,7,7);
            board.setPiece(r1,7,7);
            board.setPiece(r1,7,7);
            board.setPiece(r1,7,7);
            board.setPiece(r1,7,7);
            board.setPiece(r1,7,7);
            board.setPiece(r1,7,7);
            board.setPiece(r1,7,7);
            board.setPiece(r1,7,7);
			
			// Check some stuff on the board
			System.out.println("Location 2x2 is occupied: " + board.checkOccupied(2,2));
			System.out.println("Location 7x7 is occupied: " + board.checkOccupied(7,7));
			System.out.println("Color of the piece at 7x7 is: " + board.checkColor(7,7));
	}
}