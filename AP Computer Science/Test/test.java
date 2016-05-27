
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    public boolean method1(String testString) 
    { 
        if ((testString.charAt(testString.length() - 1)=='*') && !(testString.equals(""))) 
            return true; 
        else 
            return false; 
    } 

    public boolean method2(String testString) 
    { 
        if ((testString.length() >= 2) && (testString.charAt(testString.length() - 1)=='*') && (testString.charAt(testString.length() - 2)=='*')) 
            return true; 
        else 
            return false; 
    }
}
