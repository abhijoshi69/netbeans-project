
package demoy;
import java.util.Scanner;


public class Demoy 
{
    class Circle implements calculate
    {
        int r;
        float res;
        Scanner obj = new Scanner(System.in);
        @Override
        public void accept()
        {
            System.out.println("Enter the radius of the circle");
            r = obj.nextInt();
        }
         @Override
        public void solve()
        {
            res = (22*r*r)/7;
        }
         @Override
        public void display()
        {
            System.out.println("The area of the circle is:"+res);
        }
        
    }
    class Rectangle implements calculate
    {
        int l,b;
        int res;
        Scanner obj = new Scanner(System.in);
         @Override
        public void accept()
        {
            System.out.println("Enter the length of the rectangle ");
            l = obj.nextInt();
            System.out.println("Enter the breadth of the rectangle");
            b = obj.nextInt();
            
        }
         @Override
        public void solve()
        {
            res = l*b;
            
        }
         @Override
        public void display()
        {
            System.out.println("The area of the rectangle is:"+res);
            
        }
    }
    class Triangle implements calculate
    {
        int h,b;
        float res;
        Scanner obj = new Scanner(System.in);
         @Override
        public void accept()
        {
            System.out.println("Enter the heigth of the triangle ");
            h = obj.nextInt();
            System.out.println("Enter the base of the triangle ");
            b = obj.nextInt();
            
        }
         @Override
        public void solve()
        {
            res = (h*b)/2;
        }
         @Override
        public void display()
        {
            System.out.println("The area of the triangle is:"+res); 
        }
    public static void main(String[] args)
    {
        
      Circle in = new Circle();
      in.accept();
      in.solve();
      in.display();
      Rectangle in = new Rectangle();
      in.accept();
      in.solve();
      in.display();
      Triangle in = new Triangle();
      in.accept();
      in.solve();
      in.display();
      
 
      
      
        
        
    }
    
}
