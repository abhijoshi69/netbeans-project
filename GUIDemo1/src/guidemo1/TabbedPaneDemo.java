
package guidemo1;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class TabbedPaneDemo extends JDialog
{
  
    
    public TabbedPaneDemo()
    {
       JTabbedPane obj;
        obj = new JTabbedPane(JTabbedPane.Bottom);
      obj.addTab("Tab1",null);
      obj.addTab("Tab2",null);
      obj.setSize(100,100);
    }
    

    
    public static void main(String[] args)
    {
        GUIDemo1 obj = new GUIDemo1();
        
    }
    
}
