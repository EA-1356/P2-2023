package predavanje03;

import java.util.Scanner;

/**
 * Program bere ocene (dokler uporabnik ne vpise 0) in 
 * izpise povprecje prebranih ocen. 
 * @author tomaz
 */
public class Povprecje {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int trenutna=0; // trenutno vpisana ocena
    int vsota = 0; // vsota vseh prebranih ocen
    int n     = 0; // stevilo prebranih ocen
    
    do {
      System.out.print("Vpisi oceno: ");
      trenutna = sc.nextInt();
      
      // izlocim neveljavne ocene
      if (trenutna < 0 || trenutna > 10) {
        System.out.println("Neveljavna ocena!");
        continue; // nadaljuj z naslednjo iteracijo zanke
      } 
      
      if (trenutna != 0) {
        vsota = vsota + trenutna;
        n = n + 1;
      }
    } while (trenutna != 0);
    
    // pred deljenjem je treba vedno zagotoviti, da je imenovalec != 0
    if (n != 0) {
      // realno deljenje dveh celih stevil zagotovim na enega od dveh nacinov
      //double povprecje = 1.0*vsota / n;        
      double povprecje = (double)vsota / n;  
      System.out.printf("Povprecje vpisanih ocen: %.2f \n", povprecje);
    } else {
      System.out.println("Ni vpisanih ocen.");
    }
  }

}
