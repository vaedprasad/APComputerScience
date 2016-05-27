import java.util.Scanner;
/**
 * Write a description of class IfExample here.
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
public class IfExample
{
    public static void main (String [ ] arg)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Input a value for your first Integer:");
        double x = input.nextDouble();  
        System.out.println("Input a value for your second Integer:");
        double y = input.nextDouble();  
        if (x < y)
        {
            System.out.println(x+" < "+y);
        }
        else if (x==y)
        {
            System.out.println(y+" = "+x);
        }
        else
        {
            System.out.println(y+" < "+x);
        }
    }
}