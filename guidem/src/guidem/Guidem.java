package guidem;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;

public class Guidem extends JFrame
{
   JPanel mb;
    JCheckBox c1,c2,c3;
    public Guidem()
    {
       mb = new JPanel();
        c1 = new JCheckBox("Music");
        c2 = new JCheckBox("Sports");
        c3 = new JCheckBox("Painting");
        
        mb.add(c1);
        mb.add(c2);
        mb.add(c3);
        setTitle("Guidem");
        setVisible(true);
        setSize(300,300);
        add(mb);
                
    }

  
   
    public static void main(String[] args) 
    {
        Guidem obj = new Guidem();
  
    }
    
}
