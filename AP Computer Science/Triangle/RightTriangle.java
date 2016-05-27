
/**
 * Write a description of class RightTriangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public  class RightTriangle extends Triangle
{
    public RightTriangle(double side){
        super(side);
    }

    public double getArea() {
        double s = getSide();
        return(2 + Math.sqrt(2.0)) * s;
    }

    public double getPerimeter(){
        double s = getSide();
        return s * s / 2;
    }
}
