/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tetrisgame;

/**
 * TetriminoS.java - 
 * 
 * @author Ethan Pottinger
 * @since 16-Nov-2018
 */
public class TetriminoS extends Tetrimino {

    public TetriminoS() {
        coordinateDifferences[0] = new Coordinates(0, 0);
        coordinateDifferences[1] = new Coordinates(0, 1);
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
