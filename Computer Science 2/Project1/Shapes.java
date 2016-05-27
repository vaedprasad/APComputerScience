
/**
 * Write a description of class Shapes here.
 * 
 * @author Vaed Prasad
 * @version September 2014
 */
public class Shapes
{
    public static void main (String [ ] arg)
    {
       int height = 5;
       int base = 7;
       int area = base*height/2;
       double hypothenuse = Math.sqrt((base*base)+(height*height));
       double perimeter = height+base+hypothenuse;
       System.out.println("The Area of A Triangle with Height 5 and Base 7 is " + area);
       System.out.println("The Hypothenuse of A Triangle with Height 5 and Base 7 is " + hypothenuse); 
       System.out.println("The Perimeter of A Triangle with Height 5 and Base 7 is " + perimeter);
      
       
       
}
}