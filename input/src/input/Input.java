
package input;
import java.util.Scanner;
public class Input 
{
      char ch;
      Scanner obj = new Scanner(System.in);
      public void accept();
      {
          System.out.println("Enter a char");
          ch=obj.next().charAt(0);
          switch(ch)
          {
              case 'h':
              {
                  System.out.println("Hindi");
              }
              break;
              case 'm':
              {
                  System.out.println("Marathi");
              }
              break;
              default:
              {
                  System.out.println("Invalid choice");
              }
              break;
          }
      }
          
}
 
    public static void main(String[] args) 
    {
      Input obj = new Input();
      in.accept();
    }
    
}
