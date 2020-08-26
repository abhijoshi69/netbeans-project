package datademo;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
public class confirmation extends JFrame 
{
    JLabel emailid,password,confirmpwd,confirmation;
    JTextField emailidtxt;
    JPasswordField passwordtxt,confirmpwdtxt;
    String confirm;
    JButton submit,reset;
    public confirmation()
    {
        confirm="<html><u>Confirmation Page</u></html>";
        confirmation = new JLabel(confirm);
        confirmation.setBounds(160,60,500,40);
        confirmation.setFont(new Font("Arial",Font.BOLD,35));
        confirmation.setForeground(new Color(38,50,56));
        add(confirmation);
        
        emailid = new JLabel("Email ID:");
        emailid.setBounds(120,140,150,30);
        emailid.setFont(new Font("Calbri",Font.BOLD,25));
        emailid.setForeground(new Color(26,35,126));
        add(emailid);
        
        emailidtxt = new JTextField();
        emailidtxt.setBounds(260,140,270,30);
        emailidtxt.setFont(new Font("Calbri",Font.BOLD,25));
        emailidtxt.setForeground(new Color(26,35,126));
        add(emailidtxt);
        
        password = new JLabel("Password:");
        password.setBounds(120,200,150,30);
        password.setFont(new Font("Calbri",Font.BOLD,25));
        password.setForeground(new Color(26,35,126));
        add(password);
        
        passwordtxt = new JPasswordField();
        passwordtxt.setBounds(260,200,270,30);
        passwordtxt.setFont(new Font("Calbri",Font.BOLD,25));
        passwordtxt.setForeground(new Color(26,35,126));
        add(passwordtxt);
        
        confirmpwd = new JLabel("Confirm Password:");
        confirmpwd.setBounds(20,260,300,30);
        confirmpwd.setFont(new Font("Calbri",Font.BOLD,25));
        confirmpwd.setForeground(new Color(26,35,126));
        add(confirmpwd);
        
        confirmpwdtxt = new JPasswordField();
        confirmpwdtxt.setBounds(260,260,270,30);
        confirmpwdtxt.setFont(new Font("Calbri",Font.BOLD,25));
        confirmpwdtxt.setForeground(new Color(26,35,126));
        add(confirmpwdtxt);
       
        reset = new JButton("Reset");
        reset.setBounds(400,340,200,30);
        reset.setFont(new Font("Arial",Font.BOLD,25));
        reset.setForeground(new Color(255,87,34));
        reset.setBackground(new Color(33,33,33));
        add(reset);
        
        reset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                emailidtxt.setText("");
                passwordtxt.setText("");
                confirmpwdtxt.setText("");
            }
        });
        
        
        setSize(900,600);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
