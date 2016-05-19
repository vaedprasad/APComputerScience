import java.util.Scanner;
import java.math.*;
/**
 * Write a description of class Population here.
 * 
 * The population of Mexico at the end 
 * of 2014 was around 123.8 million.
 * 
 * Write and test a program that will prompt
 * the user for a number (a double) that represents
 * a target population number (in millions) and print
 * out the year in which the population of Mexico 
 * will reach or exceed that number, assuming a constant
 * growth rate of 0.5 percent per year.
 * 
 * Declare the starting year (2014), the starting population number (123.8), and
 * the growth rate (0.5 percent) as symbolic constants. 
 * 
 * 
 * 
 * 
 * @author Vaed Prasad
 */
public class Population
{
    private static final int startingYear = 2014;
    private static final double startingPopulation = 123.8;
    private static final double growthRate = .005;
    
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\f" + "Enter a target population (in millions as a double) that you would like to know when Mexico will reach.");
        double target = input.nextDouble();
        
        System.out.println("Mexico will reach the population of " + target + " million people in the year " + populationGrowth(target) + ".");
    }

    public static int populationGrowth(double targetValue)
    {
        int numYears = (int) ((Math.log(targetValue/startingPopulation))/(Math.log(1+growthRate)));
        int year = startingYear + numYears;
        return year;
    }
}
