
package mapdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
class Users extends JFrame
{
    private int rollno;
    private String firstname;
    
    
    public Users(int rollno,String firstname)
    {
        this.rollno=rollno;
        this.firstname=firstname;
        
    }
    public int getrollno()
    {
        return this.rollno;
    }
    public String getfirstname()
    {
        return this.firstname;
    }
    
}

public class update extends JFrame
{   
   
    
            String query1="insert into student91 values(?,?,?)";
       
    public static TableModel toTableModel(Map map) 
    {
            DefaultTableModel model = new DefaultTableModel (
            new Object[] { "Key", "Value" }, 0
        );
        for (Iterator it = map.entrySet().iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry)it.next();
            model.addRow(new Object[] { entry.getKey(), entry.getValue() });
        }
        return model;
    }

}
        public static void main(String[]args)
        {
            HashMap <Integer,Users> hm = new HashMap <Integer,Users>();
            Users u;
           try
           {
               Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Abhishek","sa","sasa");
               PreparedStatement pt = conn.prepareStatement("select rollno,firstname from Student90");
               ResultSet rs = pt.executeQuery();
               while(rs.next())
               {
                   Integer rollno = rs.getInt("rollno");
                   String firstname = rs.getString("firstname");
                   u = new Users(rollno,firstname);
                   hm.put(rollno,u);
                   
               }
               
           }
           catch(SQLException l)
           {
               System.out.println(l);
           }
           for(Integer i : hm.keySet())
           {
               Users us = hm.get(i);
           }
           
            
            
        }
    
}
