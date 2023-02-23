/**
 *
 * @author tomaz
 */
public class Argumenti {
  
  /*
   *  Program najprej preveri število prejetih argumentov.  
   *  Če ni prejel nobenega argumenta, javi napako in konča,
   *  če pa prejme en ali več argumentov, izpiše najprej 
   *  število vseh arguementov, nato še vsak argument posebej. 
  */
  public static void main(String[] args) {
    if (args.length==0) {
      System.out.println("Napaka!");
      System.exit(0);
    }
    
    System.out.println("Stevilo podanih argumentov: "+ args.length);
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
  }
}
