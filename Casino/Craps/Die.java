
/**
 * Vaed Prasad and Rachel Lee
 * 
 * 
 * 
 */
public class Die
{
    private int rollNumber;
    public void roll ()
    {
        rollNumber = (int)(6*Math.random())+1;
    }

    public int getNumDots()
    {
        return rollNumber;
    }
}
