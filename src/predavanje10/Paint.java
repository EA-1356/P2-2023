package predavanje10;

import edu.princeton.cs.algs4.StdDraw;
import java.awt.Color;

/**
 *
 * @author tomaz
 */
public class Paint {
  
  final static int MAX_LIKI=10;  // maks. število likov
  
  public static void main(String[] args) {
    StdDraw.setScale(0,100);    
    
    Krog k = new Krog(50,50,10, Color.red);
    Krog k1 = new Krog(20,20,10, Color.green);  
    Pravokotnik p = new Pravokotnik(70, 30, 20,10, Color.yellow);
    Kvadrat kv = new Kvadrat(70, 70, 20, Color.blue);
  
    int stLikov = 0;
    Lik[] liki = new Lik[MAX_LIKI];  
    liki[stLikov++] = k;
    liki[stLikov++] = k1;
    liki[stLikov++] = p;
    liki[stLikov++] = kv;
  
    StdDraw.enableDoubleBuffering();
    while (true) {
      StdDraw.clear(Color.white);
      
      if (StdDraw.hasNextKeyTyped()) {
        char tipka = StdDraw.nextKeyTyped();
        // w ... gor, a .. levo, d .. desno, s .. dol
        switch(tipka) {
          case 'w':
            for (int i = 0; i < stLikov; i++) {
              if (liki[i].isOznacen())
                liki[i].premakniSe(0, 5);
            } 
            break;
          case 's':
            for (int i = 0; i < stLikov; i++) {
              if (liki[i].isOznacen())
                liki[i].premakniSe(0, -5);
            } 
            break;
          case 'a':
            for (int i = 0; i < stLikov; i++) {
              if (liki[i].isOznacen())
                liki[i].premakniSe(-5, 0);
            } 
            break;
          case 'd':
            for (int i = 0; i < stLikov; i++) {
              if (liki[i].isOznacen())
                liki[i].premakniSe(5,0);
            } 
            break;  
          case '+':
            for (int i = 0; i < stLikov; i++) {
              if (liki[i].isOznacen())
                liki[i].povecajSe(1.1);
            } 
            break;
          case '-':
            for (int i = 0; i < stLikov; i++) {
              if (liki[i].isOznacen())
                liki[i].povecajSe(0.9);
            } 
            break;           
        }
        if (tipka >='0' && tipka <='9') {
         for (int i = 0; i < stLikov; i++) 
            liki[i].setOznacen(false); 

          if (tipka-'0' < stLikov) liki[tipka-'0'].setOznacen(true);
        }
      }
    
      for (int i = 0; i < stLikov; i++) {
        liki[i].narisiSe();
      }   
      
      StdDraw.show();
      StdDraw.pause(100);
    }
      
  }

}
