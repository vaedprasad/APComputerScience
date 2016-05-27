import java.util.*;
/**
 * Write a description of class LineList here.
 * 
 * @author Vaed Prasad
 */
public class LineList
{
    private ArrayList<String> list;
    public LineList() {
        list = new ArrayList<String>();
    }

    public int size() {
        return list.size();
    }

    public String get(int k) {
        return list.get(k);
    }

    public void add(String line) {
         list.add(line);
    }

    public void remove(int k) {
         list.remove(k);
    }

    public void move(int index, int newIndex){
        String old = list.get(index);
        list.remove(index);
        list.add(newIndex, old);
    }
    
    public void swap(int index1, int index2) {
        String old = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, old);
    }
        

    public void shuffle() {
        for (int n = size(); n >= 2; n--) {
            int randIndex = (int)(Math.random() * (n-1));
            swap(randIndex, n-1);
        }
    }
    
    public static void main(String[] args) {
        
    }
}
