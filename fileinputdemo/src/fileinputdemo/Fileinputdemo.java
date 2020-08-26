
package fileinputdemo;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.BufferedInputStream;



public class Fileinputdemo
{

   
    public static void main(String[] args) 
    {
        String s = "This is a Buffered Input Stream Demo Program";
        byte buf[] = s.getBytes();
        try(ByteArrayInputStream in = new ByteArrayInputStream(buf);BufferedInputStream f = new BufferedInputStream(in))
        {
            int c;
            while((c=f.read())!=-1)
            {
                System.out.println((char)c);
            }
            
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
      
    }
    
}
