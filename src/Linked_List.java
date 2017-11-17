import java.util.* ;
class Linked_List

{
 public static void main(String[] args)
 {
  LinkedList< String> ll = new LinkedList< String>();
  ll.add("a");
  ll.add("b");
  ll.add("c");
  ll.addLast("z");
  ll.addFirst("A");
  ll.add(123,"p");															// Throws exception
  
  for(String temp : ll){
	  System.out.println(temp);
  }
  
 }
}