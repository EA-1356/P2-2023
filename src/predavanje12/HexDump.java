package predavanje12;

import java.io.File;
import java.io.FileInputStream;

/**
 * Izpis datoteke na podoben način, kot to naredi program hexdump
 * @author tomaz
 */
public class HexDump {

  public static void main(String[] args) {
    try {
      // odprem binarno datoteko ...
      FileInputStream fis = new FileInputStream(new File("viri/zaba.jpg"));
      int s=0;
      
      String znaki = "";
      // ... dokler ima datoteka še vsebino ...
      while (fis.available() > 0) {
        // ... berem znak po znaku ...
        int z = fis.read();s++;
        
        znaki += (z >=32 && z<=127) ? (char) z : ".";
        
        System.out.printf("%02X ", z);
        if (s%8  == 0) System.out.print("  ");
        if (s%16 == 0) {
          System.out.println("   |" + znaki+"|");
          znaki="";
        }
      }
      // ... in na koncu zaprem
      fis.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e.toString());
    }
    
    
  }
}
