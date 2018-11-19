package tetrisgame;

/**
 *
 * @author e.pottinger
 */
public class Coordinates {
    //ayy lmao
    
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
    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
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
    public Coordinates add(Coordinates add) {
        return new Coordinates(x + add.giveX(), y + add.giveY());
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
    public void outputCoordinates() {
        System.out.println("(" + x + ", " + y + ")");
    }
    
}
