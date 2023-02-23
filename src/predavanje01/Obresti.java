package predavanje01;

/**
 * Program za racunanje obresti.
 * @author tomaz
 */
public class Obresti {

  public static void main(String[] args) {
    double glavnica = 1000.0;  // glavnica   (realno število)
    int    n        = 10;      // stevilo let vezave (celo stevilo)
    double p        = 5;       // letna obrestna mera
    
    double vrednost = glavnica * Math.pow(1 + p/100, n);
    
    // System.out.println("Vrednost po " + n + " letih: " + vrednost); // tudi ta izpis je OK
    System.out.printf("Vrednost po %d letih: %.2f \n",n, vrednost);    // ta pa je boljši
  }
}
