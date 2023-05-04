package predavanje11;

import java.util.*;

/**
 * Demonstracija uporabe podatkovne strukture "množica".
 * 
 * @author tomaz
 */
public class Dnevi {
  
  public static void main(String[] args) {
    // elementi množice so nizi (<String>)
    Set<String> dnevi = new HashSet();  // množica dni v tednu
    
    dnevi.add("PON");
    dnevi.add("TOR");
    dnevi.add("SRE");
    dnevi.add("CET");
    dnevi.add("PET");
    dnevi.add("SO");
    dnevi.add("NE");
    dnevi.add("TOR"); // element lahko dodamo le enkrat; če ča dodam večkrat
    dnevi.add("TOR"); // se podatkovna struktura ne spremeni 
    
    //dnevi.size() ... število elementov množice
     System.out.println(dnevi.size());
    
    // ce pobrisem "TOR", se ta v celoti odstrani iz mnozice 
    // (kljub temu, da sem ga v množico dodal večkrat)
    dnevi.remove("TOR");
    System.out.println(dnevi.size());
    
    System.out.println(dnevi.contains("PON"));
    System.out.println(dnevi.contains("TOR"));
    
    System.out.println("-------ITERATOR -----------------");
    // za "sprehod" po elementih lahko uporabim iterator ...
    Iterator<String> it = dnevi.iterator();
    while (it.hasNext()) {
      String dan = it.next();
      if (dan.equals("PET"))
        it.remove();
      
      System.out.println(dan);
    }
    
    System.out.println("------- zanka FOR-EACH  -----------------");
    // ... ali zanko for-each 
    for(String dan : dnevi) {
      System.out.println(dan);
      if (dan.equals("PON"))
        dnevi.remove(dan);
    }
  }

}
