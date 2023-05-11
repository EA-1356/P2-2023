package predavanje12;

/**
 * Lastna (preverljiva) izjma
 * @author tomaz
 */
public class DeljenjeZNic  extends Exception {
  @Override
  public String getMessage() {
    return "Deljenje z nič";
  }
}
