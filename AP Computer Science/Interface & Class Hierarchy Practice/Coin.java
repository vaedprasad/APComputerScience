import java.util.*;
/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Coin implements Money
{
    public Coin() {
    }

    public static void main(String[] args) {
        ArrayList<Money> piggyBank = new ArrayList<Money>();
        piggyBank.add(new Quarter());
        piggyBank.add(new Bill(1));
        piggyBank.add(new Nickel());
        piggyBank.add(new Dime());
        piggyBank.add(new Quarter());
        piggyBank.add(new Bill(5));
        System.out.println(piggyBank);
        double amount = 0;
        for (Money item : piggyBank)
            amount += item.getAmount();
        System.out.printf("The piggy bank holds $%.2f\n", amount);
    }
}
