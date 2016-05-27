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
 * Use an array to store multiple things of one type
 * Use JButton, JTextField and JLabel and ActionEvents
 * 
 * 
 * @author Vaed Prasad
 * @version February 2015
 */
public class SpaceAdventure extends GraphicsProgram
{
    private static final int WINDOW_WIDTH = 1925;
    private static final int WINDOW_HEIGHT = 1200;
    private static final int SCOREAREA_HEIGHT = 300;
    private static final int INDENT = 0;

    private GImage rocket;
    private GImage movingObject;
    private GRect barrier;

    private int screenDivisions = 20;
    private double speed = 2.0;
    private double playerspeed = 10.0;
    private int gameSpeed = 25;
    private GImage [] images;
    private GImage [] coin;
    private boolean [] isAsteroid;
    private RandomGenerator randgen = RandomGenerator.getInstance();

    private JLabel scoreLabel;
    private JLabel livesLabel;
    private JLabel fuelLabel;

    private int score;
    private int lives;
    private int fuel;

    private boolean upPressed = false;
    private boolean leftPressed = false;
    private boolean downPressed = false;
    private boolean rightPressed = false;

    @Override
    public void init ()
    {
        randgen = new RandomGenerator();
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Space Adventure");
        setBackground(Color.black);

        score = 0;
        scoreLabel = new JLabel ("Score: "+ score);
        scoreLabel.setFont(new Font("Cambria", Font.BOLD, 18));
        add(scoreLabel, NORTH);

        lives = 3;
        livesLabel = new JLabel ("Lives: "+ lives);
        livesLabel.setFont(new Font("Cambria", Font.BOLD, 18));
        add(livesLabel, NORTH);

        fuel = 100;
        fuelLabel = new JLabel ("Fuel: "+ fuel);
        fuelLabel.setFont(new Font("Cambria", Font.BOLD, 18));
        add(fuelLabel, NORTH);

        images = new GImage [40];
        isAsteroid= new boolean [40];
        for (int i=0; i < 40; i++)
        {
            images[i] = asteroidSelector (screenDivisions, i); // 5 initial divisions
            add(images[i]);
        }

        coin = new GImage [3];

        // 5 initial divisions
        

        for (int i=0; i < 3; i++)
        {
            coin[i] = resetCoin (screenDivisions);
            add(coin[i]);
        }

        rocket = new GImage("rocket.png", 100, 100);
        rocket.setSize(50, 50);
        add(rocket);
        
        barrier = new GRect(225, 1200, 1700, 0);
        add(barrier);


        addKeyListeners();
    }

    public GImage resetCoin(int numDivs)
    {
        GImage answer = new GImage("coin.png");
        answer.setSize(50, 50);
        double locx = randgen.nextDouble(INDENT, getWidth()-answer.getWidth());
        int whichdiv = randgen.nextInt(1,numDivs);
        double locy = whichdiv*getHeight()/numDivs;

        answer.setLocation(locx, locy);

        return answer;
    }

    public GImage asteroidSelector (int numDivs, int location)
    {
        boolean get = randgen.nextBoolean();
        String selection;
        if (get)
        {
            selection = "asteroid.png";
            isAsteroid[location] = true;
        }
        else
        {
            selection = "gas.png";
            isAsteroid[location] = false;
        }

        movingObject = new GImage(selection);
        movingObject.setSize(50, 50);

        double locx = randgen.nextDouble(INDENT, getWidth()-movingObject.getWidth());
        int whichdiv = randgen.nextInt(1,numDivs);
        double locy = whichdiv*getHeight()/numDivs;

        movingObject.setLocation(locx, locy);

        return movingObject;
    }

    @Override
    public void keyPressed (KeyEvent event)
    {
        char key = event.getKeyChar();
        int keyCode = event.getKeyCode();
        if(key == 'w')
        {
            upPressed = true;
        }

        if(key == 's')
        {
            downPressed = true;
        }
        
        if(key == 'a')
        {
            leftPressed = true;
        }

        if(key == 'd')
        {
            rightPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        char keyChar = e.getKeyChar();
        if(keyChar == 'w')
        {
            upPressed = false;
        }
        if(keyChar == 's')
        {
            downPressed = false;
        }
        if(keyChar == 'a')
        {
            leftPressed = false;
        }
        if(keyChar == 'd')
        {
            rightPressed = false;
        }
    }

    @Override
    public void run ()
    {
        double reset = getWidth() - images[0].getWidth();
        int counter = 0;
        while (true)
        {    
            if(rightPressed)
            {
                rocket.move(playerspeed, 0);
            }
            if(leftPressed)
            {
                rocket.move(-playerspeed, 0);
            }
            if(downPressed)
            {
                rocket.move(0, playerspeed);
            }
            if(upPressed)
            {
                rocket.move(0, -playerspeed);
            }

            if (counter != 3)
            {
                counter++;
            }
            else
            {
                counter=0;
                fuel--;
                fuelLabel.setText("Fuel: " + fuel);
            }

            for (int i=0; i < images.length; i++)
            {
                if (images[i].getBounds().intersects(rocket.getBounds()))
                {
                    if (isAsteroid[i])
                    {
                        lives--;  // If the player hits an asteroid, the player looses a life
                    }
                    else
                    {
                        fuel= fuel+5; // If the player hits a gas can, the player gains 10 fuel
                    }
                    scoreLabel.setText("Score: " + score);
                    livesLabel.setText("Lives: " + lives);
                    // move the object immediately
                    images[i].setLocation(reset, images[i].getY());
                }
                else
                {
                    images[i].move(-speed, 0);
                    // wrap around if past the left edge
                    if (images[i].getX() < 0)
                        images[i].setLocation(reset, images[i].getY());
                }
            }
            pause(gameSpeed);

            for (int i=0; i < coin.length; i++)
            {
                if(rocket.getBounds().intersects(coin[i].getBounds()))
                {
                    System.out.println(coin[i].getBounds());
                    score++;
                    scoreLabel.setText("Score: " + score);
                    remove(coin[i]);
                    coin[i] = resetCoin(5);
                    add(coin[i]);
                }
            }

            if (lives <= 0 || fuel<=0)
            {
                GLabel gameOver = new GLabel ("Game Over", getWidth()/2-72, getHeight()/2);
                gameOver.setFont("SansSerif-bold-72");
                gameOver.setColor(Color.white);
                add(gameOver);

                GLabel dsiplayScore = new GLabel ("Your Score is:" + score, getWidth()/2-72, getHeight()/2+72);
                dsiplayScore.setFont("SansSerif-bold-72");
                dsiplayScore.setColor(Color.white);
                add(dsiplayScore);
                //Displays "Game Over" and the user's score

                break; //Ends Program after user has lost all of their lives
            }
            
            if (rocket.getBounds().intersects(barrier.getBounds()))
            {
                double x = rocket.getX();
                rocket.setLocation(x-100,rocket.getY());
            }
        }
    }
}

