import java.util.*;
public class Linkedlist_getVSPeek {

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

   																						// peek at the first element
   System.out.println("First element of the list:" + list.peekFirst());
   System.out.println("last element of the list:" + list.peekLast());
   
   LinkedList list1 =new LinkedList();
   
   System.out.println("Peek method "+list1.peekFirst());
   System.out.println("Get method"+list1.getFirst());
   }
}