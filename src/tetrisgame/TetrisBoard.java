package tetrisgame;

import javax.swing.JOptionPane;

/**
 *
 * @author e.pottinger
 */
public class TetrisBoard {
    
    public final Tetrimino[] TETRIMINOS = {new TetriminoO(), new TetriminoT(), new TetriminoI(), new TetriminoL(), new TetriminoJ(), new TetriminoS(), new TetriminoZ()}; 
    
    private int tetrimino;
    private Coordinates point;
    private boolean[][] board;
    
    
    public TetrisBoard() {
        board = new boolean[20][10];
        point = new Coordinates(5, 0);
    }
    public void setPoint() {
        point.setCoordinates(5, 0);
    }
    public boolean[][] getBoard() {
        return board;
    }
    public void activate(Coordinates coordinate) {
        board[coordinate.giveY()][coordinate.giveX()] = true;
    }
    public void deactivate(Coordinates coordinate) {
        board[coordinate.giveY()][coordinate.giveX()] = false;
    }
    public void updateBoard() {
        clearLines();
        descendLines();
    }
    public void clearLines() {
        boolean[] clear = new boolean[board.length];
        int count = 0;
        for(int y = 0; y < board.length; y++) {
            count = 0;
            for(int x = 0; x < board[0].length; x++) {
                if(board[y][x]) count++;
            }
            if(count == 10) clear[y] = true;
        }
        for(int y = 0; y < clear.length; y++) {
            if(clear[y]) clearLine(y);
        }
    }
    public void clearLine(int y) {
        for(int x = 0; x < board[0].length; x++) {
            board[y][x] = false;
        }
    }
    public void descendLines() {
        boolean[] descend = new boolean[board.length];
        int count = 0;
        for(int y = 0; y < board.length; y++) {
            count = 0;
            for(int x = 0; x < board[0].length; x++) {
                if(board[y][x]) count++;
            }
            if(count > 0) descend[y] = true;
        }
        descendLines(descend);
    }
    public void descendLines(boolean[] descend) {
        int goTo = board.length - 1;
        for(int y = board.length - 1; y >= 0; y--) {
            if(descend[y]) {
                boolean[] row = new boolean[10];
                for(int x = 0; x < row.length; x++) {
                    row[x] = board[y][x];
                }
                for(int x = 0; x < board[0].length; x++) {
                    board[y][x] = false;
                }
                    board[goTo] = row;
                goTo--;
            }
        }
    }
    public void outputGrid(String title) {
        String grid = "";
        Coordinates[] place = getPlace();
        for(int y = 0; y < board.length; y++) {
            for(int x = 0; x < board[0].length; x++) {
                if(board[y][x]) {
                    for(int i = 0; i < 4; i++) {
                        if(y == place[i].giveY() && x == place[i].giveX()) {
                            Coordinates yeet = place[i].subtract(point);
                            grid += yeet.getCoordinates() + "                               ";
                        }
                    }
                }
                else grid += "*                                       ";
            }
            grid += "\n";
        }
        JOptionPane.showMessageDialog(null, grid, title, JOptionPane.PLAIN_MESSAGE);
    }
    public void spawnTetrimino() {
        tetrimino = 5;
        Coordinates[] place = getPlace();
        for(int i = 0; i < 4; i++) {
            if(place[i].valid(board)) board[place[i].giveY()][place[i].giveX()] = true;
            else if(place[i].collision(board))System.exit(0);
        }
    }
    public void deactivateTetrimino() {
        Coordinates[] place = getPlace();
        for (int i = 0; i < 4; i++) {
            if(place[i].inBounds(board) == true) {
                board[place[i].giveY()][place[i].giveX()] = false;
                place[i].outputCoordinates();
            }
        }
    }
    public void moveDown() {
        deactivateTetrimino();
        boolean valid = true;
        Coordinates[] place = getPlace();
        for(int i = 0; i < 4; i++) {
            place[i].moveDown();
            if(place[i].collision(board) == true && place[i].giveY() > 19) valid = false;
        }
        if(valid) point.moveDown();
        updateTetrimino();
        if(!valid) {
            updateBoard();
            setPoint();
            spawnTetrimino();
        }
    }
    public void moveRight() {
        deactivateTetrimino();
        boolean valid = true;
        Coordinates[] place = getPlace();
        for(int i = 0; i < 4; i++) {
            place[i].moveRight();
            if(place[i].valid(board) == false) valid = false;
        }
        if(valid) point.moveRight();
        updateTetrimino();
    }
    public void rotate() {
        deactivateTetrimino();
        TETRIMINOS[tetrimino].rotateClockwise(board, point);
        updateTetrimino();
    }
    public void moveLeft() {
        deactivateTetrimino();
        boolean valid = true;
        Coordinates[] place = getPlace();
        for(int i = 0; i < 4; i++) {
            place[i].moveLeft();
            if(place[i].valid(board) == false) valid = false;
        }
        if(valid) point.moveLeft();
        updateTetrimino();
    }
    public void updateTetrimino() {
        Coordinates[] place = getPlace();
        for(int i = 0; i < 4; i++) {
            if(place[i].valid(board)) {
                board[place[i].giveY()][place[i].giveX()] = true;
                }
        }
    }
    public Coordinates[] getPlace() {
        Coordinates[] place = new Coordinates[4];
        for(int i = 0; i < 4; i++) {
            place[i] = TETRIMINOS[tetrimino].getCoordinatesDifferences()[i].add(point);
        }
        return place;
    }
    public int randInt(int lo, int hi) {
        return (int)((Math.random() * hi - lo + 1) + lo);
    }
    
}
