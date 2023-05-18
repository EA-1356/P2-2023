package predavanje13;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * Preberi velikost PNG slike. Sirina je zapisana na bajtih 16-19, 
 * višina pa na bajtih 20-23 (oboje v int obliki).
 * 
 * @author tomaz
 */
public class VelikostSlike {
  public static void main(String[] args) {
    String ime = "viri/medo.png";
    try (FileInputStream fis = new FileInputStream(new File(ime));
         DataInputStream dis = new DataInputStream(fis);)
    {
        byte[] prvaVrstica = new byte[16];
        dis.read(prvaVrstica);
        
        
        int w = dis.readInt();
        int h = dis.readInt();
        
        System.out.printf("%d x %d \n", w, h);
    } catch (Exception e) {
      
    }
  }
}
