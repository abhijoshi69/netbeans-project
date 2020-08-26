package projectdemo;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
public class ProjectDemo extends JFrame 
{
    JLabel emailid,password,login,link,click,statem,pwdem;
    JTextField emailidtxt;
    JPasswordField passwordtxt;
    String login1,link1,click1;
    JButton Submit,Reset;
    public ProjectDemo()
    {
        setContentPane(new JLabel(new ImageIcon(getClass().getResource("Image\\images.jpg"))));
                
        login1 = "<html><u>Login Page</u></html>";
        login = new JLabel(login1);
        login.setBounds(215,50,300,60);
        login.setFont(new Font("Georgia",Font.BOLD,50));
        login.setForeground(new Color(33,33,33));
        add(login);
        
        emailid = new JLabel("Email ID:");
        emailid.setBounds(100,140,200,35);
        emailid.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        emailid.setForeground(new Color(255,255,0));
        add(emailid);
        
        emailidtxt = new JTextField();
        emailidtxt.setBounds(240,140,270,35);
        emailidtxt.setFont(new Font("Times New Roman",Font.BOLD,25));
        emailidtxt.setForeground(new Color(26,35,126));
        add(emailidtxt);
        
        password = new JLabel("Password:");
        password.setBounds(100,210,200,35);
        password.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        password.setForeground(new Color(255,255,0));
        add(password);
        
        passwordtxt = new JPasswordField();
        passwordtxt.setBounds(240,210,270,35);
        passwordtxt.setFont(new Font("Times New Roman",Font.BOLD,25));
        passwordtxt.setForeground(new Color(26,35,126));
        add(passwordtxt);
        
        Submit = new JButton("SUBMIT");
        Submit.setBounds(120,270,200,40);
        Submit.setFont(new Font("",Font.BOLD,30));
        Submit.setForeground(new Color(0,188,212));
        Submit.setBackground(new Color(38,50,56));
        add(Submit);
        
        Reset = new JButton("RESET");
        Reset.setBounds(400,270,200,40);
        Reset.setFont(new Font("",Font.BOLD,30));
        Reset.setForeground(new Color(0,188,212));
        Reset.setBackground(new Color(38,50,56));
        add(Reset);
        
        link1 = "<html>For Registration Please!!</html>";
        link = new JLabel(link1);
        link.setBounds(100,340,500,40);
        link.setFont(new Font("Bookman",Font.BOLD,30));
        link.setForeground(new Color(250,250,250));
        add(link);
        
        click1 = "<html><u>Click Here</u></html>";
        click = new JLabel(click1);
        click.setBounds(465,340,300,40);
        click.setFont(new Font("Arial",Font.BOLD,30));
        click.setForeground(new Color(33,150,243));
        add(click);
        
        statem = new JLabel();
        statem.setBounds(530,140,300,35);
        statem.setFont(new Font("Arial",Font.BOLD,25));
        statem.setForeground(new Color(244,67,54));
        add(statem);
        
        pwdem = new JLabel();
        pwdem.setBounds(530,210,300,35);
        pwdem.setFont(new Font("Arial",Font.BOLD,25));
        pwdem.setForeground(new Color(244,67,54));
        add(pwdem);
        
        emailidtxt.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
         //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            statem.setText(null);
            }

            @Override
            public void focusLost(FocusEvent e) {
           //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
           String PATTERN ="(\\S+)@(gmail||yahoo)\\.(com|net|co\\.in)";
                Pattern p = Pattern.compile(PATTERN);
                Matcher m = p.matcher(emailidtxt.getText());
                if(!m.find())
                {
                    statem.setText("Incorrect email");
                }
                else
                {
                    statem.setText(null);
                }
             
               
            }
        });
        
        passwordtxt.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                pwdem.setText(null);
            }

            @Override
            public void focusLost(FocusEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               String PATTERN = "(\\d).{6}+";
               Pattern p = Pattern.compile(PATTERN);
               Matcher m = p.matcher(passwordtxt.getText());
               if(!m.find())
               {
                   pwdem.setText("6 characters only");
               }
               else
               {
                   pwdem.setText(null);
               }
            }
        });
        
        Reset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                emailidtxt.setText("");
                passwordtxt.setText("");
            }
        });
        
        click.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                new registration();
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
                
        setSize(800,500);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }

    
    public static void main(String[] args) 
    {
        ProjectDemo pd = new ProjectDemo();
    }
    
}
