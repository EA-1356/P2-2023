package predavanje14;

import javax.swing.*;

/**
 *
 * @author tomaz
 */
public class Absolutno {
  
  public static void main(String[] args) {
    JFrame okno = new JFrame();
    okno.setSize(300,150);
    okno.setLocation(400,400);
    okno.setTitle("Imenik");
    
    JLabel napis = new JLabel("Ime");
    JButton gumb = new JButton("Išči");
    JTextField vpis = new JTextField();
    JTextArea polje = new JTextArea();
    
    okno.setLayout(null); // ne zelim razporejevalnika
    
    napis.setBounds(20,20,40,20);
    gumb.setBounds(220, 20, 75, 20);
    polje.setBounds(20,40, 260, 80);
    
    okno.add(polje);
    okno.add(gumb);
    okno.add(napis);
    okno.setVisible(true); 
  }

}
