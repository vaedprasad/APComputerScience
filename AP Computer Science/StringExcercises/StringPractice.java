
/**
 * Write a description of class StringPractice here.
 * (a) A string dataStr represents a date in the format "mm/dd/yyyy" 
 * (for example, "05/31/2019").Write a statement or a fragment of code
 * that changes dateStr to the format "dd-mm-yyyy" (for example, "31-05-2019").
 * 
 * (b) Make the code in Part (a) more general, so that i can handle dates
 * written with or without leading zeroes (for example, it should convert
 * "5/3/2019" into "03-05-2019").
 * 
 * 2. Write a scroll method that takes a string as a parameter, moves the
 * first character to the end of the string, and returns the new string.
 * 
 * 
 * 3. Suppose a string holds a person's last name and first name, separated
 * by a comma. Write a method convertName that takes such a string and returns
 * a string where the firt name is placed first followed by one space and then
 * the last name. For example: 
 * 
 * String firstLast = convertName("von Neumann, John");
 * 
 * // first Last is set to "John von Neumann"
 * 
 ***Hint: trim helps get rid of extra white space. 
 * 
 * @author Vaed Prasad
 */
public class StringPractice
{
    public String convertDate(String s)
    {
        return s.substring(0,2) + "-" + s.substring(3,5)+"-" + s.substring(6);
    }
    public String convertDateAdvanced(String s)
    {
        return s.replace("/", "-");
    }
    public String switchFirstLetter(String s)
    {
        return s.substring(1)+s.substring(0,1);
    }
    public String switchFirstNameLastName(String s)
    {
        return s.substring(s.indexOf(",")+2)+ " " + s.substring(0,s.indexOf(","));
    }
}
