
/**
 * 
 * Write and test a program that prints out a nicely formatted multiplication table up to 12. 
 * 
 * @author Vaed Prasad
 */
public class MultiplicationTable
{
    public static void main (String args[])
    {
        System.out.print("\f");
        System.out.println("Vaed Prasad's 12x12 Multiplication Table\n");
        System.out.println("|   | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10| 11| 12|");
        System.out.println("-----------------------------------------------------");
        for (int i=1; i<13; i++)
        {
            multiplicationRow(i);
        }
    }

    public static void multiplicationRow (int x)
    {
        if (x<10)
        {
            System.out.print("| " + x + " |");
        }
        else
        {
            System.out.print("| " + x + "|");
        }
        for (int i=1; i<13; i++)
        {
            if(i*x <10)
            {
                System.out.print(" " + i*x + " |");
            }
            else if (i*x>=10 && i*x<100)
            {
                System.out.print(" " + i*x + "|");
            }
            else
            {
                System.out.print(i*x + "|");
            }
            switch(i)
            {
                case 12:
                System.out.println();
            }
        }
        System.out.println("-----------------------------------------------------");
    }
}
