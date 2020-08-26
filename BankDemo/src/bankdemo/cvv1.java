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
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class cvv1 extends JFrame
{   
    JLabel cvv1;
    JPasswordField cvvtxt1;
    JButton submit1,clear1;
    
    String query1="select cvv from debit";
    String url="jdbc:sqlserver://localhost:1433;databaseName=Abhishek";
    String user="sa";
    String password="sasa";
    public cvv1()
    {
        cvv1 = new JLabel("CVV");
        cvv1.setBounds(150,120,200,30);
        cvv1.setFont(new Font("Calbri",Font.BOLD,18));
        add(cvv1);
        
        cvvtxt1 = new JPasswordField();
        cvvtxt1.setBounds(400,120,200,35);
        cvvtxt1.setFont(new Font("Calbri",Font.BOLD,18));
        add(cvvtxt1);
        
        submit1 = new JButton("Submit");
        submit1.setBounds(200,180,200,30);
        submit1.setFont(new Font("Arial",Font.BOLD,20));
        add(submit1);
        
        clear1 = new JButton("Clear");
        clear1.setBounds(450,180,200,30);
        clear1.setFont(new Font("Arial",Font.BOLD,20));
        add(clear1);
        
        clear1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                cvvtxt1.setText(" ");
            }
        });
        
        submit1.addActionListener(new ActionListener() {

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
                        if(rs.getString("CVV").equals(cvvtxt1.getText()))
                        {
                            flag=true;
                        }
                    }
                    if(flag==true)
                    {
                        JOptionPane.showMessageDialog(cvvtxt1,"Login Successfull");
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
    
}
