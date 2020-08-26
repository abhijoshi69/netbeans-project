package bufferdemo;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.IIOException;

public class Bufferdemo 
{

    
    public static void main(String[] args) 
    {
        
        char c;
        int i;
        try(BufferedInputStream b = new BufferedInputStream("E:\\Niitjava\\Demo.txt"))
        {
            while((i=b.read())!=-1)
            {
                c=(char)i;
                System.out.print(c);
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
}
