package predavanje01;

/**
 * Izpis tabele s cenami srečk.
 * @author tomaz
 */
public class Srecke {
  public static void main(String[] args) {
    // Za izpis v "angleškem formatu" (z decimalno piko namesto vejice)
    // uporabim ENGLIH lokalne nastavitve. Brez te nastavitve java uporabi
    // sistemsko privzete nastavitve.
    // Locale.setDefault(Locale.ENGLISH);
    
    double cena = 1.25;
    System.out.println("Stevilo sreck | Cena (EUR)");
    System.out.println("--------------------------");
    for(int i=1; i<11; i=i+1) {
      System.out.printf("%5d%9s| %5.2f\n", i,"", cena * i);
    }
  }

}
