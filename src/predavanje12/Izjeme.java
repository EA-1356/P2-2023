package predavanje12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author tomaz
 */
public class Izjeme {
  static Scanner odpriDatoteko(String imeDatoteke) throws FileNotFoundException {
    return new Scanner(new File(imeDatoteke));
  }
  
  public static void main(String[] args) throws Exception {
    // za obravnavo preverljivih izjem (metoda odpriDatoteko lahko sproži
    // preverljivo izjemo tipa FileNotFoundException) moramo napisati
    // try-catch blok.
    try {
      Scanner sc = odpriDatoteko("viri/besede.txt");
    } catch (FileNotFoundException e) {
      System.out.println("Napaka: " + e.toString());
    }
    
    // ker smo v glavo napisali  "throws Exception", lahko 
    // kličemo tudi brez try-catch bloka
    Scanner sc1 = odpriDatoteko("viri/a.txt");
  }
}
