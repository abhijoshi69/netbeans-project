package staticdemo3;
import java.util.*;
class Demo
{
    String user,password;
    Scanner sc = new Scanner(System.in);
    void accept()
    {
        System.out.println("Enter your username");
        user = sc.next();
        System.out.println("Enter your password");
        password=sc.next();
    }
    static class Validate
    {
        void display()
        {
            Demo d = new Demo();
            d.accept();
            System.out.println("Username is "+d.user);
            System.out.println("Password is "+d.password);
            
        }
    }
}
public class StaticDemo3 
{
    
    
    public static void main(String[] args) 
    {
       Demo.Validate v = new Demo.Validate();
       v.display();
    }
    
}
