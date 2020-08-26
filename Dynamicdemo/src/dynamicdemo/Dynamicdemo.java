
package dynamicdemo;
class Person
{
    public void display()
    {
        System.out.println("Enter Person details");
    }
}
class Customer extends Person
{
    @Override
    public void display()
    {
        System.out.println("Enter Customer details");
    }
}
class Dealer extends Person
{
    @Override
    public void display()
    {
        System.out.println("Enter Dealer details");
    }
}

public class Dynamicdemo 
{

    
    public static void main(String[] args) 
    {
        Person p = new Person();
        Customer c = new Customer();
        Dealer d = new Dealer();
        Person ref;
        ref=p;
        ref.display();
        ref=c;
        ref.display();
        ref=d;
        ref.display();
    }
    
}
