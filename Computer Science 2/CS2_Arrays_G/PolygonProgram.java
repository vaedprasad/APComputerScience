import acm.program.GraphicsProgram;
import acm.graphics.*;
import java.awt.event.*;
import java.awt.Color;
import acm.util.SoundClip;
import acm.util.RandomGenerator;
import javax.swing.JButton;
import java.awt.Font;
/**
 * class PolygonProgram does some
 * fundamental things with an array
 * 
 * @author Vaed Prasad
 * @version February 2015
 */
public class PolygonProgram extends GraphicsProgram
{
    private JButton drawPoly;
    public void init ()
    {
        setBackground(Color.CYAN);
        addMouseListeners();
        drawPoly = new JButton ("draw");
        drawPoly.setActionCommand("draw");
        add(drawPoly, NORTH);
        addActionListeners();
    }

    public void  actionPerformed (ActionEvent event)
    {
        String action = event.getActionCommand();
        if (action == "draw")
        {
            System.out.println("Yes");

            GPoint [] points = new GPoint [3];
            points [0] = new GPoint (100,150);
            points [1] = new GPoint (200,200);
            points [2] = new GPoint (300,150);
            GPolygon triangle = new GPolygon(points);
            add(triangle);
        }
    }

    public void  method2 ()
    {

    }

    public void  method3 ()
    {

    }
}
