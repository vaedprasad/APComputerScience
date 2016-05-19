
/**
 * Write a description of class Circle here.
 * 
 * @author Vaed Prasad
 * @version 09/14/20135
 */
public class Circle
{
    private int radius;
    private double area;
    /**
     * Constructor for objects of class Circle
     */
    public Circle(int r)
    {
         radius=r;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double getArea(int r)
    {
        double area = Math.pow(radius,2) * Math.PI;
        return area;
    }
    
    public int getRadius()
    {
        return radius;
    }
}
