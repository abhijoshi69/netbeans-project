
package interfaced;
import java.util.Scanner;
class Circle implements Calculator
{
    int r;
    float res;
    @Override
    public void accept()
    {
      
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        r = obj.nextInt();
    }
    @Override
    public void compute()
    {
        res = (22*r*r)/7;
        
    }
    @Override
    public void display()
    {
        System.out.println("The area of the circle is "+res);
    }
}
class Rectangle implements Calculator
{
    int a,b;
    float res;
    @Override
    public void accept()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the length of the rectag");
    }
}

public class Interfaced 
{
    

   
    public static void main(String[] args) 
    {
       Circle c = new Circle();
       c.accept();
       c.compute();
       c.display();
    }
    
}
