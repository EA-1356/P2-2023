package predavanje03;

/**
 * Program pošteje, koliko besed v podani tabeli se začne 
 * na posamezno črke angleške abecede.
 * 
 * @author tomaz
 */
public class Stetje {
  
  static void postejPrveCrke(String[] besede) {
    // ko naredim tabelo, so v njej samo ničle
    int[] t = new int[26];
    
    // sprehod cez vse besede; pri vsaki besedi vzamem njeno
    // prvo crko in v tabeli t povecam stevec, ki steje
    // pojavitve te crke
    for (int i = 0; i < besede.length; i++) {
      char crka = besede[i].charAt(0);
      int indeksCrke = crka - 'a'; // 'a'-'a' = 0, 'b'-'a'=1, 'c'-'a'=2, ...
      t[indeksCrke] = t[indeksCrke] + 1;  
    }
    
    // izpis podatkov (stevcev) iz tabele t
    for (int i = 0; i < t.length; i++) {
      System.out.printf("Število besed na črko '%c': %d\n", (char)('a'+i), t[i] );
    }
  }
  
  public static void main(String[] args) {
      // ustvarim tabelo za 6 besed
//    String[] besede = new String[6];
//    besede[0] = "pomlad";
//    besede[1] = "jabolko";
//    besede[2] = "jesen";
//    besede[3] = "zima";
//    besede[4] = "lopar";
//    besede[5] = "bor";

    // ustvarim tabelo z besedami (krajši način)
    String[] besede = new String[] {
      "pomlad", "jabolko", "jesen", "zima", "lopar", "bor"    
    };
    
    postejPrveCrke(besede);
  }

}
