
/**
 * Write a description of class Haiku here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Haiku extends Poem
{
    private int lines = 3;
    
    public Haiku() {
    }
    
    public int getSyllables(int k) {
        if(k==1||k==3)
            return 5;
        else
            return 7;
    }
    
    public int numLines() {
        return lines;
    }
}
