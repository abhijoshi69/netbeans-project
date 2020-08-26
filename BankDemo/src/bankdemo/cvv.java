
package bankdemo;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class cvv extends JFrame
{
    JLabel cvv;
    JPasswordField cvvtxt;
    JButton submit,clear;
    String query1="select * from credential"; 
    String url="jdbc:sqlserver://localhost:1433;databaseName=Abhishek";
    String user="sa";
    String password="sasa";
    public cvv()
    {
        cvv = new JLabel("CVV");
        cvv.setBounds(150,120,200,30);
        cvv.setFont(new Font("Calbri",Font.BOLD,18));
        add(cvv);
        
        cvvtxt = new JPasswordField();
        cvvtxt.setBounds(400,120,200,35);
        cvvtxt.setFont(new Font("Calbri",Font.BOLD,18));
        add(cvvtxt);
        
        submit = new JButton("Submit");
        submit.setBounds(200,180,200,30);
        submit.setFont(new Font("Arial",Font.BOLD,20));
        add(submit);
        
        clear = new JButton("Clear");
        clear.setBounds(450,180,200,30);
        clear.setFont(new Font("Arial",Font.BOLD,20));
        add(clear);
        
        clear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                cvvtxt.setText("");
            }
        });
        
        submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                try
                {
                    Connection conn = DriverManager.getConnection(url,user,password);
                    PreparedStatement st1 = conn.prepareStatement(query1);
                    ResultSet rs = st1.executeQuery();
                    boolean flag=false;
                    while(rs.next())
                    {
                        if(rs.getString("CVV").equals(cvvtxt.getText()))
                        {
                            flag=true;
                        }
                    }
                    if(flag==true)
                    {
                        JOptionPane.showMessageDialog(cvvtxt,"Login Successfull");
                    }
                }
                catch(SQLException l)
                {
                    System.out.println(l);
                }
                
            }
        });
        setSize(600,600);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }
    public static void main(String [] agrs)
    {
        cvv c1 = new cvv();
        
    }
    
    
}
