import java.util.*;
/**
 * Write a description of class Challenges here.
 * 
 * @author VaedPrasad
 */
public class GeometricProbabilityProblems
{
    public static void problem4 () {
        //Givens
        int firstNumber = 0;
        int secondNumber = 100;
        int greaterThan = 1;
        //Calculations
        int difference = Math.abs(firstNumber-secondNumber);
        System.out.print("\f");
        Random random = new Random();
        double trials = 1000000.00;
        double count = 0.00;
        for(int i = 0; i < trials; i++) {
            double rand1 = random.nextDouble()*difference+Math.min(firstNumber,secondNumber);
            double rand2 = random.nextDouble()*difference+Math.min(firstNumber,secondNumber);
            if (rand1 + rand2 > greaterThan) {
                count++;
            }
        }
        System.out.println("The probability that two random integers between "+Math.min(firstNumber,secondNumber) + " and " +Math.max(firstNumber,secondNumber)+" are greater than " + greaterThan + " is: " + 100*(count/trials) + "%.");
    }

    public static void bonus () {
        System.out.print("\f");

        double trials = 10000000.00;
        double count = 0.00;
        for(int i = 0; i < trials; i++) {
            double a = Math.random();
            double b = Math.random();
            double first = Math.min(a,b);
            double second = Math.max(a,b) - first;
            double third = 1 - Math.max(a,b);
            if (!(first+second <= third || first+third <= second ||third+second <= first)) {
                count++;
            }
        }
        System.out.println(count/trials);
    }

    public static void quiz1 () {
        System.out.print("\f");
        double trials = 100000000;
        double count = 0;
        for(int i = 0; i < trials; i++) {
            double first = Math.random()*5;
            double second = Math.random()*10;
            if (first>second && first+second > 6) {
                count++;
            }
        }
        System.out.println(count/trials);
    }
    
    public static void recursive(){
        
    }
    
    
    public static int rec(int a) {
        if(a==0){
            return -3;
        }
        if (a==1) {
            return -4;
        }
        return (5*rec(a))-(6*rec(a-1));
    }
}