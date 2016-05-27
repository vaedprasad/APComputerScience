
/**
 * Write a description of class StringInfo here.
 * 
 * @author Vaed Prasad
 * @version September 2014
 */
public class VariableTypes
{
    public static void main (String [ ] arg)
    {
      // Primitive Types
      int age = 15;
      double gpa = 3.5;
      char initial = 'j';
      char digit = '0';
      
      String name = "Vaed";
      System.out.println("My name is " + name);
      int length = name.length();
      
      int area = 3*4;
      double average =   (80+85+100)/3.0;
    
      System.out.println("The average of 80, 85, and 100 is " + average);
      
      double bigexpression = (3*4)/5.0+(6-10);
       System.out.println("bigexpression " + bigexpression);

       int bigvalue = Integer.MAX_VALUE + 1;
         System.out.println("The maximum is " + bigvalue);
    }
  
}
