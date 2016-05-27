
/**
 * Write a description of class PrintCheckerboard here.
 * 
 * Write and test a method printCheckerboard (int n) that displays a checkerboard pattern with n rows and n columns. For example, printCheckerboard (7)should display
 *
 * #o#o#o#
 * o#o#o#o
 * #o#o#o#
 * o#o#o#o
 * #o#o#o#
 * o#o#o#o
 * #o#o#o#
 * 
 * (Unlike the example above, your display should have no spaces between the lines.)
 * 
 * 
 * @author Vaed Prasad 
 * @version 11/05/2015
 */
public class PrintCheckerboard
{
    public static void printCheckerboard (int n)
    {
        System.out.print("\f");
        for (int i = 0; i< n; i++)
        {
            if (n%2 == 0 && i%2==0)
            {
                for (int j = 0; j< n/2; j++)
                {
                    System.out.print("#o");
                }
                System.out.print("\n");
            }
            else if (n%2 == 1 && i%2==0)
            {
                for (int k = 0; k< n/2; k++)
                {
                    System.out.print("#o");
                }
                System.out.print("#");
                System.out.print("\n");
            }
            else if (n%2 == 0 && i%2==1)
            {
                for (int j = 0; j< n/2; j++)
                {
                    System.out.print("o#");
                }
                System.out.print("\n");
            }
            else if (n%2 == 1 && i%2==1)
            {
                for (int k = 0; k< n/2; k++)
                {
                    System.out.print("o#");
                }
                System.out.print("o");
                System.out.print("\n");
            }
        }
    }
}
