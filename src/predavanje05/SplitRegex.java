package predavanje05;

/**
 *
 * @author tomaz
 */
public class SplitRegex {
  
  public static void main(String[] args) {
    String a = "prva.druga.tretja";
    // za "razbijanje" po piki uporabim "[.]"
    String[] deli = a.split("[.]");
    for (int i = 0; i < deli.length; i++) {
      System.out.println(deli[i]);
    }
    
    String b = "x   y          z";
    // za "razbijanje" po "enem ali več presledkov" uporabim " +"
    String[] deli1 = b.split(" +");
    for (int i = 0; i < deli1.length; i++) {
      System.out.println(deli1[i]);
    }
  }

}
