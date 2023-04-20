package predavanje10;

/**
 * Razred Polinom je razširitev abstraktnega razreda Funkcija.
 *
 * Polinom je opisan s tabelo koeficientov (ti se podajo ob klicu konstruktorja), 
 * vrednost polinoma in vrednost odvoda pa definirata istoimenski metodi
 * vrednost in odvod.
 * 
 * Ker razred uporabljemo samo v razredu TestNewton (glej spodaj) smo kodo razreda
 * pisali kar v datoteki TestNewton.java.  Druga možnost: kodo bi pisali v svoji datoteki
 * (Polinom.java), razred pa bi proglasili za public; potem bi razrad Polinom lahko
 * uporabljali v poljubnem drugem razredu.
 * 
 * @author tomaz
 */
class Polinom implements Funkcija {
  double koef[];
  
  Polinom(double koef[]) {
    this.koef = koef;
  }
  
  public double vrednost(double x) {
    double vrednost=0;
    double xx = 1;
    for (int i = 0; i < koef.length; i++) {
      vrednost += koef[i] * xx;
      xx = xx * x;
    }
    return vrednost;
  }
  
  public double odvod(double x) {
    double vrednost=0;
    double xx = 1;
    for (int i = 1; i < koef.length; i++) {
      vrednost += i * koef[i] * xx;
      xx = xx * x;
    }
    return vrednost;
  }
}

/**
 *
 * @author tomaz
 */
public class TestNewton {
  
  public static void main(String[] args) {
    // double nicla = predavanje09.Newton.nicla(-1, new Polinom(new double[]{6, -5, -2, 1}), 10);
    //System.out.println(nicla);
    
    // nicla funkcije Cos
    double nicla = Newton.nicla(0, new Funkcija() {       
      public double vrednost(double x) {
       return Math.cos(x);
      }
      public double odvod(double x) {
       return -Math.sin(x);
      }      
    }, 10 );
  }

}
