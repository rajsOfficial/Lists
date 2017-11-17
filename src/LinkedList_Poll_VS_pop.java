import java.util.*;

public class LinkedList_Poll_VS_pop {

	public static void main(String[] args) {

																				// create a LinkedList
		   LinkedList list = new LinkedList();
		   																		// print the list
		   System.out.println("LinkedList:" + list);
		   
		   																		// retrieve and remove the head of the list
		   System.out.println("Head element of the list using poll:" + list.poll());

		   																		// print the list
		   System.out.println("Head of the element using pop:" + list.pop());
		   }
}
