import java.util.*;
/**
 * Write a description of class AGRAM here.
 * 
 * @author Vaed Prasad 
 * @version 12/13/2016
 */
public class AGRAM
{
    public static void main (String[] args) {
        System.out.print("\f");
        for(int i = 0; i < 5; i++){
            System.out.println("Enter line " + (i+1) + " ");
            Scanner input = new Scanner(System.in);
            String in = input.nextLine();
            System.out.println(playCard(in));
        }
    }

    public static String playCard(String s) {
        String str = s.replaceAll("\\s+","").replaceAll("A","1").replaceAll("T","10").replaceAll("J","11").replaceAll("Q","12").replaceAll("K","13").replaceAll("C","4").replaceAll("D","3").replaceAll("H","2").replaceAll("S","1");
        String[] full = str.split(",");        
        int[] values = new int[full.length];
        int[] suits = new int[full.length];

        for(int i = 0; i < full.length; i++) {
            values[i] = Integer.parseInt(full[i].substring(0,full[i].length()-1));
            suits[i] = Integer.parseInt(full[i].substring(full[i].length()-1));
        }

        int oppSuit = suits[0]; //clubs:4, diamonds:3, hearts:2, spades:1
        int oppValue = values[0];//values 1 to 13
        int lowValue = 14;
        boolean first = false;
        for(int i = 1; i < full.length; i++) {
            if(suits[i] == oppSuit && values[i] > oppValue && values[i] < lowValue) {
                lowValue = values[i];
                first = true;
            }
        }
        if(first){
            String suit = (oppSuit+"").replaceAll("4","C").replaceAll("3","D").replaceAll("2","H").replaceAll("1","S");
            String value = "";
            if(lowValue==1) {
                value += "A";
            }
            else {
                value += (lowValue+"").replaceAll("10","T").replaceAll("11","J").replaceAll("12","Q").replaceAll("13","K");
            }
            String rv = value + suit;
            return rv;
        }
        lowValue = 14;
        boolean second = false;
        for(int i = 1; i < full.length; i++) {
            if(suits[i] == oppSuit && values[i] < lowValue) {
                lowValue = values[i];
                second = true;
            }
        }
        if(second){
            String suit = (oppSuit+"").replaceAll("4","C").replaceAll("3","D").replaceAll("2","H").replaceAll("1","S");
            String value = "";
            if(lowValue==1) {
                value += "A";
            }
            else {
                value += (lowValue+"").replaceAll("10","T").replaceAll("11","J").replaceAll("12","Q").replaceAll("13","K");
            }
            String rv = value + suit;
            return rv;
        }
        lowValue = 14;
        int highSuit = 0;
        for(int i = 1; i < full.length; i++) {
            if(suits[i] > highSuit && values[i] < lowValue) {
                lowValue = values[i];
                highSuit = suits[i];
            }
        }
        String suit = (highSuit+"").replaceAll("4","C").replaceAll("3","D").replaceAll("2","H").replaceAll("1","S");
        String value = "";
        if(lowValue==1) {
            value += "A";
        }
        else {
            value += (lowValue+"").replaceAll("10","T").replaceAll("11","J").replaceAll("12","Q").replaceAll("13","K");
        }
        String rv = value + suit;
        return rv;
    }
}