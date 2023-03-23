package si.fri.kodiranje.main;

import si.fri.kodiranje.gui.KodiranjeOkno;
import si.fri.kodiranje.io.BeriPisi;

/**
 * Glavni program. Vsebuje metodo main() in metodo doKodiranje(), 
 * ki opravi glavno delo kodiranja.
 * 
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
  public static void doKodiranje(String nacin, String smer, String vhod, String izhod, String kljuc) throws Exception {
    // preberi datoteko iz diska
    String vsebina = BeriPisi.preberiDatoteko(vhod);
   
//    Namesto tega zaporedja if - else if - else if - else smo 
//    spodaj uporabili switch stavek
//    if (nacin.equals("XOR")) {
//      // ...
//    } else if (nacin.equals("NUM")) {
//      
//    } else if (nacin.equals("B64")) {
//      //... 
//    } else {
//      // default možnost
//    }
       
    // zakodiraj vsebino datoteke
    switch (nacin) {
      case "XOR":
        if (smer.equals("code"))
          vsebina=Kodirniki.kodirajXOR(vsebina, kljuc);
        else 
          vsebina=Kodirniki.odkodirajXOR(vsebina, kljuc);
        break;
      case "NUM":
        if (smer.equals("code"))
          vsebina=Kodirniki.kodirajNUM(vsebina);
        else 
          vsebina=Kodirniki.odkodirajNUM(vsebina);
        break;
      case "B64":
        if (smer.equals("code"))
          vsebina=Kodirniki.kodirajB64(vsebina);
        else 
          vsebina=Kodirniki.odkodirajB64(vsebina);
        break;
    }
      
    // zapisi zakodirano vsebino datoteko na disk
    BeriPisi.zapisiVDatoteko(izhod, vsebina);
  }
 
  public static void main(String[] args) throws Exception {
    
    // ce imam argumente, jih preberem in klicem doKodiranje() ...
    if (args.length >= 4) { // brez grafike
      String nacin = args[0];  
      String smer  = args[1];
      String vhod  = args[2];
      String izhod = args[3];
      String kljuc = args.length > 4 ? args[4] : ""; 
      
      doKodiranje(nacin, smer, vhod, izhod, kljuc);
      
      
    } else { 
      // ... sicer odprem grafično okno, metoda doKodiranje se bo klicala 
      // ob pritisku na gumb "Kodiraj / Odkodiraj" v oknu
      KodiranjeOkno.prikaziOkno();
    }
  }
}
