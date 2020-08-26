package imagescan;
import net.sourceforge.tess4j.*;
import java.io.*;

public class ImageScan 
{
    public String getImgText(String imageLocation)
    {
        ITesseract instance = new Tesseract();
        try
        {
            String imgText = instance.doOCR(new File(imageLocation));
            return imgText;
        }
        catch(TesseractException e)
        {
            e.getMessage();
            return "Error while reading image";
        }
    }
    
    public static void main(String[] args) 
    {
        ImageScan i = new ImageScan();
        System.out.println(i.getImgText("E:\\Abhi's Cert\\Caste.jpg"));
    }
    
}
