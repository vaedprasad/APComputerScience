import java.util.Scanner;
/**
 * Write a description of class ScannerUsage here.
 * 
 * @author Vaed Prasad
 * @version September 2014
 * 
 * nextLine() terminated by return
 * next() reminated by space
 * nextInt() +- digits to a space
 * nextDouble() + - gigits to a spawre
 */
public class ScannerUsage
{
    public static void main (String [ ] arg)
    {
     Scanner input = new Scanner (System.in);
     System.out.print("Tell me your name: ");
     String name = input.next();  
     System.out.println("Hi," + name);
     name = input.next();
     System.out.println ("Your last name is " + name);
     System.out.println ("Enter a number from 0 to 10 =.");
     String digit = input.next();
     int number = Integer.parseInt(digit);
     System.out.println ("Your number is " + number);
     int multTwo = number * 2;
     System.out.println (number + " * 2 = " + multTwo);
    }
  
}
