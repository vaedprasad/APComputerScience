
/**
 * Write a description of class ChessBoardProblem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChessBoardProblem
{
    public static void main (String []args)
    {
        int total = 0;
        int trials = 1000;
        for (int i = 0; i <trials; i++)
        {
            total += newMove();
        } 
        total /= trials;
        System.out.print(total);
    }

    public static int newMove ()
    {   
        int x = 0;
        int y = 0;

        int counter = 0;
        while (x!=7||y!=7)
        {
            int randomNum = 1+(int)(Math.random()*7);
            if (Math.random()<0.5) {

                x += randomNum - x;
                counter++;
            }
            else
            {
                y += randomNum - y;
                counter++;
            }
        }
        return counter;
    }
}