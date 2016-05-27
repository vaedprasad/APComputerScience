
/**
 * Write a description of class TriangleTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleTest
{
    public void main (String[] args) {
        Triangle equilateralTr = new EquilateralTriangle(12);
        Triangle rightTr = new RightTriangle(12);
        System.out.println("Equilateral " + equilateralTr.getRatio());
        System.out.println("Right isosceles " + rightTr.getRatio());
    }
}
