package predavanje12;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author tomaz
 */
public class TryWithResources implements Closeable {
  public void close() throws IOException {
    System.out.println("Juhuhu!");
  }
  
  
  public static void main(String[] args) {
    Scanner sc = null;
    try {
      // vse datoteke, ki jih odprem v try bloku ...
      sc = new Scanner(new File("viri/besede.txt"));
      
    } catch (FileNotFoundException e) {
      System.out.println("Datoteka ne obstaja");
    } finally {
      try {
        // ... moram v finally bloku zapreti!
        if (sc != null)
          sc.close();
      } catch (Exception e) {}
    }
    
    // try-with-resources: če datoteke odprem v () delu try bloka,
    // jih bo java sama zaprla (klicala bo njihove close() metode).
    try (
     Scanner vhod = new Scanner(new File("a.txt"));
     PrintWriter izhod = new PrintWriter("b.txt");
     TryWithResources twr = new TryWithResources();
    ) {
      
    } catch (Exception e) {
      ///...
    }    
  }

}
