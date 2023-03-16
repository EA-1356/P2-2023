package predavanje05;

import java.io.File;
import java.util.Scanner;

/**
 * Preberem datoteko passwd in izpišem uporabniska imena 
 * (prvi podatek) in uid (tretji podatek) iz vsake vrstice.
 * 
 * @author tomaz
 */
public class Users {
  
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(new File("viri/passwd"));
    while (sc.hasNextLine()) {
      String vrstica = sc.nextLine();
      String[] deli = vrstica.split(":"); // ":" je regularni izraz
      System.out.printf("ime: %s, uid: %s\n", deli[0], deli[2]);
    }
    sc.close();
  }

}
