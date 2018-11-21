package tetrisgame;

/**
 *
 * @author e.pottinger
 */
public class TetrisGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TetrisBoard cx = new TetrisBoard();
        String title = "Fuvk";
        cx.spawnTetrimino();
        cx.outputGrid(title);
        cx.rotate();
        cx.outputGrid(title);
        cx.moveDown();
        cx.outputGrid(title);
        cx.rotate();
        cx.outputGrid(title);
        cx.rotate();
        cx.outputGrid(title);
        cx.rotate();
        cx.outputGrid(title);
        cx.rotate();
        cx.outputGrid(title);
        cx.rotate();
        cx.outputGrid(title);
        
    }
    
}
