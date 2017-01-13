
/**
 * Write a description of class isPerfectSquare here.
 * Recall that 1 + 3 +...+(2p-1) = p2 for any integer p >= 1.
 * Write a "simple" method public static boolean isPerfectSquare(int n)
 * that tests whether a given number is a perfect square.
 * 
 * A "simple" method cannot use arrays, nested loops, Math functions,
 * or arithmetic operations except addition. 
 */
public class isPerfectSquare
{
    public static boolean isPerfectSquare(int n)
    {
        int i = 0;
        int j = 0;  
        boolean isPerfect;
        while (i <= n)
        {
            for (int k=1; k <= i; k++)
            {
                j += i;
            }
            if(j==n)
            {
                break;
            }
            i++;
            j=0;
        }
        if ( j == 0)
        {
            isPerfect = false;
        }
        else
        {
            isPerfect = true;
        }
        return isPerfect;
    }
}
