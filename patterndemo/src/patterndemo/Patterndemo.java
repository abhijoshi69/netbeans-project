
package patterndemo;
import java.util.regex.*;
public class Patterndemo 
{
    public static void m1()
    {
        String s = "gold cat Silence is golden";
        Pattern p1 = Pattern.compile("is");
        Pattern p2 = Pattern.compile("Silence");
        Pattern p3 = Pattern.compile("gold");
        Pattern p4 = Pattern.compile("old");
        Pattern p5 = Pattern.compile("[ldc]en");
        Pattern p6 = Pattern.compile("[abc]at");
        Pattern p7 = Pattern.compile("[A-Z]");
        Pattern p8 = Pattern.compile("[a-z]");
        Pattern p9 = Pattern.compile("[0-9]");
        Matcher m = p9.matcher(s);
        if(m.find())
        {
            System.out.println(m.group());
            System.out.println("Match found");
        }
        else
        {
            System.out.println("Match not found");
        }
        
    }
    public static void m2()
    {
        String s = "Today is Christmas 15th May 2017";
        Pattern p1 = Pattern.compile("\\d");
        Pattern p2 = Pattern.compile("\\d\\d");
        Pattern p3 = Pattern.compile("\\d\\d\\d");
        Pattern p4 = Pattern.compile("\\D");
        Pattern p5 = Pattern.compile("\\sis\\s");
        Pattern p6 = Pattern.compile("\\Sis\\S");
        Matcher m = p5.matcher(s);
        if(m.find())
        {
            System.out.println(m.group());
            System.out.println("Match found");
        }
        else
        {
            System.out.println("Match not found");
        }
    }
    public static void m3()
    {
        String s = "ajay.poojary@gmail.co.in";
        Pattern p1 = Pattern.compile("(\\S+)\\.(\\S+)@(gmail|yahoo)\\.(com|net|co\\.in)");
        Matcher m = p1.matcher(s);
        if(m.find())
        {
            System.out.println(m.group());
            System.out.println("Match found");
            
        }
        else
        {
            System.out.println("Match not found ");
        }

     }

    
    public static void main(String[] args) 
    {
        //m1();
       //m2();
        m3();
    }
    
}
