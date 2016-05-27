import java.util.Scanner;
/**
 * Write a description of class Evaluate here.
 * 
 * @author Vaed Prasad
 * @version September 2014
 */
public class Evaluate
{
    public static void main (String [ ] arg)
    {
       System.out.print ("Input a real number followed by a real number, followed by an integer: ");
       Scanner input = new Scanner (System.in);
       double number1 = input.nextDouble();
       double number2 = input.nextDouble();
       int number3 = input.nextInt();
       double output= number1/number2*number3;
       System.out.print ("Real Number/Real Number * Integer = " + output);
    }
  
}
