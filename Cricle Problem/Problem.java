import java.util.*;
/**
 * Write a description of class Problem here.
 * 
 * @author Vaed Prasad
 */
public class Problem
{
    private static Random gen = new Random();
    public static void main (String[] args) {
        double trials =1000000;
        double count = 0;
        for(int i = 0; i < trials; i++) {
            if(move(1) == 1)
                count++;
        }   
        System.out.print("\fThe first person will win the money " + count*100/trials + "% of the time.");
    }  

    public static int move(int person){
        double randNum = gen.nextDouble();
        if (randNum < 1.0/3.0) {
            person = (person+1)%5;
            return move(person);
        }
        else if (randNum >= 1.0/3.0 && randNum < 2.0/3.0) {
            person = (person-1)%5;
            return move(person);
        }
        else {
            return person;
        }
    }
}
