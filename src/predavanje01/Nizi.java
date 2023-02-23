package predavanje01;

/**
 * Prikaz delovanja osnovnih funkcij za delo z 
 * nizom (length() in charAt()).
 * 
 * @author tomaz
 */
public class Nizi {
  public static void main(String[] args) {
    String niz = "Danes je četrtek";
    
    // Izpis dolžine niza
    // System.out.println(length(niz)); // to ni OK!!!
    System.out.println(niz.length());
    
    //Izpis prvega znaka niza
    // System.out.println(niz[0]); // to ni OK
    System.out.println(niz.charAt(0));
  }

}
