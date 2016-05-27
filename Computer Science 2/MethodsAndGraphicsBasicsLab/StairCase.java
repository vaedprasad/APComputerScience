
/**
 * Write a description of class Stair Case here.
 * 
 * @author Vaed Prasad
 * @version January 2015
 * 

 */
public class StairCase
{
    public  void runProgram()
    {
        String line1 = "\fStairCase: Vaed Prasad, January, 2015";
        System.out.println(line1);
        draw3Steps();
    }

    public  void drawTread(int endOrNot)
    {
        if (endOrNot==1)
        {
            System.out.println("+----+");
        }
        if (endOrNot==0)
        {
            System.out.print("+----");
        }
    }

    public  void drawRiser(int endOrNot)
    {
        if (endOrNot==1)
        {
            System.out.println("|    |");
        }
        if (endOrNot==0)
        {
            System.out.print("|    ");
        }
    }

    public  void drawIndent()
    {
        System.out.print("     ");
    }

    public  void draw3Steps()
    {
        for(int steps = 1; steps <= 3; steps++)
        {
            for(int indent = 1; indent <= 3-steps; indent++)
            {
                drawIndent();
            }
            for(int treads = 1; treads <= steps; treads++)
            {
                if(treads==steps)
                {
                    drawTread(1);
                }
                else
                {
                    drawTread(0);
                }
            }
            for(int indent = 1; indent <= 3-steps; indent++)
            {
                drawIndent();
            }
            for(int risers = 1; risers <= steps; risers++)
            {
                if(risers==steps)
                {
                    drawRiser(1);
                }
                else
                {
                    drawRiser(0);
                }
            }
        }
        System.out.println("+----+----+----+");
    }
}
