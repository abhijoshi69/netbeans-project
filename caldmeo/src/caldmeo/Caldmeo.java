package caldmeo;
import java.util.Scanner;
class Circle implements calculate
{
        int r;
        float res;
        Scanner obj = new Scanner(System.in);
        @Override
        public void accept()
        {
            System.out.println("Enter the radius of the circle");
            r=obj.nextInt();
        }
        @Override
        public void display()
        {
          res =(22*r*r)/7;
        }
        @Override
        public void show()
        {
            System.out.println("The area of the circle is "+res);
        }
}
class Rectangle implements calculate
{
        int a,b,res;
        Scanner obj = new Scanner(System.in);
        @Override
        public void accept()
        {
            System.out.println("Enter the length of the rectangle");
            a=obj.nextInt();
            System.out.println("Enter the breadth of the rectangle");
            b=obj.nextInt();
            
        }
        @Override
        public void display()
        {
            res=a*b;
        }
        @Override
        public void show()
        {
            System.out.println("The area of the rectangle is "+res);
        }
}
class Square implements calculate
{
        int a,res;
        Scanner obj = new Scanner(System.in);
        @Override
        public void accept()
        {
            System.out.println("Enter the length of the square");
            a=obj.nextInt();
            
        }
        @Override
        public void display()
        {
            res=a*a;
            
        }
        @Override
        public void show()
        {
            System.out.println("The area of the square is "+res);
        }
}
public class Caldmeo 
{

    
    public static void main(String[] args)
    {
        Circle c = new Circle();
        c.accept();
        c.display();
        c.show();
        
        Rectangle r = new Rectangle();
        r.accept();
        r.display();
        r.show();
        
        Square s = new Square();
        s.accept();
        s.display();
        s.show();
       
    }
    
}
