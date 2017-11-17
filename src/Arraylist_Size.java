import java.util.*;

public class Arraylist_Size {
   public static void main(String args[]) {

	   															// create an empty array list with an initial capacity
   ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
	
   arrlist.ensureCapacity(34);															// use add() method to add elements in the list
   arrlist.add(35);
   arrlist.add(20);
   arrlist.add(25);
   int n=arrlist.size();
	System.out.println("Size before trim is  "+n);
   																// Trim the arraylist
   arrlist.trimToSize();

   																// let us print all the elements available in list
   for (Integer number : arrlist) {
   System.out.println("Number = " + number);
   }
   }
} 