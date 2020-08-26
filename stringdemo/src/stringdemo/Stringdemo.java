

package stringdemo;
import java.util.Scanner;
public class Stringdemo
{
    int num,id,id1;
    String employee = "marriaged";
    String dname,desname,date_of_joining,date_of_birth,date_of_marriage,marital_status;
    Scanner obj = new Scanner(System.in);
    
    public void accept()
    {
        System.out.println("Enter the number");
        num = obj.nextInt();
        switch(num)
        {
            case 1:
            {
                System.out.println("Enter the id");
                id=obj.nextInt();
            }
            break;
            case 2:
            {
                System.out.println("Enter the destination named");
                dname=obj.next();
            }
            break;
            case 3:
            {
                System.out.println("Enter the designation name");
                desname=obj.next();
                
            }
            break;
            case 4:
            {
                System.out.println("Enter the date of joining");
                date_of_joining=obj.next();
                
            }
            break;
            case 5:
            {
                System.out.println("Enter the date of birth");
                date_of_birth=obj.next();
            }
            case 6:
            {
                System.out.println("Enter the date of marriage");
                date_of_marriage=obj.next();
            }
            break;
            case 7:
            {
                System.out.println("Enter the marital status");
                marital_status=obj.next();
            }
        }
     
    }
    public void display()
    {
        System.out.println("Enter the id");
        id1=obj.nextInt();
        if(id==id1)
        {
            switch(num)
            {
                case 1:
                {
                    System.out.println(id);
                }
                break;
                case 2:
                {
                    System.out.println(dname);
                }
                break;
                case 3:
                {
                    System.out.println(desname);
                }
                break;
                case 4:
                {
                    System.out.println(date_of_joining);
                }
                break;
                case 5:
                {
                    System.out.println(date_of_birth);
                }
                break;
                case 6:
                {
                    System.out.println(date_of_marriage);
                    
                }
                break;
                case 7:
                {
                    System.out.println(marital_status);
                    if(employee==marital_status)
                    {
                        System.out.println("The employee is married");
                    }
                }
                break;
                default:
                {
                    System.out.println("Error");
                }
                break;
            }
        }
        
    }
    public static void main(String[] args)
    {
      Stringdemo in = new Stringdemo();
      in.accept();
      in.display();
    }
}
