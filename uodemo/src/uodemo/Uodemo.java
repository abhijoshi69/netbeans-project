
package uodemo;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class Uodemo extends JFrame 
{
    JComboBox message;
    JRadioButton r1,r2,r3,r4;
    JTextField t1;
    JButton b1;
    String s;
    static Locale c = Locale.US;
    static Locale e = Locale.FRENCH;
    static Locale d = Locale.GERMAN;
    
    
    public Uodemo()
    {
   
    }
    public Uodemo(String s)
    {
        super(s);
    }
    public void setComponents()
    {
        message = new JComboBox();
        message.addItem("Welcome");
        message.addItem("Okay");
        message.addItem("Bye");
        message.addItem("Abhishek");
        r1 = new JRadioButton("German");
        r2 = new JRadioButton("English");
        r3 = new JRadioButton("Chinese");
        r4 = new JRadioButton("French");
        t1 = new JTextField();
        b1 = new JButton("Submit");
        message.setBounds(50,100,200,20);
        r1.setBounds(50,150,200,20);
        r2.setBounds(240,150,200,20);
        r3.setBounds(50,240,200,20);
        r4.setBounds(240,240,200,20);
        t1.setBounds(50,320,200,20);
        b1.setBounds(300,320,200,20);
        b1.addActionListener(new Handler());
        setLayout(null);
        add(message);
        add(r1);
        add(r2);
        add(r3);
        add(r4);
        add(t1);
        add(b1);
    }
    
  
    public void r1mouseClicked(java.awt.event.MouseEvent e)
    {
        setEnglish();
    }
    public static void setEnglish()
    {
        ResourceBundle rb1 = ResourceBundle.getBundle("message",c);
    }
    public void b1mouseClicked(java.awt.event.MouseEvent j)
    {
        
        
    }
       
    

   
    public static void main(String[] args)
    {
        Uodemo u = new Uodemo("Demo");
        u.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        u.setVisible(true);
        u.setSize(300,300);
        u.setComponents();
       
    }
    
}
