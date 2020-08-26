package linkedlistdemo;
import java.util.*;
public class Linkedlistdemo 
{

   
    public static void main(String[] args) 
    {
        LinkedList list = new LinkedList();
        list.addFirst("Abhishek");
        list.addLast("Joshi");
        list.add("MySirG");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
    
}
