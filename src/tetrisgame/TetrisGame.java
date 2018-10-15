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
       cx.activate(new Coordinates(4, 1));
       cx.activate(new Coordinates(2,0));
       cx.activate(new Coordinates(7, 0));
       String title = "yee";
       cx.outputGrid("ligma");
       cx.spawnTetrimino();
       cx.outputGrid("fugma");
       cx.moveLeft();
       cx.outputGrid("sugma");
       cx.moveRight();
       cx.outputGrid("sugondese");
       cx.moveDown();
       cx.outputGrid("bofa");
        
    }
    
}
