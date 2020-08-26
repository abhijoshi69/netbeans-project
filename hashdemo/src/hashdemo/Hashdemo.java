package hashdemo;

import java.util.HashSet;
import java.util.Iterator;

public class Hashdemo 
{

   
    public static void main(String[] args) 
    {
        HashSet hs = new HashSet();
        hs.add("Krutik");
        hs.add("Abhishek");
        hs.add("Sakshi");
        hs.add("Aparna");
        hs.add("Rohit");
        Iterator it = hs.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("The size of hahset is "+hs.size());
        System.out.println("After removing");
        hs.remove("Abhishek");
        Iterator it1 = hs.iterator();
        while(it1.hasNext())
        {
            
            System.out.println(it1.next());
        }
        System.out.println("The size of hashset is "+hs.size());
        
    }
    
}
