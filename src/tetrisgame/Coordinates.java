package tetrisgame;

/**
 *
 * @author e.pottinger
 */
public class Coordinates {
    //ayy lmao
    
    private int r;
    private int i;
    
    public Coordinates(int x, int y) {
        this.r = x;
        this.i = y;
    }
    public int giveX() {
        return r;
    }
    public int giveY() {
        return i;
    }
    public boolean collision(boolean[][] board) {
        boolean collision = false;
        if(inBounds(board) == true) {
            if(board[i][r]) collision = true;
        }
        return collision;
    }
    public boolean inBounds(boolean[][] board) {
        boolean inBounds = true;
        if(r < 0 || i < 0 || r >= board[0].length || i >= board.length) inBounds = false;
        return inBounds;
    }
    public boolean valid(boolean[][] board) {
        boolean valid = false;
        if(collision(board) == false && inBounds(board) == true) {
            valid = true;
        }
        return valid;
    }
    public void moveLeft() {
        r--;
    }
    public void moveRight() {
        r++;
    }
    public void moveUp() {
        i--;
    }
    public void moveDown() {
        i++;
    }
    
}
