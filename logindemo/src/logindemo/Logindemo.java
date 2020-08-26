
package logindemo;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;

public class Logindemo extends JFrame 
{
    JPasswordField enterpwd;
    JLabel userid,heading,pwd;
    JTextField enteruserid;
    JButton submit,clear;
    public Logindemo()
    {
        JLabel heading = new JLabel("Login Page");
        heading.setBounds(120,80,300,80);
        add(heading);
        
        JLabel userid = new JLabel("Userid");
        userid.setBounds(50,140,200,20);
        add(userid);
        
        JLabel pwd = new JLabel("Password");
        pwd.setBounds(50,210,200,20);
        add(pwd);
        
        JTextField enteruserid = new JTextField();
        enteruserid.setBounds(100,140,200,20);
        add(enteruserid);
        
        JPasswordField enterpwd = new JPasswordField();
        enterpwd.setBounds(100,210,200,20);
        add(enterpwd);
        
        JButton submit = new JButton("Submit");
        submit.setBounds(80,320,150,30);
        add(submit);
        
        JButton clear = new JButton("Clear");
        clear.setBounds(200,320,150,30);
        add(clear);
        
        Toolkit tp = Toolkit.getDefaultToolkit();
        int xsize = (int)tp.getScreenSize().getWidth();
        int ysize = (int)tp.getScreenSize().getHeight();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(xsize,ysize);
        setLayout(null);
    }
    
    

    public static void main(String[] args) 
    {
        Logindemo l = new Logindemo();
    }
    
}
