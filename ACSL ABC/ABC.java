import java.util.*;
/**
 * Write a description of class ABC here.
 * 
 * @author Vaed Prasad
 * 
 * 
 */
public class ABC
{
    public static void main (String[] args ){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i<6; i++){
            System.out.println("Enter Problem " + (i+1) + " (comma separated): ");
            String in = input.nextLine();
            System.out.println(calculate(in));
        }
    }

    public static String calculate(String in){
        char [][] abc = new char [4][4];
        String[] arr = in.split(("\\s*,\\s*"));
        int totalLetters = Integer.parseInt(arr[4]);;
        for(int i = 0; i < 4; i++){
            int pos = Integer.parseInt(arr[i]);
            int row = ((pos-1)/6)-1;
            int col = ((pos-1)%6)-1;
            abc[row][col] = 'X';
        }

        for (int i = 5; i < arr.length; i+=2) {
            char letter = arr[i].charAt(0);
            int pos = Integer.parseInt(arr[i+1]);
            int row = ((pos-1)/6);
            int col = ((pos-1)%6);
            if (row==0) {
                if(abc[0][col-1]=='X')
                    abc[1][col-1]=letter;
                else
                    abc[0][col-1]=letter;
            }
            else if (row ==5) {
                if(abc[3][col-1]=='X')
                    abc[2][col-1]=letter;
                else
                    abc[3][col-1]=letter;
            }
            
            if (col == 0) {
                if(abc[row-1][0]=='X')
                    abc[row-1][1]=letter;
                else
                    abc[row-1][0]=letter;
            }
            else if (col == 5) {
                if(abc[row-1][3]=='X')
                    abc[row-1][2]=letter;
                else
                    abc[row-1][3]=letter;
            }
        }
        return Arrays.deepToString(abc);
    }
}
