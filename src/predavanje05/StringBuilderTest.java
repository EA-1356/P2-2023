package predavanje05;

/**
 * Primerjava hitrosti pri uporabi operatorja + (za "lepljenje"
 * nizov) v primerjavi z metodo append.
 * Razlika v hitrosti je očitna: lepljenje 300000 znakov 
 * z uporabo operatorje + traja več kot 5 sekund, uporaba 
 * metode append() za 1.000.000 pa manj kot sekundo. 
 * @author tomaz
 */
public class StringBuilderTest {
  
  public static void main(String[] args) {
    String a = "";
    long zacetek = System.currentTimeMillis();
    for (int i = 0; i < 300000; i++) {
      a = a + "a";
    }
    long trajanje = System.currentTimeMillis() - zacetek;
    System.out.printf("Lepljenje 300.000   nizov z uporabo Stringa: %.2f s\n", trajanje / 1000.0);
    
    zacetek = System.currentTimeMillis();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 10000000; i++) {
      sb.append("a");
    }
    trajanje = System.currentTimeMillis() - zacetek;
    System.out.printf("Lepljenje 1.000.000 nizov z uporabo StringBuilder: %.2f s\n", trajanje / 1000.0);
    
  }

}
