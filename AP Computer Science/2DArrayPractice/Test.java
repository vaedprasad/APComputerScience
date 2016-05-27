import java.util.*;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        System.out.print("\f");
        int[][] array = {{1,2,3,4,5},{10,20,30,40,50},{11,12,13,14,15}};
        int sum = 0;
        for(int[] row: array) {
            for(int s: row) {
                sum += s;
                System.out.println(s);
            }
        }
        System.out.println(sum);
    }

    public static boolean insert(double[ ] arr, int count, double value)
    {
        if (count >= arr.length) 
            return false;

        int k = count - 1;
        while ( k >= 0  && arr [ k ] > value )
        {
            arr [ k + 1 ] = arr [ k ];
            k--;
        }
        arr [ k + 1] = value;

        return true;
    }

}
