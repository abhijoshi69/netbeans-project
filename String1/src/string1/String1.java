
package string1;
import java.util.Scanner;
public class String1
{
    String employee = "marriage";
    String name,id,department,designation,date_of_joining,date_of_birth,marital_status,date_of_marriage,id1;
    int num;
    Scanner obj = new Scanner(System.in);
    public void accept()
    {
        System.out.println("Enter the name of the employee");
        name = obj.next();
        System.out.println("Enter the id of the employee");
        id = obj.next();
        System.out.println("Enter the department of the employee");
        department = obj.next();
        System.out.println("Enter the designation of the employee");
        designation = obj.next();
        System.out.println("Enter the date of joining of the employee");
        date_of_joining = obj.next();
        System.out.println("Enter the date of birth of the employee");
        date_of_birth = obj.next();
        System.out.println("Enter the marital status of the employee");
        marital_status = obj.next();
        System.out.println("Enter the date_of_marriage of the employee");
        date_of_marriage = obj.next();
        
    }
    public void display()
    {
       
        System.out.println("Enter the id");
        id1 = obj.next();
        if(id1==id)
        {
            System.out.println("Enter the number");
            num = obj.nextInt();
            switch(num)
            {
                 
                case 1:
                {
                    System.out.println(id);
                }
                break;
                case 2:
                {
                    System.out.println(name);
                }
                break;
                case 3:
                {
                    System.out.println(department);
                }
                break;
                case 4:
                {
                    System.out.println(designation);
                }
                break;
                case 5:
                {
                    System.out.println(date_of_joining);
                }
                break;
                case 6:
                {
                    System.out.println(date_of_birth);
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
                case 8:
                {
                    System.out.println(date_of_marriage);
                }
                break;
                
            }
        }
        else if(id!=id1)
        {
            System.out.println("You have entered incorrect id");
        }
    }
    

  
    public static void main(String[] args) 
    
    {
       String1 in = new String1();
       in.accept();
       in.display();
    }
    
}
