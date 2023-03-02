package predavanje03;

import java.util.Scanner;

/**
 * Preberem ime in starost uporabnika in izpisem pozdrav.
 * @author tomaz
 */
public class Uporabnik {
  
  public static void main(String[] args) {
    // povezem se s tipkovnico
    Scanner tipkovnica = new Scanner(System.in);
    
    String ime;
    System.out.print("Vpisi svoje ime: ");
    ime = tipkovnica.next();
    
    int starost;
    System.out.print("Vpisi starost: ");
    starost = tipkovnica.nextInt();
    
    System.out.printf("Pozdravljen, %s, ki si star %d let.\n", ime, starost);
  }

}
