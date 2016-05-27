import java.util.Scanner;
/**
 * Parameters
 * 
 * @author Vaed Prasad
 * @version December 2014
 * 
 * Curly Braces define scope; variables must be in the same scope
 * Signature have two variables and return something
 * 
 * displayMenu --
 * getInput -- 1 parameter (a Scanner), returning a String
 * doOption -- 1 parameter (the option) and call the right method
 * FOR NOW, just use any old numbers for average and maximum
 * 
 */
public class Parameters
{

    public void run()
    {
        displayMenu();
        Scanner input = new Scanner (System.in);
    }

    public void Welcome()
    {
        System.out.println("**************************");
        System.out.println("Welcome to Parameters");
        System.out.println("by Vaed Prasad");
        System.out.println("Computer Science 2: G period");
        System.out.println("**************************");

    }

    public void displayMenu()
    {
        System.out.println("A:Average");
        System.out.println("B:Maximum");
        System.out.println("Please select either A or B");

    }

    public String getInput(Scanner keyboard)
    {
        String choice = keyboard.nextLine();
        choice= choice.toUpperCase();
        return choice;
    }

    /**
     * Call either average or maximum depending on choice or display "not a valid choice"
     */
    public void doOption(String choice)
    {
        if (choice.equals("A"))
        {
            double result = average(1349120,1813433,1341341);
        }
        else if (choice.equals("B"))
        {
            double result = maximum(2131,4131);
        }
        else 
        {
            System.out.println("Not a valid choice");
        }
    }

    /**
     * @return the maximum of 2 input numbers 
     * @params x is any integer and y is any integer
     */
    public int maximum(int x, int y)
    {
        int max = x;
        if (y>max)
        {
            max=y;
        }
        return max;
    }

    /**
     * @return the average of 3 input numbers
     */
    public double average(int x, int y, int z)
    {
        double result = (x+y+z)/3.0;
        return result;
    }
}
