package predavanje03;

import java.util.Random;

/**
 * Izpis 7 nakljucnih stevil med 1 in 39
 * @author tomaz
 */
public class Loto {
  
  public static void main(String[] args) {
    // int seme = 12;
    // inicializacija generatorja s tocno dolocenim semenom
    // Random rnd = new Random(seme);
    
    // inicializacija generatorja brez dolocenega semena (seme bo generator izbral sam)
    Random rnd = new Random();
    
    for (int i = 0; i < 7; i = i + 1) {
      // ustvarim "nakljucno" stevilo med 1 in 39 ...
      int x = rnd.nextInt(39) + 1;
      // .. in ga izpisem
      System.out.print(x + " ");
    }
    System.out.println();
  }

}
