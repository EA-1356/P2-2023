package predavanje13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author tomaz
 */
public class Imenik {

  // pisanje objektov v datoteko
  public static void zapisiObjekte() {
    Oseba a = new Oseba("A", 10);
    Oseba b = new Oseba("B", 20);
    Oseba c = new Oseba("C", 30);
    Oseba d = new Oseba("D", 40);
    Oseba e = new Oseba("E", 50);
    
    try {
      FileOutputStream fis = new FileOutputStream(new File("viri/imenik.bin"));
      ObjectOutputStream oos = new ObjectOutputStream(fis);
      
      oos.writeObject(a);
      oos.writeObject(b);
      oos.writeObject(c);
      oos.writeObject(d);
      oos.writeObject(e);
      
      oos.close();
    } catch (Exception ex) {
      System.out.println("Napaka: " + ex.toString());
    }
  }
  
  // branje objektov iz datoteke
  static void preberiObjekt() {
    try (
      FileInputStream fis = new FileInputStream(new File("viri/imenik.bin"));
      ObjectInputStream ois = new ObjectInputStream(fis);
    ) {
      Oseba a = (Oseba) ois.readObject();
      Object b = ois.readObject();
      
      System.out.println(b.toString());
      
    } catch (Exception e) {}    
  }
  
  public static void main(String[] args) {
    preberiObjekt();
  }
}
