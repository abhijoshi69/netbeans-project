
package gui;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Gui extends JFrame 
{
    JTabbedPane obj;
    public Gui()
    {
        obj = new JTabbedPane(JTabbedPane.BOTTOM);
        obj.add("Tab1",null);
        obj.add("Tab2",null);
        obj.setSize(300,200);
        
        this.setTitle("JTabbedPane Gui");
        this.setVisible(true);
        this.setSize(300,200);
        this.add(obj);
    
    }
        

    
    public static void main(String[] args) 
    {
        Gui obj = new Gui();
        
    }
    
}
