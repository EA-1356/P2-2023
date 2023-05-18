package predavanje13;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author tomaz
 */
public class ClassDump {
  public static void main(String[] args) {
    String ime = "Argumenti.class";
    try (FileInputStream fis = new FileInputStream(new File(ime));
         DataInputStream dis = new DataInputStream(fis);)
    {
        byte[] magic = new byte[4];
        dis.read(magic);
        for (int i = 0; i < 4; i++) {
          System.out.printf("%X", magic[i]);
        }
        System.out.println("");
        

        // podatka o minor in major verziji jave sta z dvema bajtoma (short) 
        // zapisana takoj za magično številko         
        short minor = dis.readShort();
        short major = dis.readShort();
        
        System.out.println(major + "." + minor);
    } catch (Exception e) {
      System.out.println("Datoteka ne obstaja.");
    }
  }
}
