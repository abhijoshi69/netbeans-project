package abhide;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class Abhide extends JFrame 
{
    JComboBox s;
    JRadioButton r1,r2,r3,r4;
    JButton m1;
    JTextField t1,t2;
    public Abhide()
    {
        
    }
    public Abhide(String s)
    {
        super(s);
    }
    public void setComponents()
    {
            s = new JComboBox();
            s.addItem("Welcome");
            s.addItem("Hello");
            s.addItem("Bye");
            s.addItem("Okay");
            s.addItem("Come");
            r1 = new JRadioButton("German");
            r2 = new JRadioButton("English");
            r3 = new JRadioButton("Chinese");
            r4 = new JRadioButton("French");
            t1 = new JTextField();
            t2 = new JTextField();
            m1 = new JButton("Submit");
            s.setBounds(50,80,200,20);
            r1.setBounds(50,120,100,20);
            r2.setBounds(200,120,100,20);
            r3.setBounds(50,180,100,20);
            r4.setBounds(200,180,100,20);
            t1.setBounds(50,240,200,20);
            m1.setBounds(280,240,200,20);
            m1.addMouseListener(new Handler());
            t2.setBounds(50,300,200,20);
            add(s);
            add(r1);
            add(r2);
            add(r3);
            add(r4);
            add(t1);
            add(m1);
            add(t2);
    }
    class Handler implements MouseListener
    {
        public void r1mouseClicked(MouseEvent e)
        {
            Locale l1 = new Locale("de","DE");
            ResourceBundle rb1 = ResourceBundle.getBundle("message ",l1);
        }
    }

  
    public static void main(String[] args) 
    {
       Abhide d = new Abhide("Demo");
       d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       d.setVisible(true);
       d.setSize(300,300);
       d.setComponents();
    }
    
}
