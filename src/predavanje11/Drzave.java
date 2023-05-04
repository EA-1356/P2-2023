package predavanje11;

import java.io.File;
import java.util.*;

/**
 * Iz datoteke "drzave.txt" preberem podatke o drzavah (kratica, glavno mesto, 
 * stevilo prebivalcev) in objekte tipa Drzava shranim v slovarju. Nato nad slovarjem
 * izvajam različne operacije.
 * 
 * @author tomaz
 */
public class Drzave {
  
  // Preberem datoteko in ustvarim slovar objektov tipa Drzava
  static Map<String, Drzava> preberiDrzave(String imeDatoteke) throws Exception {
    // ustvarim nov slovar ...
    Map<String, Drzava> drzave = new TreeMap();
    
    Scanner sc = new Scanner(new File(imeDatoteke));
    while(sc.hasNextLine()) {
      // preberem vrstico datoteke, jo "razbijem" po znaku ":"
      String vrstica = sc.nextLine();
      String[] deli = vrstica.split(":");
      if (deli.length == 3) { // ce je vrstica prave oblike, ustvarim drzavo
        Long p = Long.parseLong(deli[2]);  
        Drzava d = new Drzava(deli[0], deli[1], p);
        // ... vanj dodam objekt ....
        drzave.put(deli[0], d);
      }
    }
    sc.close();
    
    // ... in nan koncu slovar vrnem kot rezultat metode
    return drzave;
  }
  
  public static void main(String[] args) throws Exception {
    Map<String, Drzava> drzave = preberiDrzave("viri/drzave.txt");
    
    // izpis drzav s sprehodom po zbirki objektov tipa Drzava (values())
    for (Drzava d : drzave.values()) {
      System.out.println(d);
    }
    
    // izpis ene države; drzavo v slovarju najdem po kljucu
    System.out.println("--------------------");
    String drzava = "USA";
    if (drzave.get(drzava) == null) {
      System.out.println("Drzava " + drzava + " ne obstaja");
    } else
      System.out.println(drzave.get(drzava)); 
    
    // Izpis vseh drzav s pomocjo iteratorja po vrednostih
    System.out.println("----------  Izpis vseh drzav s pomocjo iteratorja po vrednostih --------");
    Iterator<Drzava> itD = drzave.values().iterator();
    while (itD.hasNext())
      System.out.println(itD.next());
    
    // Izpis vseh drzav s pomocjo iteratorja po kljucih
    System.out.println("----------  Izpis vseh drzav s pomocjo iteratorja po kljucih --------");
    Iterator<String> itK = drzave.keySet().iterator();
    while(itK.hasNext()) {
      String k = itK.next();
      System.out.printf("%s - %s \n", k, drzave.get(k)); 
    }
  }

}
