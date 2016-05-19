import java.io.*;
import java.util.*;

/**
PROBLEM: Revenge Of The Pancakes
LANGUAGE: Java
CONTESTANT: Vaed Prasad
 */

public class RevengeOfThePancakes
{
    private static int count = 0;
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));

        int trials = Integer.parseInt(in.readLine());

        for (int caseNum = 1; caseNum <= trials; caseNum++)
        {
            String stack = in.readLine();
            boolean[] array = new boolean[stack.length()];
            for (int i = 0; i < stack.length(); i++) {
                boolean temp;
                if(stack.charAt(i)=='+') 
                    temp = true;
                else
                    temp = false;
                array[i] = temp;
            }
            while(!areAllTrue(array)) {
                int indexOfLastMinus = 0;
                for(int i = array.length-1; i > 0; i--) {
                    if (!array[i]) {
                        indexOfLastMinus = i;
                        break;
                    }
                }
                boolean[] tempArray = new boolean[indexOfLastMinus];
                for(int i = 0; i<tempArray.length; i++) {
                    tempArray[i] = array[i];
                }
                if(areAllTrue(tempArray))
                flip(array, indexOfLastMinus-1);
                else
    
                flip(array, indexOfLastMinus);
            }
            out.println("Case #" + caseNum + ": " + count);
            count = 0;
        }
        in.close();
        out.close();
        System.exit(0);
    }

    public static void flip(boolean[] array, int j) {
        boolean[] flipArray = new boolean[j+1];
        for(int i = 0; i < j+1; i++) {
            flipArray[i] = !(array[j-i]);
        }
        for(int i = 0; i < j+1; i++) {
            array[i] = flipArray[i];
        }
        count++;
    }

    public static boolean areAllTrue(boolean[] array)
    {
        for(boolean b : array) {
            if(!b) 
                return false;
        }
        return true;
    }
}