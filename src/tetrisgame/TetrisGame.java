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
        for(int i = 19; i >= 7; i--) {
            cx.activate(new Coordinates(0, i));
            cx.activate(new Coordinates(1, i));
            cx.activate(new Coordinates(2, i));
            cx.activate(new Coordinates(7, i));
            cx.activate(new Coordinates(8, i));
            cx.activate(new Coordinates(9, i));
        }
        cx.outputGrid("ligma");
        cx.spawnTetrimino(cx.randInt(1, 7));
        cx.outputGrid("fugma");
        cx.moveLeft();
        cx.outputGrid("sugma");
        cx.moveRight();
        cx.outputGrid("sugondese");
        cx.moveDown();
        cx.outputGrid("bofa");
        for(int i = 0; i < 10000; i++) {
            cx.moveDown();
            cx.outputGrid("steve jobs");
        }
        
    }
    
}
