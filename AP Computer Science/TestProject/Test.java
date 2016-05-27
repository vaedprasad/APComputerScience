
/**
 * Write a description of class Test here.
 * 
 * @author Vaed prasad
 */
public class Test
{

    public static void main (String [] args)
    {
   
        String
        
        
    }

    public int switchTensAndOnes( int n)
    {
        int ones = n % 10;
        int tens = n % 100 - n%10;
        int temp = n - ones - tens;
        int newInt = temp + (ones*10) + (tens/10);
        return newInt;  
    }

    public boolean isPerfect( int n)
    {
       int p = (int) Math.round(Math.sqrt(n));
       if (n==p*p)
       return true;
       else
       return false;
    }
}
