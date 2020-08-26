package fileinputdemo1;

import java.io.FileInputStream;
import java.io.IOException;

public class Fileinputdemo1 
{
   
    
    public static void main(String[] args) 
    {
        int i;
        char c;
        try(FileInputStream f = new FileInputStream("E:\\Niitjava\\Demo.txt"))
        {
            while((i=f.read())!=-1)
            {
                c = (char)i;
                System.out.print(c);
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
    }
    
}
