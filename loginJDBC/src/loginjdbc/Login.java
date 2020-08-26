
package loginjdbc;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame 
{
    JLabel LoginPage,emailid,pwd2;
    JTextField emailtxt1;
    JPasswordField pwdtxt2;
    JButton Login,Exit;
    String query1 = "select * from Registration";
    String url="jdbc:sqlserver://localhost:1433;databaseName=Abhishek";
    String user="sa";
    String pw="sasa";
    public Login()
    {
        
        LoginPage = new JLabel("LoginPage");
        LoginPage.setBounds(200,80,400,20);
        LoginPage.setFont(new Font("Calbri",Font.BOLD,24));
        add(LoginPage);
        
        emailid = new JLabel("EmailId:");
        emailid.setBounds(120,140,200,20);
        emailid.setFont(new Font("Calbri",Font.BOLD,18));
        add(emailid);
        
        emailtxt1 = new JTextField();
        emailtxt1.setBounds(240,140,200,35);
        emailtxt1.setFont(new Font("Arial",Font.BOLD,16));
        add(emailtxt1);
        
        pwd2 = new JLabel("Password");
        pwd2.setBounds(120,200,200,20);
        pwd2.setFont(new Font("Calbri",Font.BOLD,18));
        add(pwd2);
        
        pwdtxt2 = new JPasswordField();
        pwdtxt2.setBounds(240,200,200,30);
        pwdtxt2.setFont(new Font("Arial",Font.BOLD,16));
        add(pwdtxt2);
        
        Login = new JButton("Login");
        Login.setBounds(150,280,160,40);
        Login.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
        add(Login);
        
        Exit = new JButton("Exit");
        Exit.setBounds(400,280,160,40);
        Exit.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
        add(Exit);
        
        Login.addActionListener(new ActionListener() 
        {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                try
                {
                     Connection con = DriverManager.getConnection(url,user,pw);
                     PreparedStatement st1 = con.prepareStatement(query1);
                     ResultSet rs = st1.executeQuery();
                     boolean flag=false;
                     while(rs.next())
                     {
                         if(rs.getString("Emailid").equals(emailtxt1.getText()) && rs.getString("Password").equals(pwdtxt2.getText()))
                         {
                             flag=true;
                         }
                     }
                     if(flag==true)
                     {
                         JOptionPane.showMessageDialog(null,"Login Successfull");
                         new edit();
                     }
                     else
                     {
                         JOptionPane.showMessageDialog(null,"Incorrect Details");
                     }
                     
                }
                catch(SQLException l1)
                {
                    System.out.println(l1);
                }
            }
        });
        Exit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                new LoginJDBC();
            }
        });
        setTitle("Login");
        setSize(600,600);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

  
    
    
    
}
