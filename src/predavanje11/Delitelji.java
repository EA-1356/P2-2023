package predavanje11;

import java.util.*;

/**
 * Izpis vseh deliteljev, ki a) delijo bodisi a bodisi b (unija deliteljev) 
 * in b) delijo a in hkrati delijo b (presek deliteljev).
 * 
 * @author tomaz
 */
public class Delitelji {

  // Metoda vrne množico vseh deliteljev števila x
  static Set<Integer> delitelji(int x) {
    Set<Integer> d = new TreeSet();
    for (int i = 1; i <= x/2; i++) {
      if (x % i == 0) d.add(i);
    }
    d.add(x);
    
    return d;
  }
  
  public static void main(String[] args) {
    int a = 42, b=570;
    Set<Integer> d1 = delitelji(a);
    System.out.printf("Delitelji stevila %d: %s\n", a, d1);
    
    Set<Integer> d2 = delitelji(b);
    System.out.printf("Delitelji stevila %d: %s\n", b, d2);
    
    Set<Integer> unija = new TreeSet(d1); // unija vsebuje vse elemente d1
    unija.addAll(d2);                     // dodam še elemente d2
    System.out.println(unija);
    
    Set<Integer> presek = new TreeSet(d1); // vsi elementi d1 ...
    presek.retainAll(d2);                  // ... in d2
    System.out.println(presek);
  }
}
