/**
 * 
 * @author Vaed Prasad
 * 
 * In SCRABBLE, different letters are assigned different numbers of points:
 * 
 * A - 1    E - 1   I - 1   M - 3   Q - 10   U - 1   X - 8
 * B - 2    F - 4   J - 8   N - 1   R - 1    V - 4   Y - 4   
 * C - 3    G - 2   K - 5   O - 1   S - 1    W - 4   z - 10
 * D- 4     H - 4   L - 1   P - 3   T - 1
 * 
 * Write a method computeScore(String word) that returns the score for a word without using any if or switch statements. 
 * 
 * ***Hint***:
 * ***find the position of a given letter in the alphabet string by calling indexOf; get the score for that letter from the array of point values, and add to the total. 
 * 
 */
public class Scrabble {
    public static int computeScore(String word) {
        word = word.toUpperCase();
        int[] scores = {1,2,3,4,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
        int sum = 0;
        int temp = 0;
        for (int i = 0; i<word.length(); i++) {
            temp = scores[(int) (word.charAt(i) - 'A')];
            sum += temp;
        }
        return sum;
    }
}
