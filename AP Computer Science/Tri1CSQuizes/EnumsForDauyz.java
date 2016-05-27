import java.util.Scanner;
/**
 * Write a description of class EnumsForDauyz here.
 * 
 * @author Vaed Prasad
 * @version (a version number or a date)
 */
public class EnumsForDauyz
{
    private enum State {
        STANDING,
        WALKING,
        RUNNING
    }
    private  static State currentState = State.STANDING;
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
            System.out.println("\fEnter a number representing your speed in mph: ");
        int x = input.nextInt();
        if (x == 0)
        {
            currentState = State.STANDING;
            System.out.println("Your current state is " + currentState + ".");
        }
        else if (x>0 && x <3)
        {
            currentState=State.WALKING;
            System.out.println("Your current state is " + currentState + ".");
        }
        else  if (x >=3)
        {
            currentState = State.RUNNING;
            System.out.println("Your current state is " + currentState + ".");
        }
        else

            System.out.println("Invalid input");

    }
}
