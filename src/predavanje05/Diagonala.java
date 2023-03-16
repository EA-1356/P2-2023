package predavanje05;

/**
 * Program izračuna vsoto diagonale dvodimenzionalne matrike 
 * velikost n*n, v kateri so zapisana števila (po vrsti) 
 * 1, 2, 3, ..., n*n.
 * 
 * Program najprej naredi dvodimenzionalno tabelo, nato jo napolni
 * s števili in sešteje diagonalne elemente.
 * @author tomaz
 */
public class Diagonala {

  public static void main(String[] args) {
    int n = 4;  // tabela bo velikosti n*n
    
    // ustvarim tabelo ...
    int[][] t = new int[n][n];
    // .. in jo napolnim
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        t[i][j] = (i*n) + j + 1;
      }
    }
    
    // izpis tabele (za test pravilnosti)
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.printf("%3d", t[i][j]);
      }
      System.out.println();
    }
    
    int vsota = 0;
    // sestejem diagonalne elemente
    for (int i = 0; i < n; i++) {
      vsota += t[i][i];
    }
    System.out.println("Vsota diagonale: " + vsota);
  }
}
