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
 * @author Vaed Prasad
 * @version April 2015
 */
public class Recursive extends GraphicsProgram
{
    @Override
    public void init ()
    {
        int number = 1;
        function(1);
        addKeyListeners();
    }

    public void function(int number)
    {
        for (int x = number; x>1; x--)
        {
            int number = number * x;

        }
                    System.out.println(number*x);
        
        return number;
    }
}

