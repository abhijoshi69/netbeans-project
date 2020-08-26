
package arraylistdemo;
import java.util.ArrayList;
import java.util.Iterator;


public class Arraylistdemo 
{

    
    public static void main(String[] args) 
    {
        ArrayList l1 = new ArrayList(4);
        l1.add("Abhishek");
        l1.add("Zainab");
        l1.add("Mahesh");
        l1.add("Melkiss");
        l1.add("Asha");
        l1.add("Sakshi");
        l1.set(2,"Joshi");
        Iterator it = l1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(l1.get(3));
        System.out.println(l1.indexOf("Zainab"));
        System.out.println(l1.lastIndexOf("Asha"));
        System.out.println(l1.remove(2));

     }
    
}
