package predavanje01;

/**
 * Izpis statistike niza.
 * 
 * @author tomaz
 */
public class StatistikaNiza {
  public static void main(String[] args) {
    String niz = "Danes je lep dan!";
    System.out.println("Niz             : "     + niz);
    System.out.printf ("Prva crka       : %c\n", niz.charAt(0));
    System.out.printf ("Zadnja crka     : %c\n", niz.charAt(niz.length()-1));
    
    String nizBrez = niz.replaceAll(" ", "");
    System.out.printf ("Brez presledkov : %s\n", nizBrez);
    
    int steviloBesed = niz.length() - nizBrez.length() + 1;
    System.out.printf ("Stevilo besed   : %d\n", steviloBesed);
    
    System.out.printf ("Obrnjen niz     : ");
    for(int i = niz.length()-1; i >= 0; i = i - 1) {
      System.out.print(niz.charAt(i)); 
    }
    System.out.println();
  }
}
