package predavanje03;

/**
 * Program sesteje stevili, ki sta podani v prvem in drugem argumentu
 * @author tomaz
 */
public class Racunalo {

  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Uporaba: java racunalo x y");
      System.exit(0);
    }
    
    // spodnji printf izpise "staknjene" nize (string+string); primer: ob klicu 
    // java Racunalo 5 7, bi izpisalo: 5 + 7 = 57
    //System.out.printf("%s + %s = %s\n", args[0], args[1], args[0]+args[1]);
    
      // če bi predpostavili, da so argumenti cela stevila
//    int x = Integer.parseInt(args[0]);
//    int y = Integer.parseInt(args[1]);
//    System.out.printf("%d + %d = %d\n", x, y, x+y);
    
    // ce dovolimo tudi realna stevila, moramo uporabiti Double.parseDouble
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);
    System.out.printf("%.2f + %.2f = %.2f\n", x,y, x+y);
    
    // ce bi zeleli argumente izpisati natanko tako (s takim stevilom 
    // decimalnih mest), kot so bili podani ob klicu programa
    System.out.printf("%s + %s = %.2f\n", args[0].replace(".",","), args[1].replace(".",","), x+y);
    
  }
}
