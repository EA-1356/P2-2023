package predavanje11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Če želim elemente razred Oseba med seboj primerjati po dodatnem kriteriju 
// (torej ne po tistem, ki je zapisan v razredu z matodo compareTo),
// lahko ustvarim nov razred-primerjalnik; ta razred mora implemenmtirati
// vmesnik Comparator in metodo compare()
class MojPrimerjalnik implements Comparator<Oseba> {
  @Override
  public int compare(Oseba o1, Oseba o2) {
      // osebe primerjam po starosti; enako stare oseba pa še dodatno po imenu
      if (o1.starost == o2.starost)
      return o1.ime.compareTo(o2.ime);
    else 
      return o1.starost - o2.starost;   
  }
}

/**
 * Najprej ustvarim seznam (ArrayList) oseb, nato elemente uredim (po 
 * različnih kriterijih) in izpišem na zaslon.
 * @author tomaz
 */
public class Imenik {
  
  public static void main(String[] args) {
    ArrayList<Oseba> osebe = new ArrayList();
    
    osebe.add(new Oseba("Cilka", 25));
    osebe.add(new Oseba("Berta", 50));
    osebe.add(new Oseba("Danica",75));
    osebe.add(new Oseba("Gna", 18));
    osebe.add(new Oseba("Zna", 18));
    osebe.add(new Oseba("Ana", 18));
    
    // izpis neurejenih (urejeni po vrstnem redu, kot smo dodajali)
    System.out.println(osebe);
    
    // urejanje s privzetim primerjalnikom (metoda compareTo razreda Oseba)
    Collections.sort(osebe);
    System.out.println(osebe);
    
    // urejanje z dodatnim primerjalnimok (razred MojPrimerjalnik, metoda compare)
    osebe.sort(new MojPrimerjalnik());
    System.out.println(osebe);
  }

}
