import java.util.Scanner;
import java.io.PrintWriter;
/**
 * Write a description of class LunchTime here.
 * 
 * @author Vaed Prasad
 * @version 10/22/2015
 */
public class OneTwoLab
{  
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("\f");
        System.out.println("This is the Poem 'One, Two, Buckle My Shoe'\n");

        System.out.println("******************************");
        System.out.println("One, two,");
        System.out.println("Buckle my shoe;");
        System.out.println("Three, four,");
        System.out.println("Open the door;");
        System.out.println("Five, six,");
        System.out.println("Pick up sticks;");
        System.out.println("Seven, eight,");
        System.out.println("Lay them straight:");
        System.out.println("Nine, ten,");
        System.out.println("A big, fat hen;");
        System.out.println("******************************\n");

        System.out.println("Enter a line number (1-10) to display the line or choose 0 to quit:");

        int inputInt = input.nextInt();

        switch (inputInt)
        {
            case 0:
            System.out.println("Bye!");
            break;
            
            case 1:
            case 2:
            System.out.println("Buckle my shoe;");
            break;

            case 3:
            case 4:
            System.out.println("Open the door;");
            break;

            case 5:
            case 6:
            System.out.println("Pick up sticks;");
            break;

            case 7:
            case 8:
            System.out.println("Lay them straight:");
            break;

            case 9:
            case 10:
            System.out.println("A big, fat hen;");
            break;
        }
    }
}
