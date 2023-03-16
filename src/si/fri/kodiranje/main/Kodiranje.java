package si.fri.kodiranje.main;

/**
 * Glavni program. Vsebuje metodo main() in metodo doKodiranje(), 
 * ki opravi glavno delo. 
 * @author tomaz
 */
public class Kodiranje {
  
  
  /**
   * Metoda prebere datoteko in jo zakodira/odkodira in izpise v iuhodno datoteko.
   * 
   * @param nacin  nacin kodiranja ("xor", "num", "b64")
   * @param smer   smer kodiranja  ("encode", "decode")
   * @param vhod   ime vhodne datotek
   * @param izhod  ime izhodne datoteke
   * @param kljuc  kljuc za xor kodiranje
   */
  static void doKodiranje(String nacin, String smer, String vhod, String izhod, String kljuc) {
    
  }
 
  public static void main(String[] args) {
    if (args.length >= 4) { // brez grafike
      String nacin = args[0];  
      String smer  = args[1];
      String vhod  = args[2];
      String izhod = args[3];
      String kljuc = args.length > 4 ? args[4] : ""; 
      
      doKodiranje(nacin, smer, vhod, izhod, kljuc);
      
      
    } else { // graficno okno
      
    }
  }

}
