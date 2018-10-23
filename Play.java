import java.util.*;

public class Play {
	public static void main(String[] args){
		// Get out our board and pieces
        Board board = new Board();
        Scanner inputDevice = new Scanner(System.in);
        int pieceSelect = 0;
        int pieceId;
        int xSelect = 0;
        int ySelect = 0;
        char cont = 'y';
        final int PIECES_PER_PLAYER = 12;

        CheckersPiece[] rPieces = new CheckersPiece[PIECES_PER_PLAYER];
        CheckersPiece[] bPieces = new CheckersPiece[PIECES_PER_PLAYER];

        int i = 0;
        while(i < PIECES_PER_PLAYER){
            rPieces[i] = new CheckersPiece();
            bPieces[i] = new CheckersPiece();
            rPieces[i].setColor(Color.RED);
            bPieces[i].setColor(Color.BLACK);
            rPieces[i].setPieceNumber(i);
            bPieces[i].setPieceNumber(i);
            // rPieces[i].setPosition((x + 1) , y1);
            // bPieces[i].setPosition((x + 1) , y2);
            i++;
        }
        // for(int j = 0; j < PIECES_PER_PLAYER; j++){

        //     System.out.println(rPieces[j].printInfo());
        // }
        // for(int j = 0; j < PIECES_PER_PLAYER; j++){
            
        //     System.out.println(bPieces[j].printInfo());
        // }
        
        // CheckersPiece r1 = new CheckersPiece();
        // CheckersPiece r2 = new CheckersPiece();
        // CheckersPiece r3 = new CheckersPiece();
        // CheckersPiece r4 = new CheckersPiece();
        // CheckersPiece r5 = new CheckersPiece();
        // CheckersPiece r6 = new CheckersPiece();
        // CheckersPiece r7 = new CheckersPiece();
        // CheckersPiece r8 = new CheckersPiece();
        // CheckersPiece r9 = new CheckersPiece();
        // CheckersPiece r10 = new CheckersPiece();
        // CheckersPiece r11 = new CheckersPiece();
        // CheckersPiece r12 = new CheckersPiece();

        // CheckersPiece b1 = new CheckersPiece();
        // CheckersPiece b2 = new CheckersPiece();
        // CheckersPiece b3 = new CheckersPiece();
        // CheckersPiece b4 = new CheckersPiece();
        // CheckersPiece b5 = new CheckersPiece();
        // CheckersPiece b6 = new CheckersPiece();
        // CheckersPiece b7 = new CheckersPiece();
        // CheckersPiece b8 = new CheckersPiece();
        // CheckersPiece b9 = new CheckersPiece();
        // CheckersPiece b10 = new CheckersPiece();
        // CheckersPiece b11 = new CheckersPiece();
        // CheckersPiece b12 = new CheckersPiece();
			
			// Setup board and pieces
        // r1.setColor(Color.RED);
        // r2.setColor(Color.RED);
        // r3.setColor(Color.RED);
        // r4.setColor(Color.RED);
        // r5.setColor(Color.RED);
        // r6.setColor(Color.RED);
        // r7.setColor(Color.RED);
        // r8.setColor(Color.RED);
        // r9.setColor(Color.RED);
        // r10.setColor(Color.RED);
        // r11.setColor(Color.RED);
        // r12.setColor(Color.RED);

        // b1.setColor(Color.BLACK);
        // b2.setColor(Color.BLACK);
        // b3.setColor(Color.BLACK);
        // b4.setColor(Color.BLACK);
        // b5.setColor(Color.BLACK);
        // b6.setColor(Color.BLACK);
        // b7.setColor(Color.BLACK);
        // b8.setColor(Color.BLACK);
        // b9.setColor(Color.BLACK);
        // b10.setColor(Color.BLACK);
        // b11.setColor(Color.BLACK);
        // b12.setColor(Color.BLACK);
        try {
            board.setPiece(rPieces[0],0,0);
            board.setPiece(rPieces[1],0,2);
            board.setPiece(rPieces[2],0,4);
            board.setPiece(rPieces[3],0,6);
            board.setPiece(rPieces[4],1,1);
            board.setPiece(rPieces[5],1,3);
            board.setPiece(rPieces[6],1,5);
            board.setPiece(rPieces[7],1,7);
            board.setPiece(rPieces[8],2,0);
            board.setPiece(rPieces[9],2,2);
            board.setPiece(rPieces[10],2,4);
            board.setPiece(rPieces[11],2,6);

            board.setPiece(bPieces[0],7,7);
            board.setPiece(bPieces[1],7,5);
            board.setPiece(bPieces[2],7,3);
            board.setPiece(bPieces[3],7,1);
            board.setPiece(bPieces[4],6,6);
            board.setPiece(bPieces[5],6,4);
            board.setPiece(bPieces[6],6,2);
            board.setPiece(bPieces[7],6,0);
            board.setPiece(bPieces[8],5,7);
            board.setPiece(bPieces[9],5,5);
            board.setPiece(bPieces[10],5,3);
            board.setPiece(bPieces[11],5,1);
        } catch (MoveException e) {
            //TODO: handle exception
            System.out.println("There is already a piece there. Select a different piece or position.");
        }
        while(cont != 'n' && cont != 'N'){
            System.out.print("What piece do you want to move? (You can enter 1 - 12: ");
            try {
                pieceSelect = inputDevice.nextInt();
                pieceSelect = (pieceSelect - 1);
                inputDevice.nextLine();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Please enter a proper piece identifier (b1 - b12 or r1- r12");
            }

            System.out.print("Please select the new x position: ");
            try {
                xSelect = inputDevice.nextInt();
                xSelect = (xSelect - 1);
            } catch (Exception e) {
                //TODO: handle exception
                inputDevice.nextLine();
                System.out.println("Error: Please enter a number 1 through 8");
            }

            System.out.print("Please select the new y position: ");
            try {
                ySelect = inputDevice.nextInt();
                ySelect = (ySelect - 1);
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Error: Please enter a number 1 through 8");
            }

            // if(board.checkOccupied(xSelect, ySelect) == true){
            //     System.out.println("Space is occupied");
            // }
            // else{
            //     board.setPiece(rPieces[pieceSelect], xSelect, ySelect);
            //     System.out.println("You now have a " + board.checkColor(xSelect, ySelect) + " piece at " + (xSelect + 1) + " " + (ySelect + 1) + "\n" +
            //     "Occupy check: " + board.checkOccupied(xSelect, ySelect));
            //     System.out.println("Piece successfully set");
            // }

            try {
                
                board.setPiece(rPieces[pieceSelect], xSelect, ySelect);
                System.out.println("You now have a " + board.checkColor(xSelect, ySelect) + " piece at " + (xSelect + 1) + " " + (ySelect + 1) + "\n" +
                "Occupy check: " + board.checkOccupied(xSelect, ySelect));
                int removeIndex = pieceSelect;

                for(int j = removeIndex; j < rPieces.length -1; j++){
                    rPieces[j] = rPieces[j + 1];
                }
                
            } catch (MoveException e) {
                //TODO: handle exception
                System.out.println("There is already a piece there. Select a different piece or position.");

            }
        }
        

        
		
			// Check some stuff on the board
        // System.out.println("Location 2x2 is occupied: " + board.checkOccupied(2,2));
        // System.out.println("Location 3x2 is occupied: " + board.checkOccupied(3,2));
        // System.out.println("Location 1x3 is occupied: " + board.checkOccupied(1,3));
            
        // try {
        //     System.out.println("Location 8x7 is occupied: " + board.checkOccupied(8,7));
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     // TODO: handle exception
        //     System.out.println("8x7 is out of bounds");
        // }
        // System.out.println("Color of the piece at 7x7 is: " + board.checkColor(7,7));
        // System.out.println("Location 1x4 is occupied: " + board.checkOccupied(1,4));
        // System.out.println("Location 2x4 is occupied: " + board.checkOccupied(2,4));
        // System.out.println("Location 7x7 is occupied: " + board.checkOccupied(7,7));

    }
}