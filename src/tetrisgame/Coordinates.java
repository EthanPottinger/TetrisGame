package tetrisgame;

/**
 *
 * @author e.pottinger
 */
public class Coordinates {
    
    public int x;
    public int y;
    
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
    public boolean collisionCheck(boolean[][] board) {
        boolean collision = false;
        if(board[y][x]) collision = true;
        return collision;
    }
    public boolean checkBounds(int length, int height) {
        boolean inBounds = true;
        if(x < 0 || y < 0 || x > length || y > height) inBounds = false;
        return inBounds;
    }
    public boolean check(boolean[][] board) {
        boolean valid = false;
        if(!collisionCheck(board) && checkBounds(board[0].length, board.length)) {
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
