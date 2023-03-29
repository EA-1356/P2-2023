package predavanje07;

import java.io.File;

/**
 * Prikaz možnosti, ki jih ponuja razred File.
 * 
 * @author tomaz
 */
public class FileTest {
  
  public static void main(String[] args) {
    File f = new File("test.txt");
    System.out.println(f.exists());
    System.out.println("LENGTH: " + f.length());
    System.out.println("isDirectory: " + f.isDirectory());
    
    File f2 = new File("dist");
    System.out.println("f2 isDirectory: " + f2.isDirectory());
    
    f.delete();

    File f3 = new File("test/delo1/blabla");
    f3.mkdirs();
   
    File f4 = new File(".");
    String[] datoteke = f4.list();
    for(int i=0; i<datoteke.length; i++)
      System.out.println(datoteke[i]);
  }

}
