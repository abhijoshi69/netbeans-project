package innerdemo;
import java.util.*;
class Demo
{
    private String user,password;
    Scanner sc = new Scanner(System.in);
    void accept()
    {
        System.out.println("Enter your username");
        user = sc.next();
        System.out.println("Enter your password");
        password = sc.next();
    }
    class Validate
    {
        void display()
        {
            System.out.println("Username is "+user);
            System.out.println("Password is "+password);
        }
    }
}
public class InnerDemo 
{
    
    
    public static void main(String[] args) 
    {
        Demo d = new Demo();
        d.accept();
        Demo.Validate v = d.new Validate();
        v.display();
    }
    
}
