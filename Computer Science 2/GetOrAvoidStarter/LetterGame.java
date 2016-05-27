import acm.graphics.*;
import acm.program.*;
import acm.gui.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import acm.util.RandomGenerator;
import java.util.List;
import java.util.ArrayList;

/**
 * Get or Avoid Game is modeled on the starter
 * game from the SIGSE nifty labs Generic Scrolling Game 2011
 * 
 * The objective is for the students to modify this
 * starting point to develop a more significant game.
 * 
 * Goals:
 * 
 * use an array to store multiple things of one type
 * use JButton, JTextField and JLabel and ActionEvents
 * 
 * 
 * @author J. Smith 
 * @version February 2015
 */
public class LetterGame extends GraphicsProgram
{
    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 400;
    private static final int SCOREAREA_HEIGHT = 75;
    private static final int INDENT = 10;

    private int screenDivisions = 5;
    private double speed = 2.0;
    private double playerspeed = 10.0;
    private int gameSpeed = 25;
    private GLabel [] letters;
    private RandomGenerator randgen = RandomGenerator.getInstance();
    private JLabel scoreLabel;
    private int score;
    private GLabel player;

    @Override
    public void init ()
    {
        randgen = new RandomGenerator();
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Get or Avoid!");
        setBackground(Color.gray);
        score = 0;
        scoreLabel = new JLabel ("Score: "+score);
        scoreLabel.setFont(new Font("Cambria", Font.BOLD, 18));
        add(scoreLabel, NORTH);

        letters = new GLabel [10];

        for (int i=0; i < 10; i++)
        {
            letters[i] = makeLetterLabel (screenDivisions); // 5 initial divisions
            add(letters[i]);
        }

        player = new GLabel ("P", INDENT, 3*getHeight()/screenDivisions);
        player.setFont (new Font("Cambria", Font.BOLD, 24));
        player.setColor(Color.blue);
        add(player);
        addKeyListeners();

    }    

    public GLabel makeLetterLabel (int numDivs)
    {
        boolean get = randgen.nextBoolean();
        String ga;
        if (get)
            ga = "G";
        else
            ga = "A";
        GLabel getOrAvoid = new GLabel (ga);
        getOrAvoid.setFont (new Font("Cambria", Font.BOLD, 24));        
        double locx = randgen.nextDouble(INDENT, getWidth()-getOrAvoid.getWidth());
        int whichdiv = randgen.nextInt(1,numDivs);
        double locy = whichdiv*getHeight()/numDivs;
        getOrAvoid.setLocation(locx, locy);
        return getOrAvoid;
    }

    @Override
    public void keyPressed (KeyEvent event)
    {
        char key = event.getKeyChar();
        if (key == 'k')
        {
            player.move(0, playerspeed);
            player.move(0, playerspeed);
        }
        else if (key == 'i')
        {
            player.move(0, -playerspeed);
        }

    }

    @Override
    public void run ()
    {
        double reset = getWidth() - letters[0].getWidth();
        while (true)
        {
            for (int i=0; i < letters.length; i++)
            {    
                if (letters[i].getBounds().intersects(player.getBounds()))
                {
                    if (letters[i].getLabel().equals("A"))
                        score--;  // A for avoid lose a point
                    else
                        score++; // G for get earn 1 point
                    scoreLabel.setText("Score: " + score);
                    // move the letter immediately
                    letters[i].setLocation(reset, letters[i].getY());
                }
                else
                {
                    letters[i].move(-speed, 0);
                    // wrap around if past the left edge
                    if (letters[i].getX() < 0)
                        letters[i].setLocation(reset, letters[i].getY());
                }
            }
            pause(gameSpeed);
        }
    }
}

