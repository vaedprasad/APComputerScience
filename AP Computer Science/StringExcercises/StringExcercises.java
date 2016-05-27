
/**
 * Write a description of class Strings here.
 * 
 * @author Vaed Prasad 
 * @version 12/8/2015
 */
public class StringExcercises
{
    /**
     * Write a method (in BlueJ or Eclipse) that returns true if a given
     * string is not empty and ends with a star (' * '), false otherwise. 
     */
    public boolean endsWithStar(String s) 
    { 
        return !(s.equals("")) && (s.charAt(s.length() - 1)=='*');
    } 

    /**
     * Write a method (in BlueJ or Eclipse) that returns true if a given 
     * string has at least two characters and ends wit htwo stars, false otherwise. 
     */
    public boolean endsWithTwoStars(String s) 
    { 
        return (s.length() >= 2) && (s.charAt(s.length() - 1)=='*') && (s.charAt(s.length() - 2)=='*'); 
    }
}
