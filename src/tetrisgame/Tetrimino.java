package tetrisgame;

/**
 *
 * @author e.pottinger
 */
public class Tetrimino {
    
    public Coordinates[] coordinates;
    public final int I = 1;
    public final int J = 2;
    public final int L = 3;
    public final int T = 4;
    public final int S = 5;
    public final int Z = 6;
    public final int O = 7;
    
    public Tetrimino() {
        coordinates = new Coordinates[4];
        for(int c = 0; c < coordinates.length; c++) {
            coordinates[c] = new Coordinates(0, 0);
        } 
    }
    public Coordinates[] getCoordinates() {
        return coordinates;
    }
    public void moveDown(boolean[][] board) {
        if(valid(board, 0, 1)) {
            for(int c = 0; c < coordinates.length; c++) {
                coordinates[c].moveDown();
            }
        }
    }
    public void moveRight(boolean[][] board) {
        if(valid(board, 1, 0)) {
            for(int c = 0; c < coordinates.length; c++) {
                coordinates[c].moveRight();
            }
        }
    }
    public void moveLeft(boolean[][] board) {
        if(valid(board, -1, 0)) {
            for(int c = 0; c < coordinates.length; c++) {
                coordinates[c].moveLeft();
            }
        }
    }
    public void rotateClockwise(boolean[][] board, Coordinates center) {
        Coordinates[] rotate = coordinateDifferences(center);
        for(int i = 0; i < 4; i++) {
            if(rotate[i].giveX() == 0 && Math.abs(rotate[i].giveY()) == 1) {
                System.out.println("edge, top, bottom");
                coordinates[i] = new Coordinates(coordinates[i].giveY(), coordinates[i].giveX());
            }
            else if(rotate[i].giveY() == 0 && Math.abs(rotate[i].giveX()) == 1) {
                System.out.println("edge, left, right");
                coordinates[i] = new Coordinates(coordinates[i].giveY(), coordinates[i].giveX() * -1);
            }
            else if(rotate[i].giveY() == rotate[i].giveX() && rotate[i].giveX() != 0) {
                System.out.println("corners, toplleft, bottomright");
                coordinates[i] = new Coordinates(coordinates[i].giveX() * -1, coordinates[i].giveY());
            }
            else if(rotate[i].giveX() != rotate[i].giveY()) {
                System.out.println("corners, topright, bottom, left");
                coordinates[i] = new Coordinates(coordinates[i].giveX() , coordinates[i].giveY() * -1);
            }
        }
    }
    public void rotateCounterClockwise(boolean[][] board, Coordinates center) {
        
    }
    public Coordinates[] coordinateDifferences(Coordinates center) {
        Coordinates[] rotate = new Coordinates[4];
        for(int i = 0; i < 4; i++) {
            rotate[i] = new Coordinates(coordinates[i].giveX() - center.giveX(), 
                                        coordinates[i].giveY() - center.giveY());
        }
        return rotate;
    }
    public boolean valid(boolean[][] board, int xChange, int yChange) {
        boolean valid = true;
        for(int c = 0; c < coordinates.length; c++) {
            Coordinates check =  new Coordinates(coordinates[c].giveX() + xChange, coordinates[c].giveY() + yChange);
            if(check.valid(board) == false) valid = false;
        }
        System.out.println(valid);
        return valid;
    }
    public void createTetrimino(int tetrimino) {
        coordinates = new Coordinates[4];
        if(tetrimino == I) {
            coordinates[0] = new Coordinates(5, 0);
            coordinates[1] = new Coordinates(3, 0);
            coordinates[2] = new Coordinates(4, 0);
            coordinates[3] = new Coordinates(6, 0);
        }
        else if(tetrimino == J) {
            coordinates[0] = new Coordinates(5, 0);
            coordinates[1] = new Coordinates(6, 1);
            coordinates[2] = new Coordinates(6, 0);
            coordinates[3] = new Coordinates(4, 0);
        }
        else if(tetrimino == L) {
            coordinates[0] = new Coordinates(5, 0);
            coordinates[1] = new Coordinates(6, 0);
            coordinates[2] = new Coordinates(4, 0);
            coordinates[3] = new Coordinates(4, 1);
        }
        else if(tetrimino == T) {
            coordinates[0] = new Coordinates(5, 0);
            coordinates[1] = new Coordinates(6, 0);
            coordinates[2] = new Coordinates(5, 1);
            coordinates[3] = new Coordinates(4, 0);
        }
        else if(tetrimino == S) {
            coordinates[0] = new Coordinates(5, 0);
            coordinates[1] = new Coordinates(6, 0);
            coordinates[2] = new Coordinates(5, 1);
            coordinates[3] = new Coordinates(4, 1);
        }
        else if(tetrimino == Z) {
            coordinates[0] = new Coordinates(5, 0);
            coordinates[1] = new Coordinates(4, 0);
            coordinates[2] = new Coordinates(5, 1);
            coordinates[3] = new Coordinates(6, 1);
        }
        else if(tetrimino == O) {
            coordinates[0] = new Coordinates(4, 0);
            coordinates[1] = new Coordinates(5, 0);
            coordinates[2] = new Coordinates(4, 1);
            coordinates[3] = new Coordinates(5, 1);
        }
    }
    
}
