
package udemo;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Udemo extends JFrame
{
    JTabbedPane obj;
    JMenu fileMenu,editMenu,exitMenu;
    JMenuItem itemNew,itemOpen,itemCopy,itemCut,itemPaste,itemClose;
    JMenuBar menubar;
    public Udemo()
    {
        obj = new JTabbedPane(JTabbedPane.BOTTOM);
        obj.addTab("Tab1",null);
        obj.addTab("Tab2",null);
        obj.setSize(200,100);
        this.add(obj);
        
        menubar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        exitMenu = new JMenu("Exit");
        
        itemNew = new JMenuItem("New");
        itemOpen = new JMenuItem("Open");
        itemCopy = new JMenuItem("Copy");
        itemCut = new JMenuItem("Cut");
        itemPaste = new JMenuItem("Paste");
        itemClose = new JMenuItem("Close");
        
        fileMenu.add(itemNew);
        fileMenu.add(itemOpen);
        editMenu.add(itemCopy);
        editMenu.add(itemCut);
        editMenu.add(itemPaste);
        exitMenu.add(itemClose);
        
        menubar.add(fileMenu);
        menubar.add(editMenu);
        menubar.add(exitMenu);
        
        setJMenuBar(menubar);
        setTitle("Udemo");
        setVisible(true);
        setSize(300,300);
               
        
    }

    
    public static void main(String[] args)
    {
        Udemo obj = new Udemo();
    }
    
}
