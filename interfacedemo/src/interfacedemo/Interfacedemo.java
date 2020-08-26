
package interfacedemo;
class Book
{
    int page_no=50;
    String name,authorname;
    public void accept()
    {
        name="The buddha and his Dhamma";
        authorname="Dr.B.R.Ambedkar";
        
    }
    public void printinfo()
    {
        accept();
        System.out.println("The name of the book is "+name);
        System.out.println("The name of the author is "+authorname);
        System.out.println("The number of pages of the book is "+page_no);
    }
}

public class Interfacedemo extends Book 
{
    float price=77;
    public void display()
    {
        printinfo();
        System.out.println("The price of the book is "+price);
    }
    public static void main(String[] args) 
    {
        Interfacedemo it = new Interfacedemo();
        it.display();
    }
    
}
