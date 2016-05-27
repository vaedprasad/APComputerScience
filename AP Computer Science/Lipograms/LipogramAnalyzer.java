import java.util.*;
/**
 * 
 * @author Vaed Prasad
 *
 */

public class LipogramAnalyzer {
    private String text;
    private String[] textSplitUp;

    /**
     * Saves the text string. 
     */
    public LipogramAnalyzer(String text)
    {
        this.text = text;
        text.replaceAll(" ","1000000000");
        text.replaceAll("//W","");
        text.replaceAll("1000000000"," ");
        textSplitUp = text.split(" ");
    }

    /**
     * Returns the saved text string with
     * all characters equal to letter replaced with ‘#’.
     */
    public String mark(char letter)
    {
        return text.replace(letter, '#');
    }

    /*
     * 
     * Returns a string that concatenates all “offending” words from text that contain
     * letter; the words are separated by ‘\n’ characters; the returned string does not
     * contain duplicate words: each word occurs only once; there are no punctuation 
     * or whitespace characters in the returned string other than ‘\n’ characters.
     * 
     */
    public String allWordsWith(char letter)
    {
        ArrayList<String> offending = new ArrayList<String>();
        for (int i = 0; i < textSplitUp.length; i++) {
            String str = textSplitUp[i];
            if (str.contains("" + letter) && !offending.contains(str)) {
                offending.add(str);
            }
        }
        String rv = "";
        for (int i = 0; i < offending.size(); i++) {
            rv += offending.get(i) + "\n";
        }
        return rv;
    }

    public static void main(String[] args) {
        LipogramAnalyzer la=new LipogramAnalyzer("testing testing cool");
        System.out.println(la.allWordsWith('t'));
    }
}