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
        boolean valid = true;
        for(int c = 0; c < coordinates.length; c++) {
            Coordinates check = new Coordinates(coordinates[c].giveX(), coordinates[c].giveY() + 1);
            if(!check.check(board)) valid = false;
        }
        if(valid) {
            for(int c = 0; c < coordinates.length; c++) {
                coordinates[c].moveDown();
            }
        }
    }
    public void moveRight(boolean[][] board) {
        boolean valid = true;
        for(int c = 0; c < coordinates.length; c++) {
            Coordinates check = new Coordinates(coordinates[c].giveX() + 1, coordinates[c].giveY());
            if(!check.check(board)) valid = false;
        }
        if(valid) {
            for(int c = 0; c < coordinates.length; c++) {
                coordinates[c].moveRight();
            }
        }
    }
    public void moveLeft(boolean[][] board) {
        boolean valid = true;
        for(int c = 0; c < coordinates.length; c++) {
            Coordinates check = new Coordinates(coordinates[c].giveX() - 1, coordinates[c].giveY());
            if(!check.check(board)) valid = false;
        }
        if(valid) {
            for(int c = 0; c < coordinates.length; c++) {
                coordinates[c].moveLeft();
            }
        }
    }
    public void createTetrimino(int tetrimino) {
        coordinates = new Coordinates[4];
        if(tetrimino == I) {
            coordinates[0] = new Coordinates(3, 0);
            coordinates[1] = new Coordinates(4, 0);
            coordinates[2] = new Coordinates(5, 0);
            coordinates[3] = new Coordinates(6, 0);
        }
        else if(tetrimino == J) {
            coordinates[0] = new Coordinates(6, 1);
            coordinates[1] = new Coordinates(6, 0);
            coordinates[2] = new Coordinates(5, 0);
            coordinates[3] = new Coordinates(4, 0);
        }
        else if(tetrimino == L) {
            coordinates[0] = new Coordinates(6, 0);
            coordinates[1] = new Coordinates(5, 0);
            coordinates[2] = new Coordinates(4, 0);
            coordinates[3] = new Coordinates(4, 1);
        }
        else if(tetrimino == T) {
            coordinates[0] = new Coordinates(6, 0);
            coordinates[1] = new Coordinates(5, 0);
            coordinates[2] = new Coordinates(5, 1);
            coordinates[3] = new Coordinates(4, 0);
        }
        else if(tetrimino == S) {
            coordinates[0] = new Coordinates(6, 0);
            coordinates[1] = new Coordinates(5, 0);
            coordinates[2] = new Coordinates(5, 1);
            coordinates[3] = new Coordinates(4, 1);
        }
        else if(tetrimino == Z) {
            coordinates[0] = new Coordinates(4, 0);
            coordinates[1] = new Coordinates(5, 0);
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
