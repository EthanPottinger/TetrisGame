package tetrisgame;

/**
 *
 * @author e.pottinger
 */
public class Coordinates {
    //ayy lmao
    
    private int x;
    private int y;
    
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int giveX() {
        return x;
    }
    public int giveY() {
        return y;
    }
    public boolean collision(boolean[][] board) {
        boolean collision = false;
        if(inBounds(board) == true) {
            if(board[y][x]) collision = true;
        }
        return collision;
    }
    public boolean inBounds(boolean[][] board) {
        boolean inBounds = true;
        if(x < 0 || y < 0 || x >= board[0].length || y >= board.length) inBounds = false;
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
        x--;
    }
    public void moveRight() {
        x++;
    }
    public void moveUp() {
        y--;
    }
    public void moveDown() {
        y++;
    }
    
}
