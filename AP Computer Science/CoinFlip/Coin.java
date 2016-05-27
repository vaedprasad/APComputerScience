import java.awt.Image;
import java.awt.Graphics;

public class Coin
{
  private Image heads, tails;
  private boolean side;

  public Coin(Image pic1, Image pic2)
  {
    heads = pic1;
    tails = pic2;
    side = true;
  }

  public void flip()
  {
    side = !side;
  }

  public void draw(Graphics g, int x, int y)
  {
    if (side)
    {
      int width = heads.getWidth(null);
      int height = heads.getHeight(null);
      g.drawImage(heads, x - width /2, y - height/2, null);
    }
    else
    {
      int width = tails.getWidth(null);
      int height = tails.getHeight(null);
      g.drawImage(tails, x - width /2, y - height/2, null);
    }
  }
}
