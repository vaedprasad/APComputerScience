
/**
 * Write a program that prints the numbers from 1 to 100. 
 * However, for multiples of three print “Fizz” instead of 
 * the number and for the multiples of five print “Buzz” instead 
 * of the number. For numbers which are multiples of both three 
 * and five print “FizzBuzz” instead of the number.

 * @author Vaed Prasad
 */
public class FizzBuzz
{
    /**
     * Constructor for objects of class FizzBuzz
     */
    public FizzBuzz()
    {
        for (int i=1; i<=100; i++)
        {
            if (i%5 ==0 && i%3==0)
            {
                System.out.println("FizzBuzz");
            }
            else if (i%3==0)
            {
                System.out.println("Fizz");
            }
            else if (i%5==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
