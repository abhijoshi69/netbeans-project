package regularexpdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularexpdemo 
{
    public static void m1()
    {
        String s = "gold cat Silence is golden";
        Pattern p1 = Pattern.compile("is");
        Pattern p2 = Pattern.compile("[abc]at");
        Pattern p3 = Pattern.compile("[A-Z]");
        Pattern p4 = Pattern.compile("[a-z]");
        Pattern p5 = Pattern.compile("[0-9]");
        Matcher m = p1.matcher(s);
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
        String s = "Today is Christmas 15th May 2019";
        Pattern p1 = Pattern.compile("\\d");
        Pattern p2 = Pattern.compile("\\d\\d");
        Pattern p3 = Pattern.compile("\\d\\d\\d");
        Pattern p4 = Pattern.compile("\\D");
        Pattern p5 = Pattern.compile("\\sis\\s");
        Pattern p6 = Pattern.compile("\\Sis\\S");
        Matcher m = p1.matcher(s);
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
        String s = "Long long long ago,in a galaxy far far away";
        Pattern p1 = Pattern.compile("ago*");
        Pattern p2 = Pattern.compile("ago+");
        Pattern p3 = Pattern.compile("ago.?");
        Pattern p4 = Pattern.compile("ago.*far");
        Pattern p5 = Pattern.compile("ago.*?far");
        Pattern p6 = Pattern.compile("gal.{3}");
        Pattern p7 = Pattern.compile("(long){2}");
        Pattern p8 = Pattern.compile("(far){2}");
        Matcher m = p1.matcher(s);
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
    

    
    public static void main(String[] args) 
    {
        m3();
    }
    
}
