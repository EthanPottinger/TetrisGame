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
            Coordinates check = new Coordinates(coordinates[c].giveX() - 1, coordinates[c].giveY() + 1);
            if(!check.check(board)) valid = false;
        }
        if(valid) {
            for(int c = 0; c < coordinates.length; c++) {
                coordinates[c].moveLeft();
            }
        }
    }
    public void spawnTetrimino(int tetrimino) {
        coordinates = new Coordinates[4];
        if(tetrimino == I) {
            coordinates[0] = new Coordinates(3, 19);
            coordinates[1] = new Coordinates(4, 19);
            coordinates[2] = new Coordinates(5, 19);
            coordinates[3] = new Coordinates(6, 19);
        }
        else if(tetrimino == J) {
            
        }
        else if(tetrimino == L) {
            
        }
        else if(tetrimino == T) {
            
        }
        else if(tetrimino == S) {
            
        }
        else if(tetrimino == Z) {
            
        }
        else if(tetrimino == O) {
            
        }
    }
    
}
