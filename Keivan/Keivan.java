
/**
 * Write a description of class Keivan here.
 * 
 * Each time Keivan re-reads his Java book 
 * (which happens every month), he learns 10%
 * of whatever material he did not know before.
 * He needs to score at least 95% on the comprehensive
 * exam to become a certified Java developer. 
 * When Keivan started, he knew nothing about Java. 
 * 
 * Write a method that simulates Keivan's learning
 * progress and returns the number of months it will
 * take him to get ready for the exam. Write a main
 * method that displays the result (in years and months).
 * 
 * 
 * 
 * @author Vaed Prasad
 */
public class Keivan
{
    private static final double completionRate = .95;
    private static final double learningRate = .1;
    private  static double amountKnown = 0;
    private  static double amountNotKnown = 1;
    private  static int months = 0;
    public static void main()
    {
        System.out.print("\f");

        knowledgeTester();
        if(months < 12)
        {
            System.out.println("Keivan will be ready for his Java Exam in 0 years and " + months + " months.");
        }
        else 
        {
            System.out.println("Keivan will be ready for his Java Exam in " + months/12 + " years and " + months % 12 + " months.");
        }
    }

    public static void knowledgeTester()
    {
        while (amountKnown < .95)
        {
            amountKnown = amountKnown + .1*amountNotKnown;
            amountNotKnown = 1 - amountKnown;
            months++;
        }
    }
}
