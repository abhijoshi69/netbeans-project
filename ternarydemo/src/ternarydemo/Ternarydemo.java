
package ternarydemo;
import java.util.Scanner;
public class Ternarydemo
{
      int a;
      Scanner obj = new Scanner(System.in);
      public void accept()
      {
          System.out.println("Enter value");
          a=obj.nextInt();
          if(a%2==0)
          {
              System.out.println("Even"+a);
          }
          else
          {
              System.out.println("Odd"+a);
          }
      }
 
    public static void main(String[] args)
    {
         Ternarydemo in = new Ternarydemo();
         in.accept();
    }
}
