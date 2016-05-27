
/**
 * Write a description of class Limerick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Limerick extends Poem
{
    private int lines = 5;
    
    public Limerick() {
    }
    
    public int getSyllables(int k) {
        if(k==1||k==2 ||k==5)
            return 9;
        else
            return 6;
    }
    
    public int numLines() {
        return lines;
    }
    
}
