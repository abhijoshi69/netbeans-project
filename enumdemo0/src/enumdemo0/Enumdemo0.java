
package enumdemo0;
enum Mango 
{
    Carrie(10),Fairchild(9),Haden(12);
    private int price;
    Mango(int p)
    {
        price = p;
    }
    int getPrice()
    {
        return price;
    }
}
public class Enumdemo0
{

    public static void main(String[] args) 
    {
        Mango p = Mango.Haden;
        System.out.println(p.getPrice());
 
    }
    
}
