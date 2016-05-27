
/**
 * class Basics does some
 * fundamental things with an array
 * 
 * @author J. Smith 
 * @version February 2015
 */
public class Basics
{
    public static void main (String [] args)
    {
        int [] myArray = createArray();
        int [] hGram = histogram(myArray);
        for(int i = 0; i < 100; i++)
        {
            System.out.println(hGram[i]);
        }
    }

    /**
     * Create an array of 1000 integers and
     * store random numbers in the range 0..100 
     * in each box
     * 
     * Get random numbers with the Math.random library
     * 
     * int value = (int)(Math.random() * 100);
     * 
     * 
     * return the array
     */
    public static int [] createArray ()
    {
        int [] numbers = new int [1000];
        for (int i=0; i < 1000; i++)
        {
            numbers[i] = (int)(Math.random() * 100);
        }
        return numbers;
    }

    public static int [] histogram(int [] myArray)
    {
        int [] counts = new int [100];
        int length = 1000;
        /**for (int i=0; i < 100; i++)
        {
        counts[i]=0;
        } 
         */
        for (int i=0; i < length; length++)
        {
            counts[myArray[i]]++;
        }        
        return counts;
    }

    public static void stuff(int [] myArray)
    {
        String [] nameList; // declare using the type going in the box
        nameList = new String[15]; // create the array and all its empty boxes
        nameList[0] = "Janet";
        nameList[1] = "Bob";
        nameList[2] = "Karen";

        int numItems = nameList.length;
        for (int i=0; i < numItems; i++)
        {
            if (nameList[i] == null)
            {
                break;
            }
            System.out.println(nameList[i]);            
        }
    }
}