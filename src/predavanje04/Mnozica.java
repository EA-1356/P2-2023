package predavanje04;

/**
 * Program za delo z mnozico znakov.
 * V enem številu tipa int imam na razpolago 31 bitov, ki
 * jih lahko porabim za implementacijo množice: če je bit 
 * prizgan, je pripadajoci element v mnozici, sicer elementa 
 * ni v množici.
 * Ker ima angleska abecede 26 črk, imamo v int-u dovolj prostora,
 * da si zapomnimo, katere črke si v mnozici in katere ne.
 * 
 * Dogovor: bit 0 pripada crki 'a', bit 1 crki 'b', ..., bit 25 crki 'z'
 * 
 * @author tomaz
 */
public class Mnozica {
  // Preslikava med crko ('a', 'b', ...) in bitom, ki tej crki 
  // pripada (0, 1, 2, ...). Metoda vrne zaporedno stevilko bita:
  //   'a' -> 0, 'b' -> 1, 'c' -> 2, ... 'z' -> 25
  static int bitZnaka(char znak) {
    return znak - 'a';
  }

  // v prazni mnozici ni nobenega elementa (torej so vsi biti ugasnjeni)
  static int getPraznaMnožica() {
    return 0;
  }
  
  // element dodam  v mnozico tako, da prizgem bit, ki temu elementu pripada
  static int dodajElement(int mnozica, char znak) {
    // najprej ugotovim, kateri bit pripada temu znaku ...
    int i = bitZnaka(znak);
    
    // ... nato "prizgem" ta bit (i-ti bit) v mnozici
    mnozica = mnozica | (1<<i);
    
    return mnozica;
  }
  
  // po vrsti pregledam biti in za vsak prizgan bit v rezultat 
  // dodam znak, ki temu biti pripada
  // Primer: če so v množici znaki 'a', 'f' in 'z', metoda vrne niz "[a,f,z]".
  static String toString(int mnozica) {
    String result ="";
    int bit = 1;
    for(char c ='a'; c<='z'; c++) {
      if ((mnozica & bit) != 0)
        result = result + (result.isEmpty() ? "" : ",") + c;
      bit = bit << 1;
    }
    
    return "[" + result + "]";
  }
  
  // Presek dveh mnozic: v rezultatu obrdzim le tiste bite, 
  // ki so prizgani pri obeh mnozicah.
  static int presek(int m1, int m2) {
    return m1 & m2;
  }

  // Unija dveh mnozic: v rezultatu obrdzim vse tiste bite, 
  // ki so prizgani v vsaj eni od obeh mnozic.  
  static int unija(int m1, int m2) {
    return m1 | m2;
  }
  
  public static void main(String[] args) {
    int mnozica1 = getPraznaMnožica();
    mnozica1 = dodajElement(mnozica1, 'a');
    mnozica1 = dodajElement(mnozica1, 'e');
    mnozica1 = dodajElement(mnozica1, 'i');
    mnozica1 = dodajElement(mnozica1, 'z');
    System.out.printf("Mnozica1=%s\n", toString(mnozica1));

    int mnozica2 = getPraznaMnožica();
    mnozica2 = dodajElement(mnozica2, 'a');
    mnozica2 = dodajElement(mnozica2, 'f');
    mnozica2 = dodajElement(mnozica2, 'z');
    mnozica2 = dodajElement(mnozica2, 'b');
    System.out.printf("Mnozica2=%s\n", toString(mnozica2));

    int presek = presek(mnozica1, mnozica2);
    int unija = unija(mnozica1, mnozica2);
    System.out.printf("presek(%s, %s)=%s\n",
            toString(mnozica1), toString(mnozica2), toString(presek));
   System.out.printf("unija (%s, %s)=%s\n",
            toString(mnozica1), toString(mnozica2), toString(unija));

  }
}
