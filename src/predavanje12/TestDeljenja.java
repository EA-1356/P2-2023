package predavanje12;

/**
 * Uporaba lastnega razreda za izjeme (DeljenjeZNic)
 * @author tomaz
 */
public class TestDeljenja {
  
  
  /**
   * Metoda preveri, ali je deljenje možno - če je, deli in vrne rezultat,
   * sicer ustvari in vrže novo izjemo tipa DeljenjeZNic
   */
  static double deli(double a, double b) throws DeljenjeZNic {
    if (b == 0) throw new DeljenjeZNic();
    
    return a/b;
  }
          
          
  public static void main(String[] args) {
    try {
      deli(5,0);
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }

}
