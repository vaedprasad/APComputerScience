
/**
 * Write a description of class StringFun here.
 * 
 * @author Vaed Prasad
 * @version October 2014
 * && and
 * || or
 * ! not
 * == true
 * != false
 * boolean x = ?
 * if (x==true)
 * <
 * >
 * <=
 * >=
 * !=
 */
public class StringFun
{
    public static void main (String [ ] arg)
    {
        String name = "VaedPrasad";

        String lower = name.toLowerCase();
        System.out.println(lower +" lowercase");
        System.out.println(name +" orignal");

        String mt = name.substring(1,1);
        String st1 = name.substring(2,4);

        System.out.println(mt + " = mt");

        int pos= name.indexOf("aedP");

        String fruit = "banana";
        int pos2 = fruit.indexOf("a");

        if (fruit.equals("banana"))
        {
            System.out.println("bananas are yellow");
        }
    }
}