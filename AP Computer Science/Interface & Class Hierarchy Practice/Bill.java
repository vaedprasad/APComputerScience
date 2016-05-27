
/**
 * Write a description of class Bill here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bill implements Money
{
    private double money;
    public Bill(int money) {
        this.money = money;
    }
    
    public double getAmount() {
        return money;
    }
    
    public String toString() {
        return "$" + money;
    }
}
