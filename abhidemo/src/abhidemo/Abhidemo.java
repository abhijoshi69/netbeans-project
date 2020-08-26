
package abhidemo;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JMenuItem;
import javax.swing.JCheckBox;

public class Abhidemo extends JFrame
{
    JMenuBar menubar;
    JPanel jp;
    JMenu fileMenu,editMenu,exitMenu;
    JMenuItem itemNew,itemOpen,itemCopy,itemCut,itemPaste,itemClose;
    JCheckBox c1,c2,c3;
    public Abhidemo()
    {
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
          jp = new JPanel();
        c1 = new JCheckBox("Music");
        c2 = new JCheckBox("Sports");
        c3 = new JCheckBox("Painting");
        jp.add(c1);
        jp.add(c2);
        jp.add(c3);
        add(menubar);
        setTitle("Abhidemo");
        setVisible(true);
        setSize(300,300);
        add(jp);
        
        
    }

   
    public static void main(String[] args)
    {
       Abhidemo obj = new Abhidemo();
    }
    
}
