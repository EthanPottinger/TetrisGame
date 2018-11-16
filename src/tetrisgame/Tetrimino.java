package tetrisgame;

/**
 *
 * @author e.pottinger
 */
public abstract class Tetrimino {
    
    protected Coordinates[] coordinateDifferences;
    
    public Tetrimino() {
        coordinateDifferences = new Coordinates[4];
        for(int c = 0; c < coordinateDifferences.length; c++) {
            coordinateDifferences[c] = new Coordinates(0, 0);
        } 
    }
    public Coordinates[] getCoordinatesDifferences() {
        return coordinateDifferences;
    }
    public abstract void rotateClockwise(boolean[][] board, Coordinates center);
    
    public abstract void rotateCounterClockwise(boolean[][] board, Coordinates center);
    
}
