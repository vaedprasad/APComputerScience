
/**
 * Write a description of class EquilateralTriangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EquilateralTriangle extends Triangle
{
    public EquilateralTriangle(double side){
        super(side);
    }

    public double getArea() {
        double s = getSide();
        return Math.sqrt(3) / 4 * s * s;
    }

    public double getPerimeter(){
        double s = getSide();
        return  3 * s;
    }
}
