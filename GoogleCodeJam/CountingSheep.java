import java.io.*;
import java.util.*;

/**
PROBLEM: All Your Base
LANGUAGE: Java
CONTESTANT: Vaed Prasad
 */

public class CountingSheep
{
    private static boolean zeroUsed = false;
    private static boolean oneUsed = false;
    private static boolean twoUsed = false;
    private static boolean threeUsed = false;            
    private static boolean fourUsed = false;
    private static boolean fiveUsed = false;            
    private static boolean sixUsed = false;
    private static boolean sevenUsed = false;            
    private static boolean eightUsed = false;
    private static boolean nineUsed = false;
    private static boolean doesEnd = false;
    private static int finalNumber = -1;
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));

        int trials = Integer.parseInt(in.readLine());

        for (int caseNum = 1; caseNum <= trials; caseNum++)
        {
            String originalNumber = in.readLine();
            for(int i = 1; i < 100000; i++){
                int num = (Integer.parseInt(originalNumber))*i;
                String newNumber = num + "";
                solve(newNumber);
                if(zeroUsed && oneUsed && twoUsed && threeUsed && fourUsed && fiveUsed && sixUsed && sevenUsed && eightUsed && nineUsed){
                    finalNumber = num;
                    doesEnd = true;
                    break;
                }
            }
            if(doesEnd){
                out.println("Case #" + caseNum + ": " + finalNumber);
            }
            else {
                out.println("Case #" + caseNum + ": " + "INSOMNIA");
            }
            setAllFalse();
        }
        in.close();
        out.close();
        System.exit(0);
    }

    public static void solve(String s){
        int[] intArray = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            intArray[i] = Character.digit(s.charAt(i), 10);
        }

        for(int p : intArray) {
            switch(p) {
                case 0: zeroUsed = true;
                break;
                case 1: oneUsed = true;
                break;
                case 2: twoUsed = true;
                break;
                case 3: threeUsed = true;
                break;
                case 4: fourUsed = true;
                break;
                case 5: fiveUsed = true;
                break;
                case 6: sixUsed = true;
                break;
                case 7: sevenUsed = true;
                break;
                case 8: eightUsed = true;
                break;
                case 9: nineUsed = true;
                break;
            }
        }
    }

    public static void setAllFalse() {
        zeroUsed = false;
        oneUsed = false;
        twoUsed = false;
        threeUsed = false;            
        fourUsed = false;
        fiveUsed = false;            
        sixUsed = false;
        sevenUsed = false;            
        eightUsed = false;
        nineUsed = false;
        doesEnd = false;
        finalNumber = -1;
    }
}