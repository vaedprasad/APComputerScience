import java.util.Scanner;
/**
 * 
 * Vaed Prasad Grade #11
 * 2015-2016 American Computer Science League
 * Contest #1 “ACSL CHMOD” DATE 1/6/16
 * 
 */
public class CHMOD {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("\fCHMOD");
        int counter =0;
        while (counter <5)
        {
            System.out.println("Enter a number in this format (without spaces): #,#,#,#");
            String in = input.next();
            in = in.replaceAll("\\W", "");
            String perm = in.substring(0,1);

            int a = in.charAt(0);
            int b = in.charAt(1);
            int c = in.charAt(2);
            int d = in.charAt(3);

            String binaryA = convertToBinary(a).substring(3);
            String binaryB = convertToBinary(b).substring(3);
            String binaryC = convertToBinary(c).substring(3);
            String binaryD = convertToBinary(d).substring(3);
            
            String stringB = convertToString(binaryB);
            String stringC = convertToString(binaryC);
            String stringD = convertToString(binaryD);

            if(perm.equals("1")) {
                stringB = stringB.replaceAll("x", "s");
            }
            else if(perm.equals("2"))
            {
                stringC = stringC.replaceAll("x", "s");
            }
            else if(perm.equals("4"))
            {
                stringD = stringD.replaceAll("x", "t");
            }
            System.out.print(binaryB + " " + binaryC + " " + binaryD+ " and ");
            System.out.print(stringB + " " + stringC + " " + stringD);
            System.out.println();
            counter++;
        }
    }
    
    public static String convertToBinary(int x) {
        String binary = Integer.toBinaryString(x);
        return binary;
    }
    
    public static String convertToString(String binary) {
        String b = binary.substring(0,1);
        String c = binary.substring(1,2);
        String d = binary.substring(2,3);
        String perm = "";
        if (b.equals("1")) {
            perm += "r";
        }
        else {
            perm += "-";
        }
        if (c.equals("1")) {
            perm += "w";
        }
        else {
            perm += "-";
        }
        if (d.equals("1")) {
            perm += "x";
        }
        else {
            perm += "-";
        }
        return perm;
    }
}
