
package divisible;
import java.util.Scanner;
public class Divisible 
{
    int n1,n2;
    Scanner obj = new Scanner(System.in);
    public void accept()
    {
        System.out.println("enter the first number");
        n1=obj.nextInt();
        System.out.println("enter the second number");
        n2=obj.nextInt();
    }
    public void display()
    {
        if(n1%n2==0)
        {
            System.out.println("It is divisible");
        }
        else
        {
            System.out.println("The second might be zero");
        }
    }       
     

    public static void main(String[] args) 
    {
       Divisible in = new Divisible();
       in.accept();
       in.display();
    }
    
}
