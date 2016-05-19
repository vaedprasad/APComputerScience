
/**
 * Write a description of class BookTest here.
 * 
 * @author Vaed Prasad
 * @version 09/17/2015
 */
public class BookTest
{
    // instance variables - replace the example below with your own
    private int x;


    public static void main (String [] args)
    {
        int x = 3;
        Book book1 = new Book(x);
        for (int i=0; i<x; i++)
        {
            System.out.println("You are on Page: " + book1.currentPage());
            book1.nextPage();
        }
        
    }
}
