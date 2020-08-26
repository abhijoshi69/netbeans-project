
package exceptiondemo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Exceptiondemo 
{
    

     public static void main(String[] args) 
    {
        System.out.println("Main method begins");
        try 
        {
            
            
            FileInputStream in = new FileInputStream("a.txt");
           
            in.read();
            int a=10/0;
            in.close();
        }
        catch(ArithmeticException | IOException ex)
        {
           ex.printStackTrace();
        }
    
        System.out.println("Main method ends");
      
    }
    
}
