import java.util.*;
/**
 * Write a description of class ACSLString here.
 * 
 * @author Vaed Prasad
 */
public class ACSLString
{   
    public static void main (String[] args) {
        System.out.println("\fEnter a number in this format (without spaces): float,int,int");
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        String sign = "";
        int firstPos = 0;

        if (in.substring(0,1).equals("+") || in.substring(0,1).equals("-")) {
            sign += in.substring(0,1);
            firstPos=1;
        }

        float expression = Float.parseFloat(in.substring(firstPos,in.indexOf(",")));
        in = in.substring(in.indexOf(",")+1);
        int length = Integer.parseInt(in.substring(0,in.indexOf(",")));
        in = in.substring(in.indexOf(",")+1);
        int decimal = Integer.parseInt(in);

        System.out.println(convertString(sign,expression,length,decimal));
    }

    public static String convertString(String sign, float expression, int length, int decimal) {
        int beforeDecimal = (int) (expression-(expression%1));
        int afterDecimal = (int) (Math.round((expression % 1) * Math.pow(10,decimal)));

        String returnValue = sign + beforeDecimal+"."+afterDecimal;
        if (returnValue.length() > length) {
            String temp = "";
            for(int i = 0; i < length-1; i++) {
                temp += "#";
            }
            int indexOfDec = length - decimal - 1;
            temp = temp.substring(0,indexOfDec)+"."+temp.substring(indexOfDec);
            returnValue = temp;
        }
        while (returnValue.length() < length) {
            returnValue = "#" + returnValue; 
        }
        return returnValue;
    }
}
