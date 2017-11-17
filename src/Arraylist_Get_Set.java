import java.util.*;
public class Arraylist_Get_Set{
	   public static void main(String[] args) {
	      
	   // create an empty array list with an initial capacity
	   ArrayList<Float> arrlist = new ArrayList<>(5);

	   // use add() method to add elements in the list
	   arrlist.add(15.2f);
	   arrlist.add(22.3f);
	   arrlist.add(30.6f);
	   arrlist.add(40.9f);

	   																			// let us print all the elements available in list
	   for (Float number : arrlist) {
	   System.out.println("Number = " + number);
	   } 
		
	   																			// retrieves element at 4th postion
	   float retval=arrlist.get(3);
	   System.out.println("Retrieved element is = " + retval);	   
	   
	  
	   float a =arrlist.set(3, 346.3f);
	   System.out.println("Retrieved element is replaced with  "+a);
	
	   for (Float number : arrlist) {
		   System.out.println("Number = " + number);
		   } 
			
	   }
	}   