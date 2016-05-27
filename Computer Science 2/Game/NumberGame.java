import acm.program.GraphicsProgram;
import acm.graphics.*;
import java.awt.event.*;
import java.awt.Color;
import acm.util.SoundClip;
import acm.util.RandomGenerator;
/**
 * Write a description of class NumberGame here.
 * 
 * @author Vaed Prasad
 * @version January 2015
 */
public class NumberGame extends GraphicsProgram
{
    private GImage mario;
    private RandomGenerator rgen = RandomGenerator.getInstance();
    private int number1;
    private int number2;
    private int minnumber;
    private int maxnumber;
    private GLabel textminnumber;
    private GLabel textmaxnumber;
    /**
     * Initialize all - instance fields
     * defined as private in the section above.
     * 
     * Add additional GObjects that the player does
     * not interact with as local variables here.
     */
    public void init ()
    {
        setBackground(Color.CYAN);

        mario = new GImage("Mario.png", 100, 100);
        mario.setSize(50, 50);
        add(mario);

        GLabel textminnumber = new GLabel ("Use the W,A,S,D keys to Move Mario to the LARGER number", 10, getHeight()-20);
        textminnumber.setFont("SansSerif-bold-22");
        add(textminnumber);

        numberGenerator();

        addMouseListeners();
        addKeyListeners();
    }

    public void numberGenerator ()
    {
        number1 = numberSelector();
        number2 = numberSelector();
        numberComparator();
        numberAdder();
    }

    public void numberComparator ()
    {
        if (number1 >number2)
        {
            maxnumber = number1;
            minnumber = number2;
        }
        else if (number2 >number1)
        {
            maxnumber = number2;
            minnumber = number1;
        }
        else
        {
            maxnumber = number1;
            minnumber = number2;
        }
    }

    public int numberSelector ()
    {
        int number = rgen.nextInt(1, 10);
        return number;
    }

    public void numberAdder ()
    {
        textmaxnumber = new GLabel (""+ maxnumber, rgen.nextInt(40, 500), rgen.nextInt(40, 500));
        textmaxnumber.setFont("SansSerif-bold-32");
        add(textmaxnumber);

        textminnumber = new GLabel (""+ minnumber, rgen.nextInt(40, 500), rgen.nextInt(40, 500));
        textminnumber.setFont("SansSerif-bold-32");
        add(textminnumber);
    }

    @Override        
    public void keyPressed (KeyEvent e)
    {
        int code = e.getKeyCode();
        char key = e.getKeyChar();
        System.out.println("Key code = " + code + " key char = " + key);
        System.out.println(mario.getBounds());
        if (key == 'a')
        {
            mario.move(-10, 0); 
        }

        if (key == 'd')
        {
            mario.move(10, 0); 
        }

        if (key == 'w')
        {
            mario.move(0, -10); 
        }

        if (key == 's')
        {          
            mario.move(0, 10);            
        }  

        if (mario.getBounds().intersects(textminnumber.getBounds()))
        {
            GLabel incorrect = new GLabel ("Sorry, that is incorrect, please try again", 10, getHeight()-60);
            incorrect.setFont("SansSerif-bold-32");
            add(incorrect);
        }   

        if (mario.getBounds().intersects(textmaxnumber.getBounds()))
        {
            remove(textminnumber);
            remove(textmaxnumber);
            numberGenerator();
        } 
    }
}
