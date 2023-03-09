package predavanje04;

import java.io.PrintWriter;

/**
 * Zapis podatkov v tekstovno datoteko: uporabim PrintWriter, 
 * ter metodi printf() in println(); na koncu ne smem pozabiti 
 * na obvezno zapiranje odprte datoteke (close()).
 * @author tomaz
 */
public class Veckratniki {
  public static void main(String[] args) throws Exception {
    int n = 7; // izpisujemo veckratnike stevila n
    int a=1;
    int b=10;  // 1*7, 2*7, ...., 10*7
    
    // povežem se z datoteko (datoteko "odprem") ...
    PrintWriter izhod = new PrintWriter("viri/veckratniki.txt");
    
    for(int i=a; i<=b; i=i+1) {
      //System.out.printf("%d * %d = %d\n", i, n, i*n);
      izhod.printf("%d * %d = %d\n", i, n, i*n);
    }
    
    // datoteko na koncu "zaprem".
    izhod.close();
  }
}
