
/**
 * Write a description of class AddOdds here.
 * 
 * @author Vaed Prasad
 */
public class AddOdds
{
    public int addOdds(int n)
    {
        int sum = 0;
        for (int i = 1; i<=n; i+=2)
        {
            sum += i;
        }
        return sum;
    }
}
