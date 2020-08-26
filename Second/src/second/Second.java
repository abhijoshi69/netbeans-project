
package second;
import java.util.Scanner;
public class Second 
{
    int r,h;
   float volume;
    Scanner obj = new Scanner(System.in);
    public void accept()
    {
        System.out.println("enter radius of the cylinder");
        r=obj.nextInt();
        System.out.println("enter height of the cylinder");
        h=obj.nextInt();
    }
    public void display()
    {
        volume = (22 * r * r *h)/7;
        System.out.println("Volume of the cylinder is:"+volume);
    }

   
    public static void main(String[] args)
    {
     Second in = new Second();
     in.accept();
     in.display();
    }
    
}
