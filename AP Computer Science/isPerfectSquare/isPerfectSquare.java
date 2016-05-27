
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
        int test = 0;
        int inc = 1;  
        boolean isPerfect = false;
        while (test<n)
        {
            test += inc;
            inc += 2; //changes the increment
        }
        if(test==n)
        {
            isPerfect = true;
        }
        return isPerfect;
    }
    
    /**
     * 
     * This is a second solution that uses nested loops without using the formula.
     * 
     * 
    */
        public static boolean isPerfectSquareAlternateSolution(int n)
    {
        int i = 0;
        int j = 0;  
        boolean isPerfect = false;
        while (i <= n)
        {
            for (int k=1; k <= i; k++)
            {
                j += i;
            }
            if(j==n)
            {
                isPerfect = true;
                break;
            }
            i++;
            j=0;
        }
        return isPerfect;
    }
}
