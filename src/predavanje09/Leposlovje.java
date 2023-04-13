package predavanje09;

/**
 * Iz razreda Knjiga izpeljani razred, ki ima poleg podedovanih atributov 
 * in metod dodane lastne atribute (stMnenj in mnenja) ter metode (dodajMnenje) in
 * implementirano abstraktno metodo getPodrobnosti().

 * @author tomaz
 */
public class Leposlovje extends Knjiga {
  private static int MAX_MNENJ = 10; // maksimalno stevilo mnenj
  
  int stMnenj;   // stevilo vpisov v tabeli index
  String[] mnenja;

  public Leposlovje() {}
  
  
  
  Leposlovje(String avtor, String naslov, int letoIzdaje) {
    super(avtor, naslov, letoIzdaje);
    
    mnenja = new String[MAX_MNENJ];
    stMnenj = 0;
  } 
  
  void dodajMnenje(String mnenje) {
    if (stMnenj < MAX_MNENJ)
      this.mnenja[this.stMnenj++] = mnenje;
  }
  
 @Override
  String getPodrobnosti() {
    StringBuffer podrobnosti = new StringBuffer();
    podrobnosti.append("Mnenja bralcev: \n");
    for (int i = 0; i < this.stMnenj; i++) {
      podrobnosti.append(mnenja[i] + "\n");
    }
    return podrobnosti.toString();
  }  
}
