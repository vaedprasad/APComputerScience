
/**
 * Write a description of class Cylinder here.
 * 
 * @author Vaed Prasad
 * @version 09/16/2015
 */
public class Cylinder
{
    private Circle base;
    private double height;
    public double volume;
    private int radius;
    /**
     * Constructor for objects of class Cylinder
     */
    public Cylinder(int r, int h)
    {
        radius = r;
        Circle b = new Circle(r);
        base = b;
        height = h;
    }


    public double getVolume(int r, int h)
    {
        double volume = Math.pow(radius,2) * Math.PI * height;
        return volume;
    }
}
