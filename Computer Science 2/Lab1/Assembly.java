import java.util.Scanner;
/**
 * Write a description of class Assembly here.
 * 
 * @author Vaed Prasad
 * @version September 2014
 * 
 *Your program should ask the user for an assembly language instruction all on one line where the first item is the instruction followed by a space then an integer number.
 *Even though you might remember conditional statements from CS1 we are not going to use them yet.
 *Instead to practice parsing and use what we know your program will understand just one type of instruction, the SUB instruction.
 *In your program the user will enter 3 SUB instructions one per line and compute and display the result in the accumulator.
 *Here is a sample run where user input is shown in orange.

 * 
 */
public class Assembly
{
    public static void main (String [ ] arg)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter an Integer using the following forumula 'SUB (integer)':");   
        System.out.println("********** AAA Assembly *****************");   
        System.out.println("* Enter 3 instructions in the form SUB # *");
        System.out.println("*****************************************");
        String equation1 = input.next();
        int first = input.nextInt();
        //System.out.println("Enter another Integer using the following forumula 'SUB (integer)':");   
        String equation2 = input.next();
        int second = input.nextInt();
        //System.out.println("Enter another Integer using the following forumula 'SUB (integer)':");   
        String equation3 = input.next();
        int third = input.nextInt();
        System.out.println("0 - " + first + " - " + second + " - " + third);   
        System.out.println("The result for this equation is " + (0 - first - second - third) + ".");
         System.out.println("*****************************************");

    }
}
