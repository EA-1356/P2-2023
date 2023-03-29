
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author tomaz
 */
public class Risanje {

  /**
   * Izris 10 krogov s sreciščem v (0,0)
   */
  static void tarca() {
    StdDraw.setScale(-100, 100);
    StdDraw.clear(Color.black);
    StdDraw.setPenColor(Color.yellow);

    for (int i = 1; i <= 10; i++) {
      StdDraw.circle(0, 0, i * 10);
    }
  }

  /**
   * Izris mreže kvadratov (n x n) velikost s s presledkom p med njimi.
   * Kvadratki so spreminjajoče barve (barvo "namešamo" iz rdeče in zelene).
   */
  static void kvadratki() {
    int n = 25;  // stevilo kvadratkov v vsaki vrsti in stolpcu
    int s = 10;  // velikost posameznega kvadratka
    int p = 0;   // predsledak med kvadratki

    StdDraw.setScale(0, n * s + (n + 1) * p);
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        StdDraw.setPenColor(new Color(10 * i, 10 * j, 0));
        StdDraw.filledRectangle(p + i * (s + p) + s / 2, p + j * (s + p) + s / 2, s / 2, s / 2);
      }
    }
  }

  /**
   * Izris kvadratne spirale.
   */
  static void kvadratnaSpirala() {
    StdDraw.setScale(-100, 100);
    int pX = 0, pY = 0; // prejsnja x in y

    // smeri risanja:  dol     levo      gor    desno
    int[][] smeri = {{0, -1}, {-1, 0}, {0, 1}, {1, 0}};
    int trSmer = 0; // zacnemo v smeri dol
    
    int d = 3; // zacetna velikost črte; velikost v zanki povecujemo

    for (int i = 0;; i++) {
      int nX = pX + d * smeri[trSmer][0];
      int nY = pY + d * smeri[trSmer][1];

      StdDraw.line(pX, pY, nX, nY);

      trSmer = (trSmer + 1) % 4; // 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, ...
      d = d + 2;
      
      // risemo toliko casa, da je dolžina narisane črte
      // še znotraj zaslona, nato končamo
      if (d > 200) { 
        break;
      }

      pX = nX;
      pY = nY;
    }
  }

  static void spirala() {
    StdDraw.setScale(-100, 100);

    double pX = 0, pY = 0;
    int kot = 0;    // kot tocke
    double d = 1;   // oddaljenost točke od koordinatnega izhodisca

    for (int i = 0; i < 500; i++) {
      double kotR = 2 * Math.PI * kot / 360;
      double tX = d * Math.cos(kotR);
      double tY = d * Math.sin(kotR);
      
      if (pX != 0 && pY != 0)
       StdDraw.line(pX, pY, tX, tY);
      
      pX = tX;
      pY = tY;
      kot = kot + 5;  // ko ovecujemo kot, se "vrtimo v krogih"
      
      // povecevanje oddaljenosti od izhodišča - določa tip spirale
      //d = d * 1.01;   
      d = d + 0.2;      
      //d = 200 / Math.sqrt(kot);
      //d = 10000 / kot;
    }
  }

  // izris enega kazalca
  static void kazalec(int dolzina, double kot) {
    double kotR = 2 * Math.PI * kot / 360;
    StdDraw.line(0, 0, dolzina * Math.cos(kotR), dolzina * Math.sin(kotR));
  }

  static void radar() {
    StdDraw.setScale(-100, 100);
    StdDraw.setPenColor(Color.green);
    StdDraw.setPenRadius(0.02);
    
    // omogočim risanje v ozadju in hiter prikaz narisane vsebine
    // z ukazom show(); uporaba "double bufferinga" prepreči utripanje
    // pri hitrih animacijah
    StdDraw.enableDoubleBuffering();
    
    // dolocim način (format) prikaza ure 
    String vzorec = "HH:mm:ss";
    DateFormat df = new SimpleDateFormat(vzorec);

    int kot = 0;
    while (true) {
      // trenutno uro s pomočjo izbranega formata pretvorim v niz
      Date c = Calendar.getInstance().getTime();
      String ura = df.format(c);
      
      StdDraw.clear(Color.black);
      
      // izris ure (napake na predavanjih: uro smo izrisali tik pred ukazom clear(), ki jo je takoj pobrisal)
      StdDraw.text(-80, 80, ura);

      // izris krogov ...
      for (int i = 1; i <= 4; i++) {
        StdDraw.circle(0, 0, i * 20);
      }

      // ... in kazalca
      kazalec(85, kot);
      kot = kot + 1; // kot povečujem pri vsakem izrisu, da se kazalec vrti
      
      StdDraw.pause(100); 
      StdDraw.show();
    }
  }

  public static void main(String[] args) {
    //tarca();

    // kvadratki();
    // kvadratnaSpirala();
    //spirala();
    radar();
  }
}
