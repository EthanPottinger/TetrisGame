package tetrisgame;

/**
 * TetriminoL.java - 
 * 
 * @author Ethan Pottinger
 * @since 16-Nov-2018
 */
public class TetriminoL extends Tetrimino {

    public TetriminoL() {
        coordinateDifferences[0] = new Coordinates(0, 0);
        coordinateDifferences[1] = new Coordinates(-1, 0);
        coordinateDifferences[2] = new Coordinates(1, 0);
        coordinateDifferences[3] = new Coordinates(-1, 1);
    }

    @Override
    public void rotateClockwise(boolean[][] board, Coordinates center) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rotateCounterClockwise(boolean[][] board, Coordinates center) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
