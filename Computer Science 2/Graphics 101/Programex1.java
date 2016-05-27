import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.Color;
import java.awt.event.*;
/**
 * Graphics 101
 * 
 * @author Vaed Prasad
 * @version December 2014
 * 
 * Program Ex 1
 * is an example of using acm libraries
 * Note:
 * -import lines (2 of them, with acm as the package
 * -init () method
 * 
 * 
 * 
 */
public class Programex1 extends GraphicsProgram
{
    private GTurtle turtle;
    /**
     * Constructor for objects of class Graphics_101
     */
    public void init ()
    {
        Color mycolor = new Color (30,123,240);
        setBackground(mycolor);
         turtle = new GTurtle();
        add(turtle);
        drawBox(turtle, 0, 0);
        //drawDottedLine(turtle, 0, 37.5);
        addMouseListeners();
    }

    
    @Override
    public void mousePressed(MouseEvent e)
    {
        int x1 = e.getX();
        int y1 = e.getY();
        GOval dot = new GOval (x1-5,y1-5,10,10);
        add(dot);
    }
    
    public void drawBox(GTurtle turtle, int x, int y)
    {
        turtle.setLocation(x,y);
        turtle.penDown();
        for (double i = 0; i < 4; i++)
        {
            turtle.forward(75);
            turtle.right(90);
        }
    }

    public void makeTurtles(GTurtle turtle, int x, int y)
    {
        for (double y2 = 10; y2 < 1000; y2+=100)
        {
            for (double x2 = 10; x2 < 1000; x2+=100)
            {
                GTurtle turtle2 = new GTurtle (x2,y2);
                add(turtle2);
            }
        }
    }

    public void drawDottedLine(GTurtle turtle, int x, int y)
    {
        turtle.setLocation(x,y);
        for (double i = 0; i < 15; i++)
        {
            turtle.penDown();
            turtle.forward(2.5);
            turtle.penUp();
            turtle.forward(2.5);
        }
    }
}