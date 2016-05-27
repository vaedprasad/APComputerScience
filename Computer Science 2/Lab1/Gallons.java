import java.util.Scanner;
/**
 * Write a description of class Gallons here.
 * 
  * @author Vaed Prasad
 * @version September 2014
 * 
 * Objective:
 * Write a program that asks the user to input the following 3 items.
 * The number of gallons of gas in a tank, the fuel efficiency in mpg, the price of gas per gallon.
 * Print how far the car can go with the gas in the tank and the cost per 100 miles.
 * 
 */
public class Gallons
{
    public static void main (String [ ] arg)
    {
     Scanner input = new Scanner (System.in);
     System.out.println("How many Gallons of Gas are in a tank?");
     double Gallons = input.nextDouble();
     System.out.println("What is the fuel effieciency in mpg?");
     double MPG = input.nextDouble();
     System.out.println("What is the price of gas per gallon?");
     double PricePerGallon = input.nextDouble();
     System.out.println("Your car can go " + Gallons *  MPG + " miles with the gas in the tank.");
     System.out.println("The cost of a 100 mile trip is " + 100 * MPG * PricePerGallon + " dollars");
    }
  
}
