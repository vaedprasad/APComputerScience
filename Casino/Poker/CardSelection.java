// Implements a rolling die

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
/**
 * 
 * Vaed Prasad
 * 
 */
public class CardSelection extends Card{
    private static final double slowdown = 0.97;
    private static final double speedFactor = 0.04;
    private static final double speedLimit = 2.0;

    private static int tableLeft, tableRight, tableTop, tableBottom;

    private final int dieSize = 54;
    private int xCenter, yCenter;
    private double xSpeed, ySpeed;

    // sets the "table" boundaries
    public static void setBounds(int left, int right, int top, int bottom)
    {
        tableLeft = left;
        tableRight = right;
        tableTop = top;
        tableBottom = bottom;
    }

    // Constructor: sets this die "off the table"
    public CardSelection()
    {
        xCenter = 150;
        yCenter = 150;
    }

    // Starts this die rolling
    public void drawCard()
    {
        super.selectCard();
        int width = tableRight - tableLeft;
        int height = tableBottom - tableTop;
        xCenter = tableLeft;
        yCenter = tableTop + height / 2;
    }

    // Returns true if this die is rolling; otherwise
    // returns false
    public boolean isRolling()
    {
        return xSpeed > speedLimit || xSpeed < -speedLimit
        || ySpeed > speedLimit || ySpeed < -speedLimit;
    }

    // Keeps moving this die as long as it overlaps
    // with other

    // Draws this die, rolling or stopped;
    // also moves this die, when rolling
    public void draw(Graphics g, boolean isFirstCard)
    {
        drawStopped(g, isFirstCard);
    }

    // Draws this die when rolling with a random number of dots

    // Draws this die when stopped
    private void drawStopped(Graphics g, boolean isFirstCard)
    {
        int x = xCenter - dieSize / 2;
        int y = yCenter - dieSize / 2;
        g.setColor(Color.WHITE);
        if (isFirstCard==true)
        {
            g.fillRect(tableRight/2, tableBottom-200, 90, 120);
            drawCard(g, tableRight/2, tableBottom-200, getCardNum(), getSuiteNum());
        }
        else
        {
            g.fillRect(tableRight/2-120, tableBottom-200, 90, 120);
            drawCard(g, tableRight/2-120, tableBottom-200, getCardNum(), getSuiteNum());
        }
    }

    // Draws a given number of dots on this die
    private void drawCard(Graphics g, int x2, int y2, int numCard, int numSuite)
    {
        g.setColor(Color.BLACK);
        int fontSize=30;
        boolean isRed=true;
        switch (numSuite)
        {
            case 1:
            g.setColor(Color.BLACK);
            g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
            g.drawString("S", x2, y2+20);
            isRed=false;
            break;

            case 2:
            g.setColor(Color.RED);
            g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
            g.drawString("D", x2, y2+20);
            isRed=true;
            break;

            case 3:
            g.setColor(Color.BLACK);
            g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
            g.drawString("C", x2, y2+20);
            isRed=false;
            break;

            case 4:
            g.setColor(Color.RED);
            g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
            g.drawString("H", x2, y2+20);
            isRed=true;
            break;
        }
        fontSize = 50;
        switch (numCard)
        {

            case 1:
            if(isRed) g.setColor(Color.RED);
            else  g.setColor(Color.BLACK);
            g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
            g.drawString("A", x2+40, y2+80);
            break;

            case 2:
            if(isRed) g.setColor(Color.RED);
            else  g.setColor(Color.BLACK);
            g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
            g.drawString("2", x2+40, y2+80);
            break;

            case 3:
            if(isRed) g.setColor(Color.RED);
            else  g.setColor(Color.BLACK);
            g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
            g.drawString("3", x2+40, y2+80);
            break;

            case 4:
            if(isRed) g.setColor(Color.RED);
            else  g.setColor(Color.BLACK);
            g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
            g.drawString("4", x2+40, y2+80);
            break;

            case 5:
            if(isRed) g.setColor(Color.RED);
            else  g.setColor(Color.BLACK);
            g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
            g.drawString("5", x2+40, y2+80);
            break;

            case 6:
            if(isRed) g.setColor(Color.RED);
            else  g.setColor(Color.BLACK);
            g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
            g.drawString("6", x2+40, y2+80);
            break;

            case 7:
            if(isRed) g.setColor(Color.RED);
            else  g.setColor(Color.BLACK);
            g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
            g.drawString("7", x2+40, y2+80);
            break;

            case 8:
            if(isRed) g.setColor(Color.RED);
            else  g.setColor(Color.BLACK);
            g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
            g.drawString("8", x2+40, y2+80);
            break;

            case 9:
            if(isRed) g.setColor(Color.RED);
            else  g.setColor(Color.BLACK);
            g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
            g.drawString("9", x2+40, y2+80);
            break;

            case 10:
            if(isRed) g.setColor(Color.RED);
            else  g.setColor(Color.BLACK);
            g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
            g.drawString("10", x2+20, y2+80);
            break;

            case 11:
            if(isRed) g.setColor(Color.RED);
            else  g.setColor(Color.BLACK);
            g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
            g.drawString("J", x2+40, y2+80);
            break;

            case 12:
            if(isRed) g.setColor(Color.RED);
            else  g.setColor(Color.BLACK);
            g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
            g.drawString("Q", x2+40, y2+80);
            break;

            case 13:
            if(isRed) g.setColor(Color.RED);
            else  g.setColor(Color.BLACK);
            g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
            g.drawString("K", x2+40, y2+80);
            break;
        }
    }
    /*
    public void paint(Graphics g) {
    Dimension d = this.getPreferredSize();
    int fontSize = 20;

    g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));

    g.setColor(Color.red);

    }
     */
    // Moves this die on the "table," bouncing
    // off the edges when necessary

    /*private void move()
    {
    xCenter += xSpeed;
    yCenter += ySpeed;

    int radius = dieSize / 2;

    if (xCenter < tableLeft + radius)
    {
    xCenter = tableLeft + radius;
    xSpeed = -xSpeed;
    }

    if (xCenter > tableRight - radius)
    {
    xCenter = tableRight - radius;
    xSpeed = -xSpeed;
    }

    if (yCenter < tableTop + radius)
    {
    yCenter = tableTop + radius;
    ySpeed = -ySpeed;
    }

    if (yCenter > tableBottom - radius)
    {
    yCenter = tableBottom - radius;
    ySpeed = -ySpeed;
    }
    }*/

    /*private void drawRolling(Graphics g)
    {
    int x = xCenter - dieSize / 2 + (int)(3 * Math.random()) - 1;
    int y = yCenter - dieSize / 2 + (int)(3 * Math.random()) - 1;
    g.setColor(Color.RED);
    if (x % 2 != 0){
    g.fillRect(tableRight/2, tableBottom-200, 90, 120);
    }
    else {
    g.fillOval(x - 2, y - 2, dieSize + 4, dieSize + 4);
    }
    Card card = new Card();
    card.selectCard();
    drawCard(g, x, y, card.getCardNum(), card.getSuiteNum());
    }*/
}

