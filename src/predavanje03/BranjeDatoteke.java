package predavanje03;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author tomaz
 */
public class BranjeDatoteke {
  
  // Ce v metodi delam kaj "nevarnega" (na primer branje iz datoteke), moram
  // v glavo metode dodati "throws Exception" (sicer se program ne prevede).
  // O boljsih resitvah te težave se bomo pogovarjali
  // kasneje, do takrat pa uporabljamo ta nacin. 
  public static void main(String[] args) throws Exception {
    // odpiranje s prvim argumentom
    // Scanner sc = new Scanner(new File(args[0]));
    
    // odpiranje s podanim imenom
    Scanner sc = new Scanner(new File("viri/bitcoin.txt"));
    
    // Brali bomo vrstico po vrstici, dokler ne bomo prisli do konca datoteke.
    while (sc.hasNextLine()) {
      String vrstica = sc.nextLine();
      System.out.println(vrstica);
    }
    // datoteko zaprem
    sc.close();
  }
}
