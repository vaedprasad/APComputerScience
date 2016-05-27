
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
public class Rainbow extends JPanel
{

    private Color skyColor = Color.CYAN;
    public Rainbow()
    {
        setBackground(skyColor);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int width = getWidth();    
        int height = getHeight();
        
        int largeRadius = width/4;
        
        int xCenter =width/2-largeRadius/2;
        int yCenter = height*3/4;
        int smallRadius = height/4;
        //int smallRadius = largeRadius/2;
        int mediumRadius = Math.round((float) Math.sqrt(smallRadius*largeRadius));
        int innerRadius = mediumRadius-smallRadius;

        g.setColor(Color.RED);
        g.fillArc(xCenter, yCenter, largeRadius, largeRadius, 0, 180);
        g.setColor(Color.GREEN);
        g.fillArc(xCenter + largeRadius/2 - mediumRadius/2, yCenter+ largeRadius/2 - mediumRadius/2, mediumRadius, mediumRadius, 0, 180);
        g.setColor(Color.MAGENTA);
        g.fillArc(xCenter + largeRadius/2 - smallRadius/2, yCenter+ largeRadius/2 - smallRadius/2, smallRadius, smallRadius, 0, 180);
        g.setColor(skyColor);
        g.fillArc(xCenter + largeRadius/2 - innerRadius/2, yCenter + largeRadius/2 - innerRadius/2, innerRadius, innerRadius, 0, 180);
    }

    public static void main(String[] args)
    {
        JFrame w = new JFrame("Rainbow");
        w.setBounds(300, 300, 300, 200);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = w.getContentPane();
        c.add(new Rainbow());
        w.setVisible(true);
    }
}
