package predavanja09;

/**
 * Podrazred razreda Oseba z redefinirano metodo izpisi().
 * @author tomaz
 */
public class Clovek extends Oseba {
 
  void izpis() {
    super.izpis(); // klic metode izpisi v ocetu (v razredu Oseba)
    System.out.println("Ime cloveka: " + ime);
  }
}
