
package staticdemo;

public class Staticdemo 
{
    public void display(int a)
    {
        System.out.println("First");
        System.out.println("A="+a);
    }
    public void display(int a,int b)
    {
        System.out.println("Second");
        System.out.println("A="+a);
        System.out.println("B="+b);
    }

  
    public static void main(String[] args) 
    {
        Staticdemo st = new Staticdemo();
        st.display(13);
        st.display(23,312);
    }
    
}
