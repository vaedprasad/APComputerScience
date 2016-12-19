// this set of imports should cover most
// of what any graphics program in CS2 needs
import acm.program.GraphicsProgram;
import acm.graphics.*;
import java.awt.event.*;
import java.awt.Color;
import acm.util.SoundClip;
import acm.util.RandomGenerator;
/**
 * class HorsePlay uses sound
 * and mouse and key events to allow the user to
 * interact with an image.
 * 
 * Also demonstrates 
 * - variable scope, only those items used by multiple
 *   methods are declared with class scope.
 * - use of GLabel
 * - use of keys to move an image on the screen
 * - RandGenerator
 * 
 * @author J. Smith 
 * @version January 2015
 */
public class HorsePlay extends GraphicsProgram
{
    // define a constant - a variable that never changes
    private static final int STEP = 20;
    // any time you want randomness in your program
    // add this line ONE time to the top of your program
    // variable randGen can generate random colors, ints, doubles
    private RandomGenerator randGen = RandomGenerator.getInstance();
    // define the parts of the game that the
    // player interacts with as instance fields.
    private GImage horse;
    private GRect  food;
    private SoundClip neigh;
    private GRect nose;
    private GLabel meter;
    
    /**
     * Initialize all - instance fields
     * defined as private in the section above.
     * 
     * Add additional GObjects that the player does
     * not interact with as local variables here.
     */
    public void init ()
    {
        
        horse = new GImage("Mario.png", getWidth()/2, getHeight()/2);
        horse.setSize(200, 200);
        add(horse);
        // add an "invisible" rectangle on the image 
        // for the horse so you can click on only the nose
        nose = new GRect(horse.getX(), horse.getY()+50, 20, 20);
        nose.setColor(Color.white);
        add(nose);
        nose.sendToBack(); // behind the hor0se image
        
        meter = new GLabel ("Your horse is hungry", 20, 50);
        meter.setFont("SansSerif-bold-50");
        add(meter);
        
        food = new GRect(20, horse.getY(), 20, 20);
        food.setFilled(true);
        food.setColor(Color.orange);
        add(food);
        // end the init method by adding listeners for
        // the type of events you use in the program
        // The horse program uses both mouse and key events
        addMouseListeners();
        addKeyListeners();
    }
    
    /**
     * Write code in mousePressed
     * 
     * Other mouse methods you may wish to write can
     * be found in the Java api for MouseListener and
     * MouseMotionListener.
     */
    @Override
    public void mousePressed (MouseEvent e)
    {
        // The contains method is useful, this
        // example checks to see if the coordinate
        // where the mouse was clicked is inside the 
        // nose rectangle.
        if (nose.contains(e.getX(), e.getY()))
        {
            // this plays the sound loaded in the init method.
            neigh.play();
        }
    }
    
    /**
     * This method responds to key press events.
     * Remember that the code can be used for odd keys
     * like the arrows or the number pad.
     * 
     * The key char can be used for letters and numbers and
     * punctuation.
     * 
     * This gives an example of comparing the key char to the
     * keyboard 'j'
     */
    @Override
    public void keyPressed (KeyEvent e)
    {
        int code = e.getKeyCode();
        char key = e.getKeyChar();
        System.out.println("Key code = " + code + " key char = " + key);
        if (key == 'j')
        {
            /**
             * The move method lets you change the position
             * of any GObject by an amount in the x and amount
             * in the y direction.
             * 
             * negative amounts move the object left or up
             * positive amounts move the object right or down
             */
            horse.move(-10, 0); // move left STEP units and up/down 0
            nose.move(-10, 0); // move the nose too!
            
            // This is an important statement to understand
            // getBounds returns the rectangle bounding any GObject
            // to GRectangles, bounding boxes, can be compared with
            // the intersects method to see if they overlap.
            // This call checks the horse GImage and the food GRect
            // to see if the two objects overlap
            if (horse.getBounds().intersects(food.getBounds()))
            {
                meter.setLabel("Now your horse is happy");
                /**
                 * This section of code moves the food to a new
                 * random x coordinate relative to the horse.
                 * 
                 * if the new x coordinate would be off the screen
                 * it positions the food on the right side of the
                 * screen.
                 * 
                 * The setLocation method lets you reposition any
                 * GObject to a new x,y coordinate.
                 */
                double foodloc = horse.getX()-randGen.nextInt(10,50);
                if (foodloc < 0)
                {
                    foodloc = getWidth()-food.getWidth();
                }
                food.setLocation(foodloc, food.getY());
            }
        }
    }
    
    
}
