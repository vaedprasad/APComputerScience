import java.util.Scanner;
import java.io.PrintWriter;
/**
 * Write a description of class LunchTime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LunchTime
{  
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("\f");
        System.out.println("Your lunch time is at 1:00pm");
        System.out.println("Enter a Time in (hh:mm) and I will inform you how long until you have lunch.");

        String s = input.nextLine();
        int i = s.indexOf(":");
        int hours = Integer.parseInt(s.substring(0, i));
        int mins = Integer.parseInt(s.substring(i+1)); 
        LunchTime lunch = new LunchTime();
        System.out.println("The time until your lunch is " +lunch.minutesUntilLunch(hours, mins) + " minutes");
    }

    public int minutesUntilLunch(int x, int y)
    {
        int hours = x;
        int mins = y;
        
        int minsLeft = 60 - mins;
        int hoursLeft = 12 - hours;
        int totalMinsLeft = (hoursLeft * 60) + minsLeft;
        
        return totalMinsLeft;
    }
}
