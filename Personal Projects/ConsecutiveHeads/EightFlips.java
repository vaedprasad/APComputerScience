import java.util.Random;
/**
 * Write a description of class Heads here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EightFlips
{
    public static void main(String[] args) {
        double total = 0;
        int trials = 500000000;
        int flips = 8;
        System.out.print("\f");
        for(int i = 0; i < trials; i++) {
            int numHeads = 0;
            int numTails = 0;            
            for(int j = 0; j < flips; j++) {
                int num = randInt(0,1);
                if(num == 0)  {
                    numHeads++;
                }
                else {
                    numTails++;
                }
                if(numTails > numHeads) {
                    total--;
                    break;
                }
            }
            total++;
        }
        double average = total/trials;
        System.out.println(average);
    }

    public static int randInt(int min, int max) {

        // Usually this can be a field rather than a method variable
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
}