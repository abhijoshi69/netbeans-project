package loginjdbc;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;


public class edit extends JFrame
{
    JLabel welcome;
    JButton Edit,Delete;
    String reg,signup;
    String url="jdbc:sqlserver://localhost:1433;databaseName=Abhishek";
    String use="sa";
    String pwd3="sasa";
    String query1="Select * from Registration where Emailid=?";
    String query2="update Registration set Username=?,Password=?,Name=?,State=?,Gender=?,ContactNO=?,Emailid=? where Username=?";
    
    public edit()
    {
        Edit = new JButton("Edit");
        Edit.setBounds(120,140,170,40);
        Edit.setFont(new Font("Calbri",Font.BOLD,18));
        add(Edit);
        
        Edit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
            
                    new Update1();
        
            }
 });
}
}