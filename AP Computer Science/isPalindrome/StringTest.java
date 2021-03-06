import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Box;

public class StringTest extends JFrame
implements ActionListener
{
    private JTextField input, result;

    public StringTest()
    {
        super("String Test");
        Box box1 = Box.createVerticalBox();
        box1.add(Box.createVerticalStrut(20));
        box1.add(new JLabel("Input:"));
        box1.add(Box.createVerticalStrut(20));
        box1.add(new JLabel("Result:"));

        input = new JTextField(20);
        input.setBackground(Color.YELLOW);
        input.addActionListener(this);
        input.selectAll();

        result = new JTextField(20);
        result.setBackground(Color.WHITE);
        result.setEditable(false);

        Box box2 = Box.createVerticalBox();
        box1.add(Box.createVerticalStrut(20));
        box2.add(input);
        box2.add(Box.createVerticalStrut(20));
        box2.add(result);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(box1);
        c.add(box2);
        input.requestFocus();
    }

    public boolean isPalindrome(String word)
    {
        String reverse = "";
        int length = word.length();

        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + word.charAt(i);

        if (word.equals(reverse))
            return true;
        else
            return false;
    }

    public void actionPerformed(ActionEvent e)
    {
        String str = input.getText();
        String result2 = "";
        if (isPalindrome(str))
        result2 = "true";
        else
        result2 = "false";
        
        result.setText(result2);
        input.selectAll();
    }

    public static void main(String[] args)
    {
        StringTest window = new StringTest();
        window.setBounds(100, 100, 360, 160);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}

