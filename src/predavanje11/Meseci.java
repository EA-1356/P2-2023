package predavanje11;

import java.util.*;

/**
 * 
 * @author tomaz
 */
public class Meseci {
  
  public static void main(String[] args) {
    // slovar mesecev (ključ=ime_meseca, vrednost=stevilo_dni_v_mesecu)
    Map<String,Integer> meseci = new TreeMap();
    
    meseci.put("Januar", 31);
    meseci.put("Februar",28 );
    meseci.put("Marec", 31);
    meseci.put("April", 30);
    meseci.put("Maj",   31);
    meseci.put("Junij", 30);
    meseci.put("Julij", 31);
    meseci.put("Avgust",31);
    
    meseci.put("Januar", 28);
     
    System.out.println(meseci.get("Julij"));
    
    // izpis vseh ključev (ime mesecev)
    Set kljuci = meseci.keySet();
    System.out.println(kljuci);
    
    // izpis vseh parov: ime_meseca - stevilo_dni
    for(String mesec : meseci.keySet()) {
      System.out.printf("%s - %d \n", mesec, meseci.get(mesec));
    }
    
    for (Integer d : meseci.values()) {
      System.out.println(d);
    }
  }

}
