package demo;
import java.util.Scanner;
public class Demo 
{
      float distance;
      int u,a,t;
      Scanner obj = new Scanner(System.in);
      public void accept()
      {
          System.out.println("enter initial velocity");
          u=obj.nextInt();
          System.out.println("enter acceleration");
          a=obj.nextInt();
          System.out.println("enter time");
          t=obj.nextInt();
          
      }
      public void display()
      {
      distance =((u*t)+(a*t*t)/2);
          System.out.println("distance is:"+distance);
          
      }
    
    public static void main(String[] args)
    {
      Demo in = new Demo();
      in.accept();
      in.display();
    }
    
}
