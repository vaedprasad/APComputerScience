import java.util.Scanner;
/**
 * Write a description of class NumberOfDays here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberOfDays
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month from 1-12");
        int month = input.nextInt();
        switch (month)
        {
            case 2:
            System.out.println("This month has 28 days");
            break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            System.out.println("This month has 31 days");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
            System.out.println("This month has 30 days");
            break;
            default:
            System.out.println("Invalid Input");
        }
    }
}