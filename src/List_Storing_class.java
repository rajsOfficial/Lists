import java.util.*;
class Contact
{
    String first_name;
    String last_name;
    String phone_no;

    public Contact(String fn,String ln,String pn) 
    {
    first_name = fn;
    last_name = ln;
    phone_no = pn;
    }
    
    public String toString()
    {
        return first_name+" "+last_name+"("+phone_no+")";
    }
    
}
public class List_Storing_class
{
    
   public static void main(String[] args) 
   {
       Contact c1 = new Contact("Ricky", "Pointing","999100091");
       Contact c2 = new Contact("David", "Beckham","998392819");
       Contact c3 = new Contact("Virat", "Kohli","998131319");
       
    ArrayList< Contact> al = new ArrayList< Contact>();	
     al.add(c1);
     al.add(c2);
     al.add(c3);
     System.out.println(al);
   }
    
}