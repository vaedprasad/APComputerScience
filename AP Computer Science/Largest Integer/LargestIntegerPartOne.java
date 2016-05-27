import java.util.Scanner;
import java.io.PrintWriter;
/**
 *Write and test a method that returns the value 
 *of the larger of the integers x and y (or either 
 *one, if they are equal), but do not use any Math 
 *methods. 
 * 
 * @author Vaed Prasad
 * @version 10/7/2015
 */
public class LargestIntegerPartOne
{  
    public static int max (int x, int y)
    {
        if (x>y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
}

