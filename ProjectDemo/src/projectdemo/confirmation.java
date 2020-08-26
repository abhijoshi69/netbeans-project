package projectdemo;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class confirmation extends JFrame 
{
    JLabel username,emailid,confirmpwd,password,confirm;
    JTextField usernametxt,emailidtxt;
    JPasswordField confirmpwdtxt,passwordtxt;
    JButton Submit,Reset;
    String confirm1;
    public confirmation()
    {
        confirm1 = "<html><u>Confirmation Page</u></html>";
        confirm = new JLabel(confirm1);
        confirm.setBounds(550,50,500,60);
        confirm.setFont(new Font("Nexa Rust",Font.BOLD,45));
        confirm.setForeground(new Color(96,125,139));
        add(confirm);
        
        username = new JLabel("Username:");
        username.setBounds(430,130,300,35);
        username.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        username.setForeground(new Color(255,109,0));
        add(username);
        
        usernametxt = new JTextField();
        usernametxt.setBounds(680,130,330,35);
        usernametxt.setFont(new Font("Times New Roman",Font.BOLD,30));
        usernametxt.setForeground(new Color(6,35,126));
        add(usernametxt);
        
        emailid = new JLabel("Email ID:");
        emailid.setBounds(430,190,300,35);
        emailid.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        emailid.setForeground(new Color(255,109,0));
        add(emailid);
        
        emailidtxt = new JTextField();
        emailidtxt.setBounds(680,190,330,35);
        emailidtxt.setFont(new Font("Times New Roman",Font.BOLD,30));
        emailidtxt.setForeground(new Color(26,35,126));
        add(emailidtxt);
        
        confirmpwd = new JLabel("Confirm Password:");
        confirmpwd.setBounds(400,250,300,35);
        confirmpwd.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        confirmpwd.setForeground(new Color(255,109,0));
        add(confirmpwd);
        
        confirmpwdtxt = new JPasswordField();
        confirmpwdtxt.setBounds(680,250,330,35);
        confirmpwdtxt.setFont(new Font("Times New Roman",Font.BOLD,30));
        confirmpwdtxt.setForeground(new Color(26,35,126));
        add(confirmpwdtxt);
        
        password = new JLabel("Password:");
        password.setBounds(430,310,300,35);
        password.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        password.setForeground(new Color(255,109,0));
        add(password);
        
        passwordtxt = new JPasswordField();
        passwordtxt.setBounds(680,310,330,35);
        passwordtxt.setFont(new Font("Times New Roman",Font.BOLD,30));
        passwordtxt.setForeground(new Color(26,35,126));
        add(passwordtxt);
        
        Submit = new JButton("SUBMIT");
        Submit.setBounds(500,370,200,40);
        Submit.setFont(new Font("",Font.BOLD,30));
        Submit.setForeground(new Color(255,255,0));
        Submit.setBackground(new Color(38,50,56));
        add(Submit);
        
        
        Reset = new JButton("RESET");
        Reset.setBounds(800,370,200,40);
        Reset.setFont(new Font("",Font.BOLD,30));
        Reset.setForeground(new Color(255,255,0));
        Reset.setBackground(new Color(38,50,56));
        add(Reset);
        
        Reset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                usernametxt.setText("");
                emailidtxt.setText("");
                confirmpwdtxt.setText("");
                passwordtxt.setText("");
            }
        });
        
        Submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new ProjectDemo();
            }
        });
        
        setSize(1200,600);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}
