package inheritdemo;
import java.util.Scanner;

class Book
{
    Scanner obj = new Scanner(System.in);
    int page_no;
    String authorname,bookname;
    public void acceptinfo()
    {
        System.out.println("Enter the name of the book");
        bookname=obj.next();
        System.out.println("Enter the name of the author");
        authorname=obj.next();
        System.out.println("Enter the number of the pages");
        page_no=obj.nextInt();
        
    }
    public void printinfo()
    {
        acceptinfo();
        System.out.println("The name of the book is "+bookname);
        System.out.println("The name of the author is "+authorname);
        System.out.println("The number of pages of the book "+page_no);
    }
}
public class Inheritdemo extends Book
{
    
    float price;
    public void accept()
    {
        System.out.println("Enter the price of the book");
        price=obj.nextFloat();
    }
    public void display()
    {
        acceptinfo();
        printinfo();
        System.out.println("The price of the book is "+price);
    }

 
    public static void main(String[] args) 
    {
        Inheritdemo in = new Inheritdemo();
        in.acceptinfo();
        in.accept();
        in.display();
    }
    
}
