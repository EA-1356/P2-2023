package predavanje11;

import java.util.ArrayList;

/**
 *
 * @author tomaz
 */
public class ArrayListTest {
  public static void main(String[] args) {
    // Seznam imen (ime je tipa String)
    ArrayList<String> imena = new ArrayList();
    
    imena.add("Cilka");
    imena.add("Berta");
    imena.add("Cvetka");
    imena.add("Žiga");
    imena.add("Zala");
    imena.add("Ana");
    
    System.out.println("---- klasicna for zanka ---");
    for (int i = 0; i < imena.size(); i++) {
      System.out.println(imena.get(i));
    }
    
    // elementa, ki ni v seznamu, ne morem zbrisati; metoda vrne false
    imena.remove("Žala"); 
    
    System.out.println("---- for-each zanka ---");
    for(String ime : imena) {
      System.out.println(ime);
    }
    
    System.out.println("--------------------------");
    if (imena.contains("Anica")) System.out.println("Juhuhu!");
    
  }
}
