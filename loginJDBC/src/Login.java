import java.awt.Font;
import javax.swing.*;
public class Login extends JFrame
{
    JLabel LoginPage,emailid,pwd2;
    JTextField emailtxt1;
    JPasswordField pwdtxt2;
    JButton Login,Exit;
    public Login() 
    {
        LoginPage = new JLabel("LoginPage");
        LoginPage.setBounds(150,80,400,20);
        LoginPage.setFont(new Font("Calbri",Font.BOLD,18));
        add(LoginPage);
        
        emailid = new JLabel("EmailId:");
        emailid.setBounds(120,140,200,20);
        emailid.setFont(new Font("Calbri",Font.BOLD,18));
        add(emailid);
        
        emailtxt1 = new JTextField();
        emailtxt1.setBounds(240,140,200,20);
        emailtxt1.setFont(new Font("Arial",Font.BOLD,16));
        add(emailtxt1);
        
        pwd2 = new JLabel("Password");
        pwd2.setBounds(120,200,200,20);
        pwd2.setFont(new Font("Calbri",Font.BOLD,18));
        add(pwd2);
        
    }
    
}
