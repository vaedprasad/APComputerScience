import java.util.Scanner;
import java.io.PrintWriter;
/**
 * Write a description of class CylinderTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CylinderTest
{
   Scanner input = new Scanner (System.in);
   private Circle space;
   private int radius;
   
   public void userI()
    {
        System.out.print("\f");
        System.out.println("Input an integerial value for the radius of the base of your cylinder. ");
        int radius = input.nextInt();
        System.out.println("Input an integerial value for the height of your cylinder. ");
        int height = input.nextInt();
        Cylinder volume1 = new Cylinder(radius, height);
        volume1.getVolume(radius, height);
        
        double vol = volume1.getVolume(radius,height);
        System.out.print("The area of the cylinder is " + vol);
    }
}
