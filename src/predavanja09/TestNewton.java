package predavanja09;

// Razsiritev razreda Funkcija - definiramo metodi
// vrednost in odvod tako, da funkcija ustreza 
// realni funkciji sinus.
class Sinus extends Funkcija {
  double vrednost(double x) {
    return Math.sin(x);
  }
  
  double odvod(double x) {
    return Math.cos(x);
  }
}

/**
 * Testiranje uporabe metode nicla() iz razreda Newton.
 * @author tomaz
 */
public class TestNewton {
  public static void main(String[] args) {
    Funkcija f = new Sinus(); 
    
    // izračun priblizka nicle v dveh korakih (n=2)
    double x = Newton.nicla(3, f, 2);
    System.out.println(x);
    System.out.println(Math.PI);
  }
}
