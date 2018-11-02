package tetrisgame;

import javax.swing.*;

/**
 * Graphics1.java - 
 * 
 * @author Ethan Pottinger
 * @since 2-Nov-2018
 */
public class Graphics1 extends JFrame {

    private TetrisBoard board;
    private JTable tetris;
    
    public Graphics1() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Tetris biyatch");
        this.setResizable(false);
        this.setLocation(0, 0);
        this.setSize(500, 1000);
        this.setVisible(true);
        
        tetris = new JTable(setBoard(), new Object[] {null, null, null, null});
    }
    public String[][] setBoard() {
        String[][] yeet = new String[board.getBoard().length][board.getBoard()[0].length];
        for (int i = 0; i < board.getBoard()[0].length; i++) {
            for (int j = 0; j < board.getBoard().length; j++) {
                if(board.getBoard()[j][i]) yeet[j][i] = "True";
                else yeet[j][i] = "false";
            }
        }
        return yeet;
    }

}
