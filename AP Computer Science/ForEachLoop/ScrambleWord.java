
/**
 * Write a description of class ScrambleWord here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScrambleWord
{
    public static String scrambleWord(String word){
        int s = word.length();
        if (s==0||s==1)
        return word;
        String [] str = new String [s];
        for (int i = 0; i < s; i++) {
            str[i] = word.substring(i,i+1);
        }
        for (int i = 0; i < s-1; i++) {
            if (str[i].equals("A") && !str[i+1].equals("A")) {
                String temp = "";
                temp = str[i];
                str[i] = str[i+1];
                str[i+1] = temp;
                i++;
            }
        }
        String scram = "";
        for (String q : str)
        scram += q;
        return scram;
    }

}
