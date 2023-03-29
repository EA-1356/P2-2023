package si.fri.kodiranje.main;

import java.util.Scanner;
import org.apache.commons.codec.binary.Base64;

/**
 * Razred z metodami za kodiranje in odkodiranje besedila. 
 * @author tomaz
 */
public class Kodirniki {
  /**
   * Kodiranje z metodo XOR.
   */
   public static String kodirajXOR  (String vsebina, String kljuc) {
    StringBuilder result = new StringBuilder();
    int dolzinaGesla = kljuc.length();
    
    for (int i = 0; i < vsebina.length(); i++) {
      // i-ti znak besedila moramo zakodirati z i-tim znakom kljuca; ker
      // je kljuc praviloma krajši od besedila, pri kljuci namesto charAt(i)
      // uporabimo charAt(i % dolzinaGesla); na ta način vsak znak kljuca 
      // večkrat ponovno uporabimo.
      char novZnak = (char) (vsebina.charAt(i) ^ kljuc.charAt(i % dolzinaGesla));
      result.append(novZnak);
    }
    return result.toString();
  };
  /**
   * Dekodiranje z metodo XOR.
   */
  public static String odkodirajXOR(String vsebina, String kljuc) {
    return kodirajXOR(vsebina,kljuc);
  };
  
  /**
   * "Zakodira" vsebino tako, da vsak znak spremeni v njegovo ACSII kodo
   * Primer: "abc"  -> "97 98 99"
   */
  public static String kodirajNUM  (String vsebina) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < vsebina.length(); i++) {
      int z = (int) vsebina.charAt(i);
      
      if (!result.isEmpty()) 
        result.append(" ");
      result.append(z);
    }
    return result.toString();
  };
  
  
  /**
   * "Odkodira" vsebino tako, da vsako številko spremeni v znak
   * Primer: "97 98 99" -> "abc"
   */
  public static String odkodirajNUM(String vsebina) {
    Scanner sc = new Scanner(vsebina);
    String result = "";
    while (sc.hasNextInt()) {
      int z = sc.nextInt();
      result += (char)z;  
    }
    return result;
  };
  
  /**
   * "Zakodira" po metodi Base64; za kodiranje uporabimo metodo
   * encodeBase64String(), ki je definirana v razredu Base64; ta razred ni 
   * del standardne jave, zato smo ga "uvozili" iz knjižnice 
   * org.apache.commons.codec, ki smo jo dobili tu:
   *   https://commons.apache.org/proper/commons-codec/
   * <br>
   * Opomba: nove verzije jave imajo base64 kodiranje že vgrajeno v standardno
   * knjižnico, zato bi kodiranje lahko izvedli brez uvoda zunanje knjižnice; 
   * kljub temu smo knjiznico commons-codec uvozili v demonstracijske namene 
   * (da pokažemo, kako bi to naredili, če java ne bi imela take metode). 
   */
  public static String kodirajB64  (String vsebina) {
    return Base64.encodeBase64String(vsebina.getBytes());
  };
  public static String odkodirajB64(String vsebina) {
    return new String(Base64.decodeBase64(vsebina));
  };

  

}
