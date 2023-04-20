package predavanje10;

import java.util.HashSet;

/**
 * Primer uporabe množice (razred HashSet)
 * @author tomaz
 */
public class Mnozica {
  
  public static void main(String[] args) {
    HashSet<String> dnevi = new HashSet();
    
    dnevi.add("PON");
    dnevi.add("TOR");
    dnevi.add("PON");
    
    System.out.println(dnevi.size());
    System.out.println(dnevi.contains("SRE"));
  }

}
