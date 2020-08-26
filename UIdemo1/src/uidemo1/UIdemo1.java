

package uidemo1;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class UIdemo1 extends JFrame
{
    JMenu fileMenu,editMenu,helpMenu;
    JMenuBar menubar;
    
    public UIdemo1()
    {
        menubar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");
        
        menubar.add(fileMenu);
        menubar.add(editMenu);
        menubar.add(helpMenu);
        
        setJMenuBar(menubar);
        setTitle("UIdemo1");
        setSize(300,300);
        setVisible(true);
    }
    
    

    public static void main(String[] args)
    {
        UIdemo1 obj = new UIdemo1();
      
      
    }
    
}
