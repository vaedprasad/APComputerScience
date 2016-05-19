import java.util.*;
/**
 * Write a description of class ArrayList here.
 * 
 * @author Vaed Prasad
 */
public class ArrayListPractice
{

    /**
     *     Write and test a method that takes an ArrayList<String> and returns a 
     *     new ArrayList<String> in which the elements are stored in reverse order.
     *     The original list should remain unchanged. (Use ArrayList's methods but 
     *     no other library methods.)
     */
    public static ArrayList<String> reverse (ArrayList<String> arr) {
        for (int i = 0; i <arr.size()/2; i++){
            String temp = arr.get(i);
            arr.set(i,arr.get(arr.size()-1));
            arr.set(arr.size()-i,temp);
        }
        return arr;
    }

    public static void removeMin (ArrayList<Integer> arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <arr.size(); i++){
            if(arr.get(i)<min){
                min = arr.get(i);
            }
        }
        arr.remove(min);
    }
    
    public void removeConsecutiveDuplicates(ArrayList<String> lst) {
        for (int i = lst.size() -1; i>= 1; i--)
        if (lst.get(i).equals(lst.get(i-1)))
        lst.remove(i);
      
    }
    
    public ArrayList<ArrayList<String>> distributeToBuckets(List<String> words) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        ArrayList<ArrayList<String>> buckets = new ArrayList<ArrayList<String>>();
        for(int i = 0; i < 26; i ++)
        buckets.add(new ArrayList<String>());
        for (String word : words)
        {
            char firstLetter = Character.toLowerCase(word.charAt(0));
            int i = abc.indexOf(firstLetter);
            buckets.get(i).add(word);
            
        }
        return buckets;
    }
}
