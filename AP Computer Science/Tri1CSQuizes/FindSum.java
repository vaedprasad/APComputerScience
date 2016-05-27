import java.util.Scanner;
public class FindSum {
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer under 10: \n");
        int x = input.nextInt();
        int sum = x;
        for (int i = 1; i < x; i++)
        {
            System.out.print(i+" + ");
            sum +=i;
        }
        System.out.print(x + " = " + sum);
    }
}