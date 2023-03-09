package predavanje04;

/**
 *
 * @author tomaz
 */
public class Biti {
  
  // Kateri biti so prizgani v stevilu x?
  // Stevilo premikam po bitih ("shiftam") v desno, dokler ne dobim 0;
  // na vsakem koraku (po vsakem shiftu) pogledam ali je zadnji bit prizgan;
  // ce je, povečam stevec števila prizganih bitov v stevilu x
  static int prestejBite(int x) {
    int biti = 0;
    while (x != 0) {
      // ali je zadnji bit prizgan?
      if ((x & 1) == 1) 
        biti++;
      
      // x po bitih premaknem v desno
      x = x >> 1;
    }
    return biti;
  }
  
  public static void main(String[] args) {
    int x = 31;
    
    int steviloBitov = prestejBite(x);
    
    System.out.printf("Stevilo prizganih bitov v stevilu %d je %d\n", x, steviloBitov);
  }

}
