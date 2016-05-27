
/**
 * Write a description of class RecursiveSeries here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecursiveSeries
{
    public static void main (String[] args) {
        int sum = 0;
        System.out.print("\fThe sum of : ");
        for(int i = 10; i <= 1000; i+=10) {
            sum+=i*i;
            System.out.print(i+"^2 +");
        }
        System.out.println("is: ");
        System.out.println(sum);
    }
}
