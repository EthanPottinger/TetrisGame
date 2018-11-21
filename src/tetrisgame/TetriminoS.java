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
        for(int i = 0; i < coordinateDifferences.length; i++) {
            if(coordinateDifferences[i].equals(new Coordinates(-1, -1)) || coordinateDifferences[i].equals(new Coordinates(1, 1))) {
                coordinateDifferences[i].setCoordinates(coordinateDifferences[i].giveX(), coordinateDifferences[i].giveY() * -1);
            }
            else if(coordinateDifferences[i].equals(new Coordinates(-1, 1)) || coordinateDifferences[i].equals(new Coordinates(1, -1))) {
                coordinateDifferences[i].setCoordinates(coordinateDifferences[i].giveX() * -1, coordinateDifferences[i].giveY());
            }
            else if(coordinateDifferences[i].equals(new Coordinates(-1, 0)) || coordinateDifferences[i].equals(new Coordinates(1, 0))) {
                coordinateDifferences[i].setCoordinates(coordinateDifferences[i].giveY(), coordinateDifferences[i].giveX() * -1);
            }
            else if(coordinateDifferences[i].equals(new Coordinates(0, -1)) || coordinateDifferences[i].equals(new Coordinates(0, 1))) {
                coordinateDifferences[i].setCoordinates(coordinateDifferences[i].giveY(), coordinateDifferences[i].giveX());
            }
        }
    }

    @Override
    public void rotateCounterClockwise(boolean[][] board, Coordinates center) {
        
    }
    
}
