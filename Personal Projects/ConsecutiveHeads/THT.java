import java.util.Random;
/**
 * Write a description of class Heads here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class THT
{
    public static void main(String[] args) {
        double total = 0;
        int trials = 1000000;
        System.out.print("\f");
        for(int i = 0; i < trials; i++) {
            String str = "XXXXXX";
            double counter = 0;
            while(!str.substring(str.length()-6,str.length()).equals("THTHTH")) {
                int num = randInt(0,1);
                if(num == 0)  {
                    counter++;
                    str += "T";
                }
                else {
                    counter++;
                    str += "H";;
                }
            }
            //System.out.print (counter + ", ");
            total += counter;
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