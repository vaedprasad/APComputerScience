import java.util.*;
/**
 * Write a description of class ArrayPractice here.
 * 
 * @author Vaed Prasad
 */
public class ArrayPractice {
    
    
    
    
    
    /**
     * 
     * Write a method that returns the value of the largest positive element in a 2-D array,
     * or 0 if all its elements are negative:
     * // Returns the value of the largest positive element in
     * //the 2-D array m, or 0, if all its elements are negative
     * 
     * private static double positiveMax(double[][] m)
     * 
     */
    public static double positiveMax(double[][] m) {
        double max = 0;   
        for (int i = 0; i < m.length; i++) {
            for (int k = 0; k < m[i].length; k++) {
                if (m[i][k] > max)
                    max = m[i][k];
            }
        }
        return max;
    }

    /** 
     * Write a method public void fillCheckerboard(Color[][] board)
     * that fills board with alternating black and white colors in a checkerboard pattern. 
     * Google checkerboard if you cannot recall what one looks like. 
     * Test your method by printing out the array, showing 'x' for black and '.' for white. 
     * 
     */
    public static void fillCheckerboard(String[][] board) {
        for (int i = 0; i<board.length; i++) {
            for (int j = 0; j <board[i].length; j++) {
                if (i%2==0)
                {
                    if (j%2==0) {
                        board [i][j] = "x";
                    }
                    else {
                        board [i][j] = ".";
                    }
                }
                else {
                    if (j%2==0) {
                        board [i][j] = ".";
                    }
                    else {
                        board [i][j] = "x";
                    }
                }
            }
        }
        System.out.print(board.toString());
    }
}