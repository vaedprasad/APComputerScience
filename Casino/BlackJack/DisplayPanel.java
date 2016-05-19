// Represents a display panel for a Craps table

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class DisplayPanel extends JPanel
{
    private JTextField cashText, pointText, dealerText;
    private int wonCount, lostCount;

    // Constructor
    public DisplayPanel()
    {
        super(new GridLayout(2, 3, 10, 0));
        setBorder(new EmptyBorder(0, 0, 5, 0));

        add(new JLabel("    Cash:"));
        add(new JLabel("    Point:"));
        add(new JLabel("    Dealer:"));

        Font displayFont = new Font("Monospaced", Font.BOLD, 16);

        cashText = new JTextField("  0", 5);
        cashText.setFont(displayFont);
        cashText.setEditable(false);
        cashText.setBackground(Color.WHITE);
        add(cashText);

        pointText = new JTextField("  0", 5);
        pointText.setFont(displayFont);
        pointText.setEditable(false);
        pointText.setBackground(Color.WHITE);
        add(pointText);

        dealerText = new JTextField(5);
        dealerText.setFont(displayFont);
        dealerText.setEditable(false);
        dealerText.setBackground(Color.WHITE);
        add(dealerText);
    }

    // Updates this display, based on the result and
    // "point" in the previous roll
    public void update(int result, int point)
    {
        while(true)
        {
            pointText.setText(""+die1.getCardNum()+die2.getCardNum());
        }

        /*if (result > 0)
        {
            wonCount++;
            cashText.setText("  " + wonCount);
            pointText.setText("");
            pointText.setBackground(Color.DARK_GRAY);
        }
        else if (result < 0)
        {
            lostCount++;
            lostText.setText("  " + lostCount);
            pointText.setText("");
            pointText.setBackground(Color.DARK_GRAY);
        }
        else
        {
            pointText.setText("  " + point);
            pointText.setBackground(Color.YELLOW);
        }*/
    }
}
