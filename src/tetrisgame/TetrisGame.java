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
        String title = "yee";
        cx.outputGrid("ligma");
        cx.spawnTetrimino(cx.randInt(1, 7));
        cx.outputGrid("fugma");
        cx.moveLeft();
        cx.outputGrid("sugma");
        cx.moveRight();
        cx.outputGrid("sugondese");
        cx.moveDown();
        cx.outputGrid("bofa");
        cx.rotate();
        cx.outputGrid(title);
        
        
    }
    
}
