import java.util.Scanner;
/**
 * Write a description of class MakeChange here.
 * 
 * Write and test a method that takes 
 * an amount in cents and prints out 
 * all possible representations of that
 * amount as a sum of several quarters, 
 * dimes, nickels, and pennies. For example: 
 * 30 cents = 0 quarters + 2 dimes + 1 nickels + 5 pennies
 * (There are 18 different representations for 30 cents and 242 for $1.00)
 * 
 * 
 * 
 * 
 * @author Vaed Prasad
 * @version 11/5/2015
 */
public class ACTscores
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\fInput your ideal composite to determine all possible combinations:");
        double x = input.nextDouble();
        double sum = 0;
        System.out.println("You need scores of:");
        for (double math = 1; math <= 36; math++)
        {
            for (double reading = 1; reading <= 36; reading++)
            {
                for (double english = 1; english <=36; english++)
                {
                    for (double science = 1; science <=36; science++)
                    {
                        sum = (science+english+reading+math)/4;
                        if (sum == x+.25 || sum == x || sum==x-.25 || sum==x-.5)
                        {
                            System.out.println("Math: "+(int)math + " Reading: " + (int)reading + " English: " + (int)english + " Science: " + (int)science);
                        }
                    }
                }
            }
        }
    }

    /**public static void givenScore ()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\fInput your ideal composite to determine all possible combinations:");
        double x = input.nextDouble();

        Scanner mathScan = new Scanner(System.in);
        System.out.println("\fInput your ideal score for the Math Sub-Section (Don't know = 0):");
        double mathStatic = mathScan.nextDouble();

        Scanner scienceScan = new Scanner(System.in);
        System.out.println("\fInput your ideal score for the Science Sub-Section (Don't know = 0):");
        double scienceStatic = scienceScan.nextDouble();

        Scanner readingScan = new Scanner(System.in);
        System.out.println("\fInput your ideal score for the Reading Sub-Section (Don't know = 0):");
        double readingStatic = readingScan.nextDouble();

        Scanner englishScan = new Scanner(System.in);
        System.out.println("\fInput your ideal score for the English Sub-Section (Don't know = 0):");
        double englishStatic = englishScan.nextDouble();
        
        ArrayList<Integer> toCheck = new ArrayList<Integer>();
        if (mathStatic != 0) toCheck.add(mathStatic);
        if (scienceStatic != 0) toCheck.add(scienceStatic);
        if (readingStatic != 0) toCheck.add(readingStatic);
        if (englishStatic != 0) toCheck.add(englishStatic);
        
        
        
        
        double sum = 0;

        double m = 0;
        double s = 0;
        double e = 0;
        double r = 0;

        if(mathStatic==0) 
            m = 1;
        else
            m = mathStatic;
       
        if(scienceStatic==0) 
            s = 1;        
        else 
            s = scienceStatic;
        
        if(readingStatic==0) 
            r = 1;        
        else 
            r = readingStatic;
        
        if(englishStatic==0) 
            e = 1;        
        else 
            e = englishStatic;
        
        System.out.println("You need scores of:");

        for (double math = m; math <= 36; math++)
        {
            for (double reading = 1; reading <= 36; reading++)
            {
                for (double english = 1; english <=36; english++)
                {
                    for (double science = 1; science <=36; science++)
                    {
                        sum = (science+english+reading+math)/4;
                        if (sum == x+.25 || sum == x || sum==x-.25 || sum==x-.5)
                        {
                            System.out.println("Math: "+(int)math + " Reading: " + (int)reading + " English: " + (int)english + " Science: " + (int)science);
                        }
                    }
                }
            }
        }
    }
    */
}