package p1demo;
import javax.swing.*;
import java.awt.event.*;
public class P1demo extends JFrame
{
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3;
    JButton b1,b2;
    public P1demo()
    {
        
    }
    public P1demo(String s)
    {
        super(s);
    }
    public void setComponents()
    {
        l1 = new JLabel("Name");
        l2 = new JLabel("Age");
        l3 = new JLabel("Contact number");
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("Submit");
        b2 = new JButton("Cancel");
        l4 = new JLabel();
        l5 = new JLabel();
        l6 = new JLabel();
        setLayout(null);
        l1.setBounds(50,50,100,20);
        t1.setBounds(150,50,100,20);
        l2.setBounds(50,80,100,20);
        t2.setBounds(150,80,100,20);
        l3.setBounds(50,120,100,20);
        t3.setBounds(150,120,100,80);
        b1.setBounds(80,150,200,20);
        b2.setBounds(140,150,200,20);
        l4.setBounds(50,170,100,20);
        l5.setBounds(50,200,100,20);
        l6.setBounds(50,230,100,20);
        b1.addActionListener(new Handler());
        b2.addActionListener(new Handler());
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(l4);
        add(l5);
        add(l6);
        
    }
    class Handler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String a = String.valueOf(l1.getText());
            int b  = Integer.parseInt(l2.getText());
            String c = String.valueOf(l3.getText());
            l4.setText("Name:"+a);
            l5.setText("Age:"+b);
            l6.setText("Contact number:"+c);
        }
    }
    public static void main(String[]args)
    {
        P1demo p = new P1demo("Demo");
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setVisible(true);
        p.setSize(300,300);
        p.setComponents();
    }
    
}
