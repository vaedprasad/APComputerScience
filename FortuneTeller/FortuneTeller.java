import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
/**
 * 
 * @author Vaed Prasad
 * 
 * The Fortune Teller program allows the user to press the "Next" button, and the program then displays a message randomly chosen from an array of messages. The program is implemented in one class, FortuneTeller. 
 * Set up a project with the FortuneTeller.java and ding.wav files given on Haiku.
 * 
 * Add EasyClasses.jar andEasySound.java as a required library.
 * Fill in the blanks in FortuneTeller.java, adding an array of a few "fortunes" (strings) and the code to randomly choose and siply one of them.
 * Recall that the static Math.random method returns a random double value x such that 0<=x<1. We have used it in earlier programs (Craps lab, anyone?). Scale the value returned by Math.random appropriately to obtain a random value for an index within the range of your array.
 * Use display's setText method to show the chosen message. 
 * 
 * 
 */
public class FortuneTeller extends JFrame
implements ActionListener
{
    private static final EasySound ding = new EasySound("ding.wav");

    String[] fortunes = {"You will never meet your true love","Donald Trump will win the 2016 Election and the US will destroy China","Donald Trump will win the 2016 Election and you will help build the wall","You're going to win the lottery but loose your ticket","Justin Bieber will become the greatest singer of all time - and you will be his biggest fan","Fido will destroy the world", "You will fail the AP Computer Science Test", "Bernie Sanders will win the 2016 election and you will be taxed 95%"};

    private JTextField display;

    public FortuneTeller()
    {
        super("Fortune Teller");

        display = new JTextField("  Press \"Next\" to see your fortune...", 25);
        display.setBackground(Color.WHITE);
        display.setEditable(false);

        JButton go = new JButton("Next");
        go.addActionListener(this);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(display);
        c.add(go);
    }

    public void actionPerformed(ActionEvent e)
    {
        int random = (int) (Math.random()*fortunes.length);

        display.setText("  " + fortunes[random]);
        ding.play();
    }

    public static void main(String[] args)
    {
        JFrame window = new FortuneTeller();
        window.setBounds(500, 500,900, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setVisible(true); 
    }
}
