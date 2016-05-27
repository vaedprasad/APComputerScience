import java.util.Scanner;
/**
 * 
 * The program Cooney (the .jar file) plays a game in which the player
 * tries to guess which words Cooney "likes" and which ones Cooney "doesn't like."
 * After five correct guesses in a row Cooney congratulates the player and the game stops.
 * Play the game and guess the rule; then write the Cooney program. 
 * 
 * Hint: write a console application or use StringTest.java as a basis for your pgrogram. 
 * 
 * 
 * @author Vaed Prasad
 */
public class Cooney
{
    public static void main(String[] args) {
        System.out.println("Try to figure out what Cooney likes:");
        System.out.println("Cooney likes MOON but he doesn't like SUN");
        System.out.println("Cooney likes SOCCER but he doesn't like HOCKEY");
        System.out.println("Cooney likes SUMMER but he doesn't like SPRING");
        System.out.println("\nDoes Cooney like ... (enter one word below)");

        int counter = 0;
        Scanner line = new Scanner(System.in);
        String input = "";
        boolean likesWord = false;
        while (counter < 5) {
            input = line.nextLine();
            for (int i = 0; i < input.length() - 1; i++) {
                if (input.charAt(i) == input.charAt(i + 1)) {
                    likesWord = true;
                }
            }
            if (likesWord) {
                System.out.println("Yes, Cooney likes " + input);
                counter++;
            }
            else {
                System.out.println("No, Cooney doesn't like " + input);
                counter = 0;
            }
            likesWord = false;
        }
        System.out.println("I think you got the rule... I quit!");
        System.out.println("Thaanks forr pplaying!");
    }
}

