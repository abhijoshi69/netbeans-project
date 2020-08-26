package jpegdemo1;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Jpegdemo1  
{

    
    public static void main(String[] args) 
    {
        try
        {
            BufferedImage originalImage = ImageIO.read(new File("‪E:\\niit practicals\\headphones.jpeg"));
            ImageIO.write(originalImage,"jpg",new File("E:\\niit practicals\\abhi"));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
