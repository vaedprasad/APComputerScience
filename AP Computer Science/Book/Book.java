
/**
 * Write a description of class Book here.
 * 
 * @author Vaed Prasad
 * @version 09/17/2015
 */
public class Book
{
    private int numPages;
    private int currentPage;
    
    public Book(int x)
    {
        numPages = x;
        currentPage = 1;
    }
    
    public int numPages()
    {
        return numPages;
    }
    
    public int currentPage()
    {
        return currentPage;
    }
    
    public int nextPage()
    {
       if (currentPage< numPages)
       {
           currentPage++;
        }
        return currentPage;
    }
}
