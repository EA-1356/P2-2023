package predavanje05;

/**
 * Kratka rešitev DN04.  
 */
public class DN04a {

  public static void main(String[] args) {
    if (args.length > 0) {
      for (int i = 0; i < args[0].length(); i += 8) {
        System.out.print(
          (char) Integer.parseInt(args[0].substring(0 + i, 8 + i), 2));
      }
    }
  }
}
