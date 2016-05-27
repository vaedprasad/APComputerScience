
import java.util.Scanner;
/**
 * Write a description of class Question5 here.
 * 
 * @author Vaed Prasad
 * @version September 2014
 * 
 * nextLine() terminated by return
 * next() reminated by space
 * nextInt() +- digits to a space
 * nextDouble() + - gigits to a spawre
 */
public class Question5
{
    public static void main (String [ ] arg)
    {
        Scanner kbrd = new Scanner(System.in);
        System.out.print("Enter your name: " );
        String fname = kbrd.next();
        String lname = kbrd.next();
        System.out.print("Enter your age: ");
        int age = kbrd.nextInt();
        System.out.print("fname: " + fname);
        System.out.print("lname: " + lname);
        System.out.print("age: " + age);

    }

}