import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.Color;
import java.util.Random;
/**
 * class SnowMan is part 2 of the CS2 lab practicalon using and defining methods.
 * 
 * @author Vaed Prasad
 * @version January 2015
 */
public class SnowMan extends GraphicsProgram
{
    /**
     * Change the background color to cyan
     * Make a correct call to drawSnowMan to draw the character as
     * shown in the screen shot.  No need to be perfect or exact, just
    * come close!
    *
     * @author Vaed Prasad
     * @version January 2015
     */

    public void init ()
    {
        setBackground(Color.CYAN);
        drawSnowMan(200,200,50);
        drawThreeSnowMan();
        drawTurtle(600, 300);
        drawSun();
        
    }

    /**
     * x indicate the location for the snowman's body ovals
     * y indicates the top of the snow man's hat
     *
     * The hat is one quarter the size of the ovals.
     * 
     * All ovals are size in diameter.
     * 
     * Methods to use:
     * 
     * GRect constructor needs parameters x, y, width and height
     * GOval constructor needs parameters x, y, width and height
     * 
     * setFilled(true) makes a GObject of any kind filled
     * setFillColor(<some color>) sets the fill color of a GObject
     * 
     * 
     * Final Step:  Embellish the snowman in any way you wish
     * just demonstrate usage of a GObject!  Check the API - how about a turtle?
     */
    public void drawSnowMan(int x, int y, double size)
    {
        GOval feet = new GOval(x,y+(2.5*size),size,size);
        feet.setColor(Color.white);
        feet.setFilled(true);
        add(feet);

        GOval chest = new GOval(x,y+(1.5*size),size,size);
        chest.setColor(Color.white);
        chest.setFilled(true);
        add(chest);

        GOval head = new GOval(x,y+(.5*size),size,size);
        head.setColor(Color.white);
        head.setFilled(true);
        add(head);

        GRect hat = new GRect(x+(.25*size),y,size/2,size/2);
        hat.setColor(Color.black);
        hat.setFilled(true);
        add(hat);
    }

    public void drawThreeSnowMan()
    {
        drawSnowMan(400,200,50);
        drawSnowMan(100,200,50);
        drawSnowMan(300,200,50);
    }

    /**
     * Draws Turtles Galore!
     */
    public void drawTurtle(int x, int y)
    {
        GTurtle first = new GTurtle(x,y);
        add(first);
    }

    /**
     * Draws Sun
     */
    public void drawSun()
    {
        GOval sun = new GOval(100,100,70,70);
        sun.setColor(Color.yellow);
        sun.setFilled(true);
        add(sun);
    }
    
}      

