
/**
 * Write a description of class findMin here.
 * 
 * @author Vaed Prasad
 * 
 * 
 */
public class FindMin
{
    /*
     * 
     * Returns the smallest among the first n elements of list
     * Precondition: 1 <= n <= list.length
     * public int findMin(int[] list, int n)
     * DO NOT USE ANY LOOPS
    *
    public static int findMin(int[] list, int n) {
        int min;
        if (n == list.length - 1) {
            return list[n];
        }
        min = findMin(list, n + 1);
        if (min < list[n]) {
            return  min;
        }
        else {
            return list[n];
        }
    } */
    
    
        public static int findMin(int[] list, int n) {
        if (n == 1) 
            return list[0];
        else 
            return Math.min(list[n-1], findMin(list,n-1));
    } 
}
