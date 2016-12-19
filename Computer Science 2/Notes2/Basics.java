import java.util.Random;
/**
 * Write a description of class Basics here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Basics
{
    public static void main(String [] args)
    {
        Random rand = new Random();

        int [] myArray = new int[1000];

        int length = myArray.length;

        for(int i=0; i < length; i++)
        {
            myArray[i] = rand.nextInt(1000000);
        }

        int maxNumber = -(2^31);
        for(int i= 0; i < length; i++)
        {        
            if (myArray[i] > maxNumber)
            {
                maxNumber = myArray[i];
            } 
        }
        System.out.println(maxNumber);

    }
}

