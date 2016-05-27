import java.util.Scanner;
/**
 * Write a description of class Calculations here.
 * 
  * @author Vaed Prasad
 * @version September 2014
 * 
 * Objective:
 * Write a program that prompts the user for 2 integers and prints the following
 * sum
 * difference
 * product
 * average
 * distance (absolute value of the difference)
 * maximum (the larger of the two)
 * minimum (the smaller of the two)
Try to make the user interface as nice as possible by outputting the information in a neat manner.  A table perhaps?

 * 
 */
public class Calculations
{
    public static void main (String [ ] arg)
    {
     Scanner input = new Scanner (System.in);
     System.out.println("Enter a Number, x");      
     double x = input.nextDouble();
     System.out.println("Enter another number, y");
     double y = input.nextDouble();
     double sum = x + y;
     double difference = x-y;
     double product = x*y;
     double average = (x+y)/2;
     double distance = Math.abs(x-y);
     double max = (Math.max (x,y));
     double min = (Math.min (x,y));
     
    System.out.println("----------------------------------------------------");
     System.out.println("|Sum|"+ "\t" + "|Diff|"+ "\t" + "|Prod|"+ "\t" + "|Aver|"+ "\t" + "|Dist|"+ "\t" + "|Max|"+ "\t" + "|Min|"+ "\t");
     System.out.println(sum + "\t" + difference + "\t" + product + "\t" + " " + average + "\t" + distance + "\t" + max + "\t" + min + "\t");
   System.out.println("----------------------------------------------------");
     /**System.out.println("The sum of the two numbers is " + "" + (x + y));
     System.out.println("The difference of the two numbers is " + (x-y));
     System.out.println("The product of the two numbers is " + (x*y));
     System.out.println("The average of the two numbers is " + ((x+y)/2));
     System.out.println("The distance of the two numbers is " + Math.abs(x-y));
     /.out.println("The maximum of the two numbers is " + (Math.max (x,y)));
     //System.out.println("The minimum of the two numbers is " + (Math.min (x,y)));
     */
    }
  
}
