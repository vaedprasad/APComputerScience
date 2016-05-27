/**
 * Chapter 12 Question 6
 * 
 * The class Triangle has methods for calculating the area, the perimeter, and their ratio. 
 * The class works for equilateral triangles and for right isosceles triangles; the type of the triangle is passed in a string to the constructor. 
 * The class also has a main method. 
 * 
 * (a) Restructure this program in the OOP style. Make the Triangle class abstract. Keep the side field, but eliminate the type field.
 * Make the getArea and getPerimeter methods abstract. Derive the concrete classes EquilateralTriangle and RightTriangle from Triangle. 
 * Provide an appropriate constructor for each of the two derived classes and make them call the superclass's constructor. Redefine the
 * abstract methods appropriately in the derived classes. Put main in a separate test class and modify it appropriately. 
 * 
 * (b) The area of a triangle is equal to one half of its perimeter times the radius of the inscribed circle. 
 * If the length of a side of an equilateral triangle is the same as the length of the legs in a right isosceles triangle,
 * which of these triangles can hold a bigger circle inside? 
 * 
 * 
 * Vaed Prasad
 * 
 * 4/4/2016
 * 
 */
public abstract class Triangle
{
    private double side;
    
    public Triangle(){
        side = 1;
    }
    
    public Triangle (double side){
        this.side  = side;
    }
    
    public double getSide(){
        return side;
    }

  
    /**{
    if ("equilateral".equals(type))
    return 3 * side;
    else if ("right".equals(type))
    return (2 + Math.sqrt(2.0)) * side;
    else
    throw new IllegalArgumentException("Invalid triangle type");
    }*/
    public abstract double getPerimeter();

  
    /** {
    if ("equilateral".equals(type))
    return Math.sqrt(3) / 4 * side * side;
    else if ("right".equals(type))
    return side * side / 2;
    else
    throw new IllegalArgumentException("Invalid triangle type");
    } */
    public abstract double getArea();

    public double getRatio()
    {
        return getArea()/getPerimeter();
    }
    //public static void main(String[] args)
    /**  {
    Triangle equilateralTr = new Triangle("equilateral", 12);
    Triangle rightTr = new Triangle("right", 12);
    System.out.println("Equilateral " + equilateralTr.getRatio());
    System.out.println("Right isosceles " + rightTr.getRatio());
    } */


}
