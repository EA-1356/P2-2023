package predavanje05;

/**
 * @author tomaz
 */
public class DN04 {
  
  // pretvorba enega znaka iz dvojiskega v ASCII zapis. Primer: "01000001" -> 'A'
  static char odkodirajZnak(String crka) {
    int bit = 1, vrednost = 0;
    for (int i = crka.length()-1; i >= 0; i--) {
      vrednost += crka.charAt(i)== '1'  ? 1*bit : 0;     
      bit <<= 1;  // bit = bit << 1
    }
    return (char) vrednost;
  }
  
  // v metodi namesto String uporabim StringBuilder, saj se vrednost 
  // niza spreminja: namesto ascii += odkodirajZnak(crka) bom pisal
  // ascii.append(odkodirajZnak(crka));
  static String asciiSporocilo(String dvojiskoSporocilo) {
    //String ascii = "";
    StringBuilder ascii = new StringBuilder();
    
    while (dvojiskoSporocilo.length() > 7) {      
      String crka = dvojiskoSporocilo.substring(0,8);
      dvojiskoSporocilo = dvojiskoSporocilo.substring(8);
      //ascii += odkodirajZnak(crka);
      ascii.append(odkodirajZnak(crka));
    }
    //return ascii;
    return ascii.toString();
  }
  
  public static void main(String[] args) {   
    args = new String[]{"01011001011011110111010100"}; 
    
    if (args.length < 1) {      
      System.out.println("Napaka - program portebuje en argument!");
    } else {        
      System.out.println(asciiSporocilo(args[0]));        
    } 
  }
  
}
