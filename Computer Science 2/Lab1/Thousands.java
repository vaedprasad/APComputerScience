import java.util.Scanner;
/**
 * Write a description of class Thousands here.
 * 
  * @author Vaed Prasad
 * @version September 2014
 * 
 * Objective:
 * Write a program that reads a number greater than or equal to 1,000
 * and less than or equal to 99, 999 from the user (expect this input,
 * no need to check for validity of the input… yet!).
 * Print the resulting input with a comma separating the thousands.
 * Here is an example with user input shown in orange.
 *
 * 
 */
public class Thousands
{
    public static void main (String [ ] arg)
    {
     Scanner input = new Scanner (System.in);
     System.out.println("Enter a Number, n, where 1000 ≤ n ≤ 99999");      
     int Number = input.nextInt();
     System.out.println((Number/1000) + "," + (Number % 1000));
  
}
}