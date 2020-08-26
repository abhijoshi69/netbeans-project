package uidemo;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
public class UIdemo extends JFrame
{
    JTabbedPane obj;
    public UIdemo()
    {
        obj = new JTabbedPane(JTabbedPane.BOTTOM);
        obj.addTab("Tab1",null);
        obj.addTab("Tab2",null);
        obj.setSize(100,200);
        
        this.setTitle("UIdemo");
        this.setVisible(true);
        this.setSize(300,300);
        this.add(obj);
    }
    
    public static void main(String[] args)
    {
        UIdemo obj = new UIdemo();
      
    }
    
}
