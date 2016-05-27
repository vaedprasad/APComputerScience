/**
 * 
 * Name: Vaed Prasad
 * Date: 9/10/15
 * 
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        
        Card kingSpades1 = new Card("king", "spades", 13);
        Card kingSpades2 = new Card("king", "spades", 13);
        Card threeDiamonds = new Card("3", "diamonds", 3);
        
        
        System.out.println("~~~~~~~~~~~~~~~~ Card 1: King of Spades~~~~~~~~~~~~~~~~");
        System.out.println("rank: " + kingSpades1.rank());
        System.out.println("suit: " + kingSpades1.suit());
        System.out.println("pointValue: " + kingSpades1.pointValue());
        System.out.println("toString: " + kingSpades1.toString());
        System.out.println("");
        
        System.out.println("~~~~~~~~~~~~~~~~ Card 2: King of Spades~~~~~~~~~~~~~~~~");
        System.out.println("rank: " + kingSpades2.rank());
        System.out.println("suit: " + kingSpades2.suit());
        System.out.println("pointValue: " + kingSpades2.pointValue());
        System.out.println("toString: " + kingSpades2.toString());
        System.out.println("");
        
        System.out.println("~~~~~~~~~~~~~~~~ Card 3: Three of Diamonds~~~~~~~~~~~~~~~~");
        System.out.println("rank: " + threeDiamonds.rank());
        System.out.println("suit: " + threeDiamonds.suit());
        System.out.println("pointValue: " + threeDiamonds.pointValue());
        System.out.println("toString: " + threeDiamonds.toString());
        System.out.println("");
        
        System.out.println("~~~~~~~~~~~~~~~~ Matching Tests~~~~~~~~~~~~~~~~");
        System.out.println("Card 1 matches Card 2: " + kingSpades1.matches(kingSpades1, kingSpades2));
        System.out.println("Card 1 matches Card 3: " + kingSpades1.matches(kingSpades1, threeDiamonds));
        System.out.println("Card 2 matches Card 3: " + kingSpades2.matches(kingSpades2, threeDiamonds));
       
        System.out.println("");
    }
}
