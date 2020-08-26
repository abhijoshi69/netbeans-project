package javaapplication27;
import java.util.Scanner;
class Circle implements Calculate
{
    int r;
    float res,p=3.14f;
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
        res = p*r*r;
        
    }
    @Override
    public void display()
    {
        System.out.println("The area of the circle is:"+res);
    }
    
}
class Rectangle implements Calculate
{
    int l,b,res;
    Scanner obj = new Scanner(System.in);
    @Override
    public void accept()
    {
        System.out.println("Enter the length of the rectangle");
        l=obj.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        b=obj.nextInt();
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
class Triangle implements Calculate
{
    int h,b1;
    float res;
    Scanner obj = new Scanner(System.in);
    @Override
    public void accept()
    {
        System.out.println("Enter the heigth of the triangle ");
        h=obj.nextInt();
        System.out.println("Enter the base of the triangle  ");
        b1=obj.nextInt();
    }
    @Override
    public void solve()
    {
        res =(h*b1)/2;
    }
    @Override
    public void display()
    {
        System.out.println("The area of the triangle is:"+res);
    }
    
}

public class JavaApplication27 
{

    public static void main(String[] args)
    {
        Circle in = new Circle();
        in.accept();
        in.solve();
        in.display();
        Rectangle i = new Rectangle();
        i.accept();
        i.solve();
        i.display();
        Triangle u = new Triangle();
        u.accept();
        u.solve();
        u.display();

    }
    
}
