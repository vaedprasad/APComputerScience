
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * 
 * 
 * @author Vaed Prasad 
 * @version (a version number or a date)
 */
public class FancyRainbow extends JPanel
{

    private final Color skyColor = Color.CYAN;
    private final Color INDIGO = new Color(111, 0, 255);
    private final Color VIOLET = new Color(127, 0, 255);
    public FancyRainbow()
    {
        setBackground(skyColor);//ROYGIBV
    }

    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int width = getWidth();    
        int height = getHeight();
        int largestRadius = width/2;
        int xCenter =width/2-largestRadius/2;
        int yCenter = height*3/4 - largestRadius/2;

        int largerRadius = 7*largestRadius/8;
        int largeRadius = 6*largestRadius/8;
        int mediumRadius = 5*largestRadius/8;
        int smallRadius = 4*largestRadius/8;
        int smallerRadius = 3*largestRadius/8;
        int smallestRadius = 2*largestRadius/8;
        int cyanRadius = largestRadius / 8;

        g.setColor(Color.RED);
        g.fillArc(xCenter, yCenter, largestRadius, largestRadius, 0, 180);
        
        g.setColor(Color.ORANGE);
        g.fillArc(xCenter + largestRadius/2 - largerRadius/2, yCenter+ largestRadius/2 - largerRadius/2, largerRadius, largerRadius, 0, 180);
        
        g.setColor(Color.YELLOW);
        g.fillArc(xCenter + largestRadius/2 - largeRadius/2, yCenter+ largestRadius/2 - largeRadius/2, largeRadius, largeRadius, 0, 180);
        
        g.setColor(Color.GREEN);
        g.fillArc(xCenter + largestRadius/2 - mediumRadius/2, yCenter+ largestRadius/2 - mediumRadius/2, mediumRadius, mediumRadius, 0, 180);
        
        g.setColor(Color.BLUE);
        g.fillArc(xCenter + largestRadius/2 - smallRadius/2, yCenter+ largestRadius/2 - smallRadius/2, smallRadius, smallRadius, 0, 180);
        
        g.setColor(INDIGO);
        g.fillArc(xCenter + largestRadius/2 - smallerRadius/2, yCenter+ largestRadius/2 - smallerRadius/2, smallerRadius, smallerRadius, 0, 180);
        
        g.setColor(VIOLET);
        g.fillArc(xCenter + largestRadius/2 - smallestRadius/2, yCenter+ largestRadius/2 - smallestRadius/2, smallestRadius, smallestRadius, 0, 180);
        
        g.setColor(skyColor);
        g.fillArc(xCenter + largeRadius/2 + cyanRadius/2, yCenter + largeRadius/2 + cyanRadius/2, cyanRadius, cyanRadius, 0, 180);
    }

    public static void main(String[] args)
    {
        JFrame w = new JFrame("Rainbow");
        w.setBounds(300, 300, 300, 200);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = w.getContentPane();
        c.add(new FancyRainbow());
        w.setVisible(true);
    }
}
