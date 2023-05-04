package predavanje11;

/**
 * Razred z dvema atributoma (ime in starost).
 * Razred implementira Comparable (t.j. ima napisano metodo compareTo),
 * zato lahko zbirke objektov rega razred urejamo v vgrajenimi javanskimi 
 * metodami sort().
 * 
 * @author tomaz
 */
public class Oseba implements Comparable<Oseba> { 
    String ime;
    int starost;

  public Oseba(String ime, int starost) {
    this.ime = ime;
    this.starost = starost;
  }

  @Override
  public String toString() {
    return this.ime + "-" + this.starost; 
  }

  @Override
  // Metoda compareTo primerja dva objekta (this in o) in vrne:
  // <0 (recimo -1) če je this manjši od o
  // >0 (recimo 1)  če je this večji od o
  //  0 če je this enak o
  public int compareTo(Oseba o) {
    // primerjava po starosti
    return this.starost - o.starost; 
    
    // primerjava po abecednem redu imen
    //return this.ime.compareTo(o.ime);
  }
}
