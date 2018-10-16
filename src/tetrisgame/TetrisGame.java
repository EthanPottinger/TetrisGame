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
        cx.activate(new Coordinates(0, 19));
        cx.activate(new Coordinates(1, 19));
        cx.activate(new Coordinates(2, 19));
        cx.activate(new Coordinates(3, 19));
        cx.activate(new Coordinates(6, 19));
        cx.activate(new Coordinates(7, 19));
        cx.activate(new Coordinates(8, 19));
        cx.activate(new Coordinates(9, 19));
        cx.outputGrid("ligma");
        cx.spawnTetrimino();
        cx.outputGrid("fugma");
        cx.moveLeft();
        cx.outputGrid("sugma");
        cx.moveRight();
        cx.outputGrid("sugondese");
        cx.moveDown();
        cx.outputGrid("bofa");
        for(int i = 0; i < 19; i++) {
            cx.moveDown();
            cx.outputGrid("steve jobs");
        }
        
    }
    
}
