package predavanje14;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author tomaz
 */
public class FlowLayoutTest {
  public static void main(String[] args) {
    JFrame okno = new JFrame();
    okno.setSize(300,300);
    okno.setLocation(400,400);
    okno.setTitle("Flow layout test");
    
    JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    
    JButton gumb1 = new JButton("prvi");
    JButton gumb2 = new JButton("drugi");
    JButton gumb3 = new JButton("tretji");
    JButton gumb4 = new JButton("cetrti");
    JButton gumb5 = new JButton("peti");
    
    panel.add(gumb1);
    panel.add(gumb2);
    panel.add(gumb3);
    panel.add(gumb4);
    panel.add(gumb5);
    
    okno.add(panel);
    okno.setVisible(true); 
  }
}
