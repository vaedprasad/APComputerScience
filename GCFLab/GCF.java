import java.util.Scanner;
import java.io.PrintWriter;
/**
 * Write a description of class LunchTime here.
 * 
 * @author Vaed Prasad
 * @version 10/22/2015
 */
public class GCF
{  
    /**
     * 
     * Returns GCF of a and b
     * Precondition: a > 0 , b>0
     * 
    */
    public static int gcf (int a, int b)
    {
        while(a != 0)
        {
          int temp = a;
          a = b%a;
          b = temp;
        }
        return b;
    }
}