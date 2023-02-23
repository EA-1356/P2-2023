package predavanje01;

/**
 *
 * @author tomaz
 */
public class Tabela {
  public static void main(String [] args) {
    String[] besede = new String[5]; // ustvarim tabelo velikost 5 za shranjevanje nizov
    besede[0] = "PON";
    besede[1] = "TOR";
    besede[2] = "SRE";
    besede[3] = "ČET";
    besede[4] = "PET";
    // besede[5] = "SOB";

    for(int i=0; i < besede.length; i = i + 1) {
      System.out.println(besede[i]);
    }
    
  }
}
