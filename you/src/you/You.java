
package you;
import java.util.Scanner;
public class You
{
    int i;
    String name,address,surname;
    Scanner obj = new Scanner(System.in);
    public void show(int a)
    {
        System.out.println("Your ID is:"+a);
        a++;
    }
    public void show()
    {
        for(i=1;i<100;i++)
        {
            System.out.println("Enter your name");
            name = obj.next();
            System.out.println("Enter your surname");
            surname = obj.next();
            System.out.println("Enter your address");
            address = obj.next();
        }
    }
    

    
    
    public static void main(String[] args) 
    {
       You in = new You();
       in.show(90);
       in.show();
    }
    
}
