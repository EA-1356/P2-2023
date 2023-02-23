package predavanje01;

/**
 *
 * @author tomaz
 */
public class PrintfX {
  public static void main(String[] args) {
    int x = 42;
    // Izpis števila 42 v treh oblikah: kot desetiško, 
    // šestnajstiško (2 krat) in osmiško število
    System.out.printf("%d\n",x);
    System.out.printf("%x\n",x);
    System.out.printf("%X\n",x);
    System.out.printf("%o\n",x);
  }

}
