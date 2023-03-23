package si.fri.kodiranje.io;

/**
 * Testiranje delovanja metod za branje in pisanje.
 * 
 * @author tomaz
 */
public class TestBeriPisi {

  public static void main(String[] args) throws Exception {
    String vsebina = BeriPisi.preberiDatoteko("viri/veckratniki.txt");
    BeriPisi.zapisiVDatoteko("viri/v.txt", vsebina); 
  }
}
