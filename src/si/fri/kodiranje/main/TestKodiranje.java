package si.fri.kodiranje.main;

/**
 * Hitri test pravilnosti delovanja metod za kodiranje.
 * 
 * @author tomaz
 */
public class TestKodiranje {
  public static void main(String[] args) {
    String niz = "To je dolgo besedilo, ki ga kodiram.";
    niz = Kodirniki.kodirajB64(niz);
    System.out.println(niz);
    
    niz = Kodirniki.odkodirajB64(niz);
    System.out.println(niz);
  }
}
