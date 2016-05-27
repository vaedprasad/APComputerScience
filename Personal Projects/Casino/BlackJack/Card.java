
/**
 * Vaed Prasad 
 * 
 * 
 * 
 */
public class Card
{
    private int rollNumber;
    private int suiteNumber;
    public void selectCard ()
    {
        suiteNumber = (int)(4*Math.random())+1;     
        rollNumber = (int)(13*Math.random())+1;
    }

    public int getCardNum()
    {
        return rollNumber;
    }

    public int getSuiteNum()
    {
        return suiteNumber;
    }
}
