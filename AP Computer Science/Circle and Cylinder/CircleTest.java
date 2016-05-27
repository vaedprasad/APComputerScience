import java.util.Scanner;
import java.io.PrintWriter;
/**
 * Write a description of class CircleTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CircleTest
{
   Scanner input = new Scanner (System.in);
   private Circle space;
   private int radius;
   
    public void userI()
    {
        System.out.print("\f");
        System.out.println("Input an integerial value for the radius of your circle. ");
        int radius = input.nextInt();
        Circle area1 = new Circle(radius);
        area1.getRadius();
        area1.getArea(radius);
        
        double ar = area1.getArea(radius);
        System.out.print("The area of the circle is " + ar);
    }
}
