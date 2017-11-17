import java.util.*;
public class Arraylist_Indexof_contains {
   public static void main(String[] args) {
      
	   															// create an empty array list with an initial capacity
   ArrayList<String> arrlist = new ArrayList<String>(5);

   																// use add() method to add values in the list
   arrlist.add("G");
   arrlist.add("E");
   arrlist.add("F");
   arrlist.add("M");
   arrlist.add("E");
	
   System.out.println("Size of list: " + arrlist.size());
   boolean f = arrlist.contains("F");
   System.out.println("Arraylsit contains F in it :"+f);

   																// let us print all the values available in list
   int retval1=arrlist.indexOf("E");
   System.out.println("The first occurrence of E is at index = " + retval1);
 
   
   																// Retrieving the index of last occurrence of element "E"
   int retval2=arrlist.lastIndexOf("E");
   System.out.println("The last occurrence of E is at index " + retval2);
   }
} 