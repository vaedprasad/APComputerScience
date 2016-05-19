import java.util.Scanner;
/**
 * Write a description of class MakeChange here.
 * 
 * Write and test a method that takes 
 * an amount in cents and prints out 
 * all possible representations of that
 * amount as a sum of several quarters, 
 * dimes, nickels, and pennies. For example: 
 * 30 cents = 0 quarters + 2 dimes + 1 nickels + 5 pennies
 * (There are 18 different representations for 30 cents and 242 for $1.00)
 * 
 * 
 * 
 * 
 * @author Vaed Prasad
 * @version 11/5/2015
 */
public class MakeChange
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\fInput the amount of cents you would like to find cents for:");
        int x = input.nextInt();

        int total = 0;
        int sum = 0;

        for (int q = 0; q <= (int)((float) x / 25); q++)
        {
            for (int d = 0; d <= (int)((float) x / 10); d++)
            {
                for (int n = 0;n <= (int)((float) x / 5); n++)
                {
                    for (int p = 0; p <= x; p++)
                    {
                        sum = q * 25 + d * 10 + n * 5 + p;
                        if (sum == x)
                        {
                            System.out.println("You need " + q + " quarters " + d + " dimes " + n + " nickels " + p + " pennies.");
                            total++;
                        }
                    }
                }
            }
        }
        System.out.println("Total number of combinations = " + total);
    }
}