package javademo;
import javax.swing.*;
import java.awt.event.*;
public class Javademo extends JFrame  
{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1,b2,b3,b4;
    public Javademo()
    {
        
    }
    public Javademo(String s)
    {
        super(s);
        
    }
    public void setComponents()
    {
        l1 = new JLabel("Addition of two numbers");
        l2 = new JLabel("First number");
        l3 = new JLabel("Second number");
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("Add");
        b2 = new JButton("Subtract");
        b3 = new JButton("Multiply");
        b4 = new JButton("Division");
        l1.setBounds(100,50,200,20);
        l2.setBounds(50,80,100,20);
        t1.setBounds(150,80,100,20);
        l3.setBounds(50,120,100,20);
        t2.setBounds(150,120,100,20);
        b1.setBounds(120,150,100,20);
        b2.setBounds(240,150,100,20);
        b3.setBounds(360,150,100,20);
        b4.setBounds(480,150,100,20);
        l4.setBounds(50,240,200,20);
        b1.addActionListener(new Handler());
        b2.addActionListener(new Handler());
        b3.addActionListener(new Handler());
        b4.addActionListener(new Handler());
        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l4);
    
        
        
    }
    class Handler implements ActionListener
    {
           @Override
           public void actionPerformed(ActionEvent e)
           {
//               int a = Integer.parseInt(t1.getText());
//               int b = Integer.parseInt(t2.getText());
               int c = Integer.parseInt(t1.getText());
               int u = Integer.parseInt(t2.getText());
//               int f = Integer.parseInt(t1.getText());
//               int g = Integer.parseInt(t2.getText());
//               int h = Integer.parseInt(t1.getText());
//               int k = Integer.parseInt(t2.getText());
//               
//               int s = a+b;
//               l4.setText("Result is"+s);
               int r = c-u;
               l4.setText("Result is"+r);
//               int d = f*g;
//               l4.setText("Result is"+d);
//               int t = h/k;
//               l4.setText("Result is"+t);
//            
              
               
           }
    }

    public static void main(String[] args) 
    {
       Javademo jd = new Javademo("Demo1");
       jd.setComponents();
       jd.setVisible(true);
       jd.setSize(300,300);
       jd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    
}
