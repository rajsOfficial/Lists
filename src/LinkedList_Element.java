import java.util.*;

public class LinkedList_Element
{

   public static void main(String[] args) {

	   															// create a LinkedList
   LinkedList list = new LinkedList();

   																// add some elements
   list.add("Hello");
   list.add(2);
   list.add("Chocolate");
   list.add("10");
   boolean r = list.isEmpty();
   System.out.println("List is empty :"+r);
   																				// print the list
   System.out.println("LinkedList:" + list);
  

   																	// print the head of the list
   System.out.println("Head of list:" + list.element());
   }
}