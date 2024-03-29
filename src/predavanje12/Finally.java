package predavanje12;

/**
 * Program v vsakem primeru (poleg ostalih besedil) izpiše tudi "C",
 * saj se ukaz za ta izpis nahaja v finally bloku (ta pa se vedno izvede).
 * @author tomaz
 */
public class Finally {

  public static void main(String[] args) {
    System.out.println("A");
    try {
      if (args.length != 1) {
        return;
      }
      System.out.println("B");
    } finally {
      System.out.println("C");
    }
    System.out.println("D");
  }

}
