
package gdemo;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gdemo extends JFrame
{
    JPanel jPanel;
    JLabel firstname,lastname;
    public Gdemo()
    {
        jPanel = new JPanel();
        firstname = new JLabel("First Name");
        lastname = new JLabel("Last Name");
        jPanel.add(firstname);
        jPanel.add(lastname);
        setTitle("Gdemo");
        setVisible(true);
        setSize(300,300);
        add(jPanel);
    }

    
    public static void main(String[] args)
    {
      Gdemo obj = new Gdemo();
    }
    
}
