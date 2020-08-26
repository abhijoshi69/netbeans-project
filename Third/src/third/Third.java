
package third;
import java.util.Scanner;
public class Third 
{
    float F;
    int C;
    Scanner obj = new Scanner(System.in);
    public void accept()
    {
        System.out.println("Enter temperature in celius");
        C=obj.nextInt();
    }
    public void display()
    {
        F=(C*(9/5+32));
        System.out.println("The temperature in Farenheit is:"+F);
    }

  
    public static void main(String[] args)
    {
     Third in = new Third();
     in.accept();
     in.display();
    }
    
}
