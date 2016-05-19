
/**
 * Write a description of class ForEachLoop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForEachLoop
{
    /**
     * (a) Write a method that returns the sum of all the elements in a one-dimensional array of integers.
     * Use a "for-each" loop. 
     */
    public static int sumOfOneDimensionalArray(int[] array) {
        int sum = 0;
        for (int i:array) {
            sum += i;
        }
        return sum;
    }

    /**
     * Using the method you wrote in Part (a), write and test a method that takes a 2-D array of integers t and 
     * returns a 1-D array sums, such that sums[k] holds the sum of all the elementsi n the k-th row of t. 
     * 
     * Do not use any arithmetic operators.
     */

    public static int[] sumOfTwoDimensionalArray(int[][] array) {
        int[] output = new int[array.length];
        for (int r = 0; r < array.length; r++) {
            output[r] = sumOfOneDimensionalArray(array[r]);
        }
        return output;
    }
}
