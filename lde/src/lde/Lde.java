package lde;
import java.util.*;
public class Lde 
{

    
    public static void main(String[] args) 
    {
        Locale l = new Locale("hi","IN");
       ResourceBundle bundle = ResourceBundle.getBundle("lde/p",l);
       String str = bundle.getString("wish");
        System.out.println(str);
    }
    
}
