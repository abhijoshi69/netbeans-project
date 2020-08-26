package idemo;
import javax.swing.*;

public class Idemo extends JFrame
{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;
    public Idemo()
    {
        
    }
    public Idemo (String s)
    {
        super(s);
    }
    public void setComponents()
    {
        l1 = new JLabel("Addititon of 2no");
        l2 = new JLabel("1st no");
        l3 = new JLabel("2nd no");
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("Add");
        l1.setBounds(50,80,200,20);
        l2.setBounds(50,130,100,20);
        t1.setBounds(150,130,100,20);
        l3.setBounds(50,180,100,20);
        t2.setBounds(150,180,100,20);
        b1.setBounds(80,200,100,20);
        l4.setBounds(50,240,200,20);
        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b1);
        add(l4);
    }
    

    
    public static void main(String[] args) 
    {
        Idemo id = new Idemo("Demo 1");
        id.setComponents();
        id.setVisible(true);
        id.setSize(300,300);
        id.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
