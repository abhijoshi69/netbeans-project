package vectordemob;
import java.util.ListIterator;
import java.util.Vector;


public class Vectordemob 
{

    
    public static void main(String[] args) 
    {
        Vector obj = new Vector();
        Double obj1 = new Double(77.5);
        Double obj2 = new Double(68.2);
        Double obj3 = new Double(52.8);
        Double obj4 = new Double(40.2);
        System.out.println("Size of vector is:"+obj.size());
        obj.add(obj1);
        obj.add(obj2);
        obj.add(obj3);
        obj.add(obj4);
        System.out.println("\n Vector After adding the objects:"+obj);
        System.out.println("Size of vector after adding the object"+obj.size());
        obj.remove(obj1);
        obj.remove(obj2);
        System.out.println("\n Vector After removing the onject "+obj);
        System.out.println("Size of vector after removing the object"+obj.size());
        System.out.println("\n The final vector:");
        ListIterator i = obj.listIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        
    }
    
}
