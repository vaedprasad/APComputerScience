
/**
 * Write a description of class Challenge here.
 * 
 * @author Vaed Prasad
 */
public class Challenge
{
    public static void isocelesTriangleAreaCalculator (String[]args)
    {
        int length = 10;
        int base = 3;
        double midBase = base/2;
        double height =  Math.sqrt(Math.pow(length,2) - Math.pow(midBase,2));
        double area = height * base * .5;
        System.out.print("\f The area of the triangle is " + Math.round(area) + " inches squared.");
    }

    public static void switchTensAndOnes()
    {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <=50; i++)
        {
            sum1 += (int) Math.pow(i,3);
        }
        for (int i = 1; i <=100; i++)
        {
            sum2 += (int) Math.pow(i,2);
        }
        
        System.out.println("\fThe sum of all the cubes from 1 to 50 is " +sum1);
         System.out.println("The sum of all the squares from 1 to 100 is " +sum2);
    }
    
    
}
