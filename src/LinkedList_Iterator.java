
import java.util.*;

 
public class LinkedList_Iterator {
 
    public static void main(String a[]){
        LinkedList<String> arrl = new LinkedList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        ListIterator<String> itr = arrl.listIterator();
        while(itr.hasNext()){
        	System.out.println(itr.nextIndex());
            System.out.println(itr.next());
            
        }
    }
}