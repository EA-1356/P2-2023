package si.fri.kodiranje.main;

/**
 * Hitri test pravilnosti delovanja metod za kodiranje.
 * 
 * @author tomaz
 */
public class TestKodiranje {
  
  /**
   * Niz, ki se uporablja v metodah za testiranje.
   */
  public static String niz = "To je dolgo besedilo, ki ga kodiram.";
  
  public static void main(String[] args) {
    niz = Kodirniki.kodirajB64(niz);
    System.out.println(niz);
    
    niz = Kodirniki.odkodirajB64(niz);
    System.out.println(niz);
  }
}
