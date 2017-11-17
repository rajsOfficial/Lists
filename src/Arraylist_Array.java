import java.util.*;

public class Arraylist_Array {
	public static void main(String args[]){
		
	
	List<String> list = new ArrayList<String>();
	
	list.add("India");
	list.add("Switzerland");
	list.add("Italy");
	list.add("France");
	list.add(12,"raj");
	String [] countries = list.toArray(new String[list.size()]);
	 
	for(String n: countries){
		System.out.println(n);
	}
	
	List<Integer> listInt = new ArrayList<>();
	listInt.add(5);
	listInt.add(4);
	listInt.add(9);
	listInt.add(7);
	Integer[] raj = listInt.toArray(new Integer[listInt.size()]);
	
	for(Integer s: raj){
		
	}
	}

}
