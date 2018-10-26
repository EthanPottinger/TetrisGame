package tetrisgame;

/**
 * ComplexNumber.java - 
 * 
 * @author Ethan Pottinger
 * @since 26-Oct-2018
 */
public class ComplexNumber {
    
    public int z;
    public final int IMAGINARY;

    public ComplexNumber() {
        IMAGINARY = (int)Math.sqrt(-1);
    }
    public ComplexNumber multiply(ComplexNumber x, ComplexNumber y) {
        return this;
    }
    public int getReal() {
        return 0;
    }
    public int getImaginary() {
        return 5;
    } 
    
}
