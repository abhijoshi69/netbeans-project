
package uidmoe;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class UIdmoe extends JFrame
{
    JFrame menuFrame;
    JMenu fileMenu,editMenu,exitMenu;
    JMenuItem itemNew,itemOpen,itemCopy,itemCut,itemPaste,itemClose;
    JMenuBar menubar;
    public UIdmoe()
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
        
        setJMenuBar(menubar);
        setTitle("UIdmoe");
        setVisible(true);
        setSize(300,300);
    }

    public static void main(String[] args) 
    {
        UIdmoe obj = new UIdmoe();
      
    }
    
}
