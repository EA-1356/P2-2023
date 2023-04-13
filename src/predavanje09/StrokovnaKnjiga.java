package predavanje09;

/**
 * Iz razreda Knjiga izpeljani razred, ki ima poleg podedovanih atributov 
 * in metod dodane lastne atribute (stIdx in index) ter metode (dodajIndex) in
 * implementirano abstraktno metodo getPodrobnosti().
 * 
 * @author tomaz
 */
public class StrokovnaKnjiga extends Knjiga {
  private static int MAX_INDEX = 10; // maksimalno stevilo indeskov
  
  int stIdx;   // stevilo vpisov v tabeli index
  String[] index;

  public StrokovnaKnjiga() {}
  
  
  
  StrokovnaKnjiga(String avtor, String naslov, int letoIzdaje) {
    super(avtor, naslov, letoIzdaje);
    
    index = new String[MAX_INDEX];
    stIdx = 0;
  }
  
  void dodajIndex(String index) {
    if (stIdx < MAX_INDEX)
      this.index[this.stIdx++] = index;
  }

  @Override
  String getPodrobnosti() {
    StringBuffer podrobnosti = new StringBuffer();
    podrobnosti.append("INDEKS: \n");
    for (int i = 0; i < this.stIdx; i++) {
      podrobnosti.append(index[i] + "\n");
    }
    return podrobnosti.toString();
  }
  
  
}
