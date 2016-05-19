import java.util.Scanner;
/**
 * Write a description of class Movie here.
 * 
 * Vaed Prasad
 */
public class Movie
{
    public static void main (String [] args)
    {
        System.out.print("\f");
        int points1 = 20;
        int points2 = 20;
        int points3 = 20;
        int points4 = 20;

        int movieScore1 = 0;
        int movieScore2 = 0;
        int movieScore3 = 0;
        int movieScore4 = 0;

        System.out.println("User 1 please enter your name: ");
        Scanner userName1 = new Scanner(System.in);
        String user1 = userName1.nextLine();
        System.out.println(user1 +", please enter your movie choice: ");
        Scanner movieName1 = new Scanner(System.in);
        String movie1 = movieName1.nextLine();
        System.out.print("\f");

        System.out.println("User 2 please enter your name: ");
        Scanner userName2 = new Scanner(System.in);
        String user2 = userName2.nextLine();
        System.out.println(user2 +" please enter your movie choice: ");
        Scanner movieName2 = new Scanner(System.in);
        String movie2 = movieName2.nextLine();
        System.out.print("\f");

        System.out.println("User 3 please enter your name: ");
        Scanner userName3 = new Scanner(System.in);
        String user3 = userName3.nextLine();
        System.out.println(user3 +", please enter your movie choice: ");
        Scanner movieName3 = new Scanner(System.in);
        String movie3 = movieName3.nextLine();
        System.out.print("\f");

        System.out.println("User 4 please enter your name: ");
        Scanner userName4 = new Scanner(System.in);
        String user4 = userName4.nextLine();
        System.out.println(user4 +", please enter your movie choice: ");
        Scanner movieName4 = new Scanner(System.in);
        String movie4 = movieName4.nextLine();
        System.out.print("\f");

        System.out.println(user1 +", These are the other Movie Choices:");
        System.out.println("Choice 1: " + movie2);
        System.out.println("Choice 2: " + movie3);
        System.out.println("Choice 3: " + movie4);
        System.out.println("You have " + points1 + " points.  You must use ALL your points.  You will select how many points you would like to give to the two other movies.  The last movie will recieve your remaining points.");
        System.out.println("How many points would you like to give to " + movie2);
        Scanner movie12 = new Scanner(System.in);
        int Movie12 = movie12.nextInt();
        movieScore2 += Movie12;
        points1 -= Movie12;

        System.out.println(user1 +", You have " +points1+ " points.  How many points would you like to give to " + movie3);
        Scanner movie13 = new Scanner(System.in);
        int Movie13 = movie13.nextInt();
        movieScore3 += Movie13;
        points1 -= Movie13;
        movieScore4 += points1;
        System.out.print("\f");

        System.out.println(user2 +", These are the other Movie Choices:");
        System.out.println("Choice 1: " + movie1);
        System.out.println("Choice 2: " +movie3);
        System.out.println("Choice 3: " +movie4);
        System.out.println(user2 +", You have " + points2 + " points.  You must use ALL your points.  You will select how many points you would like to give to the two other movies.  The last movie will recieve your remaining points.");
        System.out.println("How many points would you like to give to " + movie1);
        Scanner movie21 = new Scanner(System.in);
        int Movie21 = movie21.nextInt();
        movieScore1 += Movie21;
        points2 -= Movie21;

        System.out.println("You have " +points2+ " points.  How many points would you like to give to " + movie3);
        Scanner movie23 = new Scanner(System.in);
        int Movie23 = movie23.nextInt();
        movieScore3 += Movie23;
        points2 -= Movie23;
        movieScore4 += points2;
        System.out.print("\f");

        System.out.println(user3 +", These are the other Movie Choices:");
        System.out.println("Choice 1: " + movie1);
        System.out.println("Choice 2: " + movie2);
        System.out.println("Choice 3: " + movie4);
        System.out.println("You have " + points3 + "points.  You must use ALL your points.  You will select how many points you would like to give to the two other movies.  The last movie will recieve your remaining points.");
        System.out.println("How many points would you like to give to " + movie1);
        Scanner movie31 = new Scanner(System.in);
        int Movie31 = movie31.nextInt();
        movieScore1 += Movie31;
        points2 -= Movie31;

        System.out.println(user3 +", You have " +points3+ " points.  How many points would you like to give to " + movie2);
        Scanner movie32 = new Scanner(System.in);
        int Movie32 = movie32.nextInt();
        movieScore2 += Movie32;
        points3 -= Movie32;
        movieScore4 += points3;
        System.out.print("\f");

        System.out.print(user4 +", These are the other Movie Choices:  ");
        System.out.println("Choice 1: " + movie1);
        System.out.println("Choice 2: " + movie2);
        System.out.println("Choice 3: " + movie3);
        System.out.println("You have " + points4 + " points.  You must use ALL your points.  You will select how many points you would like to give to the two other movies.  The last movie will recieve your remaining points.");
        System.out.println("How many points would you like to give to " + movie1);
        Scanner movie41 = new Scanner(System.in);
        int Movie41 = movie41.nextInt();
        movieScore1 += Movie41;
        points2 -= Movie41;

        System.out.println(user4 +", You have " +points4+ "points.  How many points would you like to give to " + movie2);
        Scanner movie42 = new Scanner(System.in);
        int Movie42 = movie42.nextInt();
        movieScore2 += Movie42;
        points4 -= Movie42;
        movieScore3 += points4;
        System.out.print("\f");
        System.out.print("Results Are In!");
        System.out.println(movie1 + " = " + movieScore1);
        System.out.println(movie2 + " = " + movieScore2);
        System.out.println(movie3 + " = " + movieScore3);
        System.out.println(movie4 + " = " + movieScore4);
    }
}
