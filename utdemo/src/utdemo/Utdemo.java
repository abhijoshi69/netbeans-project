package utdemo;
import javax.swing.*;
import java.awt.event.*;
public class Utdemo extends JFrame
{
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1;
    
    public Utdemo()
    {
        JLabel l1 = new JLabel("Name");
        l1.setBounds(50,80,200,20);
        
        JLabel l2 = new JLabel("Emailid");
        l2.setBounds(50,140,200,20);
        
        JLabel l3 = new JLabel("Contact NO.");
        l3.setBounds(50,200,200,20);
        
        JTextField t1 = new JTextField();
        t1.setBounds(150,80,200,20);
        
        JTextField t2 = new JTextField();
        t2.setBounds(150,140,200,20);
        
        JTextField t3 = new JTextField();
        t3.setBounds(150,200,200,20);
        
        JButton b1= new JButton("Submit");
        b1.setBounds(50,280,200,20);
        
        setLayout(null);
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        
        b1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                
                String name = t1.getText();
                String email = t2.getText();
                String contact = t3.getText();
                new Lang(name,email,contact).setVisible(true);
                
               
            }
        });
       
        
    }

    
    public static void main(String[] args) 
    {
       Utdemo u = new Utdemo();
       u.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       u.setVisible(true);
       u.setSize(300,300);
    }
    
}
