package predavanje04;

/**
 *
 * @author tomaz
 */
public class TridelniVprasaj {
  public static void main(String[] args) {
    double t = 36.3;

//    if (t < 37) 
//      System.out.println("Si zdrav!");
//    else
//      System.out.println("Si bolan!");
    
    // namesto zgornjih štirih vrstic, lahko isto naredim v eni:
    System.out.println(t < 37 ? "Si zdrav" : "Si bolan");
  }
}
