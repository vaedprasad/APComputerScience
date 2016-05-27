import java.util.Scanner;
/**
 * Write a description of class IfExample3 here.
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
public class IfExample3
{
    public static void main (String [ ] arg)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Input a number:");
        double x = input.nextDouble();  
        if (x >= 50 && x <= 80)
        {
                System.out.println(x+" is in between 50 and 80, inculsively");
        }
        else
        {
            System.out.println(x+" is not between 50 and 80, inculsively");
        }
    }
}