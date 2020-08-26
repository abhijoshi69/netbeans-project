
package datademo;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
public class login extends JFrame
{
    JLabel emailid,password,login,li,click;
    JTextField emailidtxt;
    JPasswordField passwordtxt;
    String log,link,click1;
    JButton submit,reset;
    public login()
    {
        log ="<html><u>Login Page</u></html>";
        login = new JLabel(log);
        login.setBounds(200,70,500,40);
        login.setFont(new Font("Arial",Font.BOLD,35));
        login.setForeground(new Color(38,50,56));
        add(login);
        
        emailid = new JLabel("Email Id:");
        emailid.setBounds(120,140,200,30);
        emailid.setFont(new Font("Calbri",Font.BOLD,25));
        emailid.setForeground(new Color(26,35,126));
        add(emailid);
        
        emailidtxt = new JTextField();
        emailidtxt.setBounds(240,140,270,30);
        emailidtxt.setFont(new Font("Calbri",Font.BOLD,25));
        emailidtxt.setForeground(new Color(26,35,126));
        add(emailidtxt);
        
        password = new JLabel("Password:");
        password.setBounds(100,200,200,30);
        password.setFont(new Font("Calbri",Font.BOLD,25));
        password.setForeground(new Color(26,35,126));
        add(password);
        
        passwordtxt = new JPasswordField();
        passwordtxt.setBounds(240,200,270,30);
        passwordtxt.setFont(new Font("Calbri",Font.BOLD,25));
        passwordtxt.setForeground(new Color(26,35,126));
        add(passwordtxt);
        
        link = "<html>For Registration Please!!</html>";
        li = new JLabel(link);
        li.setBounds(100,260,300,30);
        li.setFont(new Font("Arial",Font.BOLD,25));
        li.setForeground(new Color(33,33,33));
        add(li);
        
        click1 = "<html><u>Click Here</u></html>";
        click = new JLabel(click1);
        click.setBounds(400,260,200,30);
        click.setFont(new Font("Arial",Font.BOLD,25));
        click.setForeground(new Color(3,169,244));
        add(click);
        
        click.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                new Datademo();
            }

            @Override
            public void mousePressed(MouseEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        setSize(600,600);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String [] args)
    {
        login l = new login();
    }
}
