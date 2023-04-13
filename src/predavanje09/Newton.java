package predavanje09;

/**
 * Razred definira metodo nicla(), ki s pomočjo znane Newtnove 
 * iteracijske metode izračuna približek ničle podane funkcije. 
 * @author tomaz
 */
public class Newton {
  static double nicla(double x0, Funkcija f, int n) {
    for (int i = 0; i < n; i++) {
      x0 = x0 - f.vrednost(x0) / f.odvod(x0);
    }
    return x0;
  }
}
