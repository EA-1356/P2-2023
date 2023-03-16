package predavanje05;

/**
 *
 * @author tomaz
 */
public class Boxing {
  public static void main(String[] args) {
    Integer a;
    
    // klasika: v a shranim objekt tipa Integer
    a = new Integer(5);   
    
    // novo: v a shranim int (čeprav je a namenjena shranjevanju 
    // objektov tipa Integer). Java bo poskrbela za "boxing", to
    // je za "pretvorbo" iz int v Integer
    a = 5;
  }

}
