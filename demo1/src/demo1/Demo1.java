package demo1;
import java.util.Scanner;
public class Demo1 
{
    float volume,r,h;
    Scanner obj = new Scanner(System.in);
    public void accept()
    {
         System.out.println("enter radius of cylinder");
         r=obj.nextFloat();
         System.out.println("enter height of cylinder");
         h=obj.nextFloat();
    }
   public void display()
   {
       volume = (3.14*r*r*h);
       System.out.println("Volume of cylinder is:"+volume);
   }
    public static void main(String[] args)
    {
      Demo1 in = new Demo1();
      in.accept();
      in.display();
    }
    
}
