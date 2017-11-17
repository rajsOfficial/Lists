import java.io.*;
import java.util.*;
 
class list_remove
{
    public static void main(String[] args)
                       throws IOException
    {
    																// size of ArrayList
        int n = 5;
 
        															//declaring ArrayList with initial size n
        ArrayList<Integer> arrli = new ArrayList<Integer>(n);
 
        															// Appending the new element at the end of the list
        for (int i=1; i<=n; i++)
            arrli.add(i);
        		
        															// Printing elements
        System.out.println(arrli);
 
        															// Remove element at index 3
        int x=arrli.remove(3);
 
        															// Displaying ArrayList after deletion
        System.out.println(arrli);
        System.out.println("Removed value is  "+x+ " using index");	//Showing removed value
        
        
        boolean a = arrli.remove(Integer.valueOf(2));				// Can't give 2 as it will be taken as index
        	System.out.println("Element 2 removed using remove method with object arg :"+a);			
        	
        	for (int i : arrli)										// Printing elements one by one

            System.out.print(i);
    }
}