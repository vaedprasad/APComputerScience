import java.awt.*;
import java.applet.*;
/**
 * Write a description of class Graphics75 here.
 * 
 * @author Vaed Prasad
 */
public class Graphics75 extends Applet
{
    public void paint(Graphics g)
    {
        int width = 980;
        int height = 630;
        g.drawRect(10,10,width,height);

        for (int i=10; i< 980; i+=10)
        {
            g.drawLine(i+20, 640, 990, 630-i);

        }
    }
}
