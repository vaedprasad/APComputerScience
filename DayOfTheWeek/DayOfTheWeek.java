import java.util.Scanner;
import java.io.PrintWriter;
/**
 * An integer constant dayOfWeek1 has a value from 0 to 6 and represents the day
 * of the week for January 1st (0=Sunday, 1-Monday, etc.). A variable day has a 
 * value from 1 to 31 and represents a day in January. Write an expression that 
 * calculates the day of the week for any given value of day. For example, if 
 * dayOfWeek1 = 0 (January 1st is a Sunday) and day = 13 (January 13th), then 
 * dayOfWeek, the day of the week for January 13th, should get a value of 5 
 * (Friday).
 * 
 * @author Vaed Prasad
 * @version 09/22/2015
 */
public class DayOfTheWeek
{
    Scanner input = new Scanner (System.in);
    public DayOfTheWeek()
    {
        System.out.print("\f");
        System.out.println("Input an integer from 0 to 7 representing the day for January 1st (Sunday=0, Monday=1, Tuesday=2, etc: ");
        int x = input.nextInt();
        System.out.println("Input an integer from 1 to 31 representing a date in January: ");
        int y = input.nextInt();
        int dow = calculateDay(x, y);
        System.out.println("On day " + y + " of January the day of the week is " + dow + ".");
    }
    
    public int calculateDay(int x, int y)
    {
        int dayOfWeek1 = x;
        int day = y;
        int smallDay = 0;
        if (day>=7 && day<=13)
        {
             smallDay = day - 7;
        }
        else if (day > 13 && day <=20)
        {
            smallDay = day - 14;
        }
        else if (day > 21 && day <=27)
        {
            smallDay = day - 21;
        }
        else if (day >= 28)
        {
           smallDay = day - 28;
        }
        else
        {
            smallDay = day;
        }
        
        int dayOfWeek = dayOfWeek1 + smallDay;
        if (dayOfWeek >= 7)
        {
            dayOfWeek= dayOfWeek-7;
        }
        
        
        
        
        return dayOfWeek -1;
    }
}
