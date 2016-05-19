// Represents the craps table with two rolling dice

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.Timer;
/**
 * Vaed Prasad 
 * 
 * 
 */
public class PokerTable extends JPanel
                        implements ActionListener
{
  private CardSelection die1, die2;
  private final int delay = 20;
  private Timer clock;
  private PokerGame game;
  private DisplayPanel display;

  // Constructor
  public PokerTable(DisplayPanel displ)
  {
    setBackground(Color.green);
    setBorder(new LineBorder(Color.ORANGE.darker(), 3));
    display = displ;
    game = new PokerGame();
    die1 = new CardSelection();
    die2 = new CardSelection();
    clock = new Timer(delay, this);
  }

  // Rolls the dice (called when the "Roll" button
  // is clicked)
  public void rollDice()
  {
    CardSelection.setBounds(3, getWidth() - 3, 3, getHeight() - 3);
    die1.drawCard();
    die2.drawCard();
    clock.start();
  }

  // Processes timer events
  public void actionPerformed(ActionEvent e)
  {
    repaint();
  }

  // returns true if dice are still rolling; otherwise
  // returns false
  public boolean diceAreRolling()
  {
    return die1.isRolling() || die2.isRolling();
  }

  // Called automatically after a repaint request
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    die1.draw(g, true);
    die2.draw(g, false);
  }
}


