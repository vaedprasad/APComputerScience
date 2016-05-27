import java.util.Scanner;
/**
 * Write a description of class IfExample2 here.
 * 
 * @author Vaed Prasad
 * @version October 2014
 * && and
 * || or
 * ! not
 * == true
 * != false
 * boolean x = ?
 * if (x==true)
 * <
 * >
 * <=
 * >=
 * !=
 * 
 * 
 * 
 */
public class IfExample2
{
    public static void main (String [ ] arg)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Input a value for your first Integer:");
        double x = input.nextDouble();  
        System.out.println("Input a value for your second Integer:");
        double y = input.nextDouble();  
        System.out.println("Input a value for your third Integer:");
        double z = input.nextDouble(); 
        if (x < y)
        {
            if (z < y)
            {
                System.out.println("The Largest number is" + y);
            }
        }
        if (x < z)
        {
            if (y < z)
            {
                System.out.println("The Largest number is" + z);
            }
            if (y < x)
            {
                if (z < x)
                {
                    System.out.println("The Largest number is" + z);
                }
            }
        }
    }
}