import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.text.DecimalFormat;
/**
 * 
 * Vaed Prasad
 * 10/02/2015
 */
public class DogToHumanAge extends JFrame
implements ActionListener
{
    JTextField inputDogAge, displayHumanYears;

    public DogToHumanAge()
    {
        super("Dog Age to Human Age Converter");
        JLabel labelDogAge = new JLabel("Age of Dog (Years):", SwingConstants.RIGHT);
        inputDogAge = new JTextField(5);
        JLabel labelHumanYears = new JLabel("Corresponding Human Years = ", SwingConstants.RIGHT);
        displayHumanYears = new JTextField(5);
        displayHumanYears.setEditable(false);
        JButton go = new JButton("Compute");
        go.addActionListener(this);

        Container c = getContentPane();
        c.setBackground(Color.white);
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(3, 2, 5, 5));
        p.add(labelDogAge);
        p.add(inputDogAge);
        p.add(labelHumanYears);
        p.add(displayHumanYears);
        c.add(p, BorderLayout.CENTER);
        c.add(go, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e)
    {
        int dogYears = Integer.parseInt(inputDogAge.getText());
        int humanYears = convertToHumanAge(dogYears);
        DecimalFormat df = new DecimalFormat("00");
        displayHumanYears.setText(df.format(humanYears));
    }

    public int convertToHumanAge(int dogYears)
    {
        double humanYears = 0;
        if (dogYears == 1)
        {
            humanYears = 13;
        }
        else if (dogYears > 1)
        {
            humanYears = ((dogYears-1)*(16.0/3.0))+13;
        }
        int hYears = (int) Math.round(humanYears);
        return hYears;
    }

    public static void main(String[] args)
    {
        DogToHumanAge w = new DogToHumanAge();
        w.setBounds(300, 300, 300, 160);
        w.setDefaultCloseOperation(EXIT_ON_CLOSE);
        w.setVisible(true);
    }
}

