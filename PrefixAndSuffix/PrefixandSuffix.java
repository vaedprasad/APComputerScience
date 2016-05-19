
/**
 * Write a description of class PrefixandSuffix here.
 * 
 * @author Vaed Prasad
 * 
 */
public class PrefixandSuffix {
    public static boolean startsWith (String string, String prefix) {
        if(string.length() < prefix.length()||prefix.length()==0)
            return false;
        return string.substring(0,prefix.length()).equals(prefix);
    } 
    public static boolean endsWith (String string, String suffix) {
        if(string.length() < suffix.length()||suffix.length()==0)
            return false;
        return string.substring(string.length()-suffix.length()).equals(suffix);
    } 
}
