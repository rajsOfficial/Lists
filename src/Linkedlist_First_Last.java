
import java.util.*;

public class Linkedlist_First_Last{

   public static void main(String[] args) {

	   																		// create a LinkedList
   LinkedList list = new LinkedList();

   																			// add some elements
   list.add("Hello");
   list.add(2);
   list.add("Chocolate");
   list.add("10");

   																			// print the list
   System.out.println("LinkedList:" + list);

   																			// add a new element at the end of the list
   list.addLast("Element");
   list.addFirst(668);

   																			// print the new list
   System.out.println("LinkedList:" + list);
   }
}