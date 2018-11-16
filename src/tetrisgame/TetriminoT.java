package tetrisgame;

/**
 * TetriminoT.java - 
 * 
 * @author Ethan Pottinger
 * @since 16-Nov-2018
 */
public class TetriminoT extends Tetrimino {

    public TetriminoT() {
        coordinateDifferences[0] = new Coordinates(0, 0);
        coordinateDifferences[1] = new Coordinates(1, 0);
        coordinateDifferences[2] = new Coordinates(-1, 0);
        coordinateDifferences[3] = new Coordinates(0, 1);
    }

    @Override
    public void rotateClockwise(boolean[][] board, Coordinates center) {
        
    }

    @Override
    public void rotateCounterClockwise(boolean[][] board, Coordinates center) {
        
    }

}
