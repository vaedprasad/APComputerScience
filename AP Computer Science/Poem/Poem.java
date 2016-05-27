
/**
 * Write a description of class Poem here.
 * 
 * Vaed Prasad
 * 03/15/2016
 * 
 */
public abstract class Poem
{
    //private int lines;
    public abstract int numLines();

    public abstract int getSyllables(int k);

    public void printRhythm() {
        String str = "";
        for(int i=0;i<numLines();i++) {
            for(int k=0;k<getSyllables(i+1);k++) {
                if(k==numLines() - 1)
                    str+="ta";
                else
                    str+="ta-";
            }
            str+="\n";
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        System.out.println("\f");
        Haiku haiku = new Haiku();
        Limerick limerick = new Limerick();
        
        haiku.printRhythm();
        System.out.println();
        limerick.printRhythm();
    }
}

