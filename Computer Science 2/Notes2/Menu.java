import java.util.Scanner;
/**
 * Write a description of class Menu here.
 * 
 * @author Vaed Prasad
 * @version October 2014
 * 
 * Create a text menu of desert foods with A, B, C
 * 
 *      A: Cake
 *      B: Ice Cream
 *      C: Cookies
 * 
 */
public class Menu
{
    public static void main (String [ ] arg)
    {
        Scanner input = new Scanner (System.in);
        String a = "cake";
        String b = "ice cream";
        String c = "cookies";
        System.out.println("A: Cake");
        System.out.println("B: Ice Cream");
        System.out.println("C: Cookies");
        System.out.println("Select a Desert by entering its corresponding letter (in upper case)");
        String input1 = input.next();  
        String selected = "";
        if (input1.equals("a"))
        {
            selected=item1;
        }
        else if (input1.equals("b"))
            selected=item2;
        else if (input1.equals("c"))
            selected=item3;
        else
            selected=item4;
        if (selected=item4)
            System.out.println(item4 + "is not on the menu");
        else
            (a.substring(a.length()-1)+a.substring(1,a.length()-1)

            }
    }
