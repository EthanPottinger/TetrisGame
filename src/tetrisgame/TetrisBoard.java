package tetrisgame;

import javax.swing.JOptionPane;

/**
 *
 * @author e.pottinger
 */
public class TetrisBoard {
    
    private boolean[][] board;
    private Tetrimino tetrimino;
    
    public TetrisBoard() {
        board = new boolean[20][10];
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
        for(int y = 0; y < board.length; y++) {
            for(int x = 0; x < board[0].length; x++) {
                if(board[y][x]) grid += "X   ";
                else grid += "*    ";
            }
            grid += "\n";
        }
        JOptionPane.showMessageDialog(null, grid, title, JOptionPane.PLAIN_MESSAGE);
    }
    public void spawnTetrimino() {
        
    }
    
}