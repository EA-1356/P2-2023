package si.fri.kodiranje.io;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Razred s pomoznimi metodami za branje in pisanje v tekstovno datoteko. 
 * 
 * @author tomaz
 */
public class BeriPisi {
  
  /**
   * Metoda prebere vsebino tekstovne datoteke in vrne njeno vsebino kot en niz
   */
  public static String preberiDatoteko(String imeDatoteke) throws Exception {
    Scanner sc = new Scanner(new File(imeDatoteke));
    StringBuilder vsebina = new StringBuilder();
    while (sc.hasNextLine()) {
      String vrstica = sc.nextLine();
      vsebina.append((vsebina.isEmpty() ? "" : "\n") + vrstica);
    }
    sc.close();
    return vsebina.toString();
  }
  
  /**
   * Metoda naredi isto kot preberiDatoteko().
   */
   static String preberiDatotekoOL(String imeDatoteke) throws Exception {
     return Files.readString(Path.of(imeDatoteke));
   }
 
  
  /**
   * Metoda zapise podano vsebino v tekstovno datoteko.
   * @param imeDatoteke ime datoteke v katero pišemo
   * @param vsebina vsebina, ki se bo zapisala
   */
  public static void zapisiVDatoteko(String imeDatoteke, String vsebina) throws Exception {
    PrintWriter pw = new PrintWriter(imeDatoteke);
    pw.print(vsebina);
    pw.close();
  }

}
