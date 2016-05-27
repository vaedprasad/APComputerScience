
/**
 * 
Write a method public static void printStarTriangle (int n)
that displays n rows of stars, as follows:
 *        *
 *       * *
 *      * * *
 *     * * * *
 * ...
 * The last row of stars should have thirteen (13) stars and should start at the first position on the line. 
 * 
 * @author Vaed Prasad
 * @version 
 */
public class PyramidOfStars
{
    public static void main (String args[])
    {
        System.out.println("\f");
        printStarTriangle(200);
    }

    public static void printStarTriangle(int n)
    {
        for (int row = 1; row < n+1; row++)
        {
            for ( int column = 1; column < (n - row)+2; column++)
            {
                System.out.print(" ");
            }
            for ( int column = 1; column < row+1; column++)
            {
                System.out.print("* ");
            }
             System.out.println();
        }
        System.out.println("* * * * * * * * * * * * *");
    }
}
