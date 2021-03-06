
import java.util.*;

public class Arraylist_Method2
{
   public static void main(String[] args) {
     
	   															// create an empty array list with an initial capacity
   ArrayList arrlist = new ArrayList<>(5);

   																// use add() method to add elements in the list
   arrlist.add(20);
   arrlist.add(30);
   arrlist.add(10);
   arrlist.add(50);

   																// let us print all the elements available in list
   for (Object number : arrlist) {
   System.out.println("Number = " + number);
   }      

   																// finding size of this list
   int retval = arrlist.size();
   System.out.println("List consists of "+ retval +" elements");
      
   System.out.println("Performing clear operation !!");
   arrlist.clear();
   retval = arrlist.size();
   System.out.println("Now, list consists of "+ retval +" elements");
   }
}   