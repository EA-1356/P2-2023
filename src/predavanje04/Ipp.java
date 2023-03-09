package predavanje04;

import java.util.Arrays;

/**
 * Uporaba i++, ++i, i=i+1 in i+1
 * @author tomaz
 */
public class Ipp {
  
  public static void main(String[] args) {
    int t[];
    int i=0;
    
    t = new int[]{1,2,3}; i=0;
    t[i++] = 5;
    System.out.printf("i=%d, t=%s\n", i, Arrays.toString(t)); // -> i=1, t=[5, 2, 3]
    
    t = new int[]{1,2,3}; i=0;
    t[++i] = 5;
    System.out.printf("i=%d, t=%s\n", i, Arrays.toString(t)); // -> i=1, t=[1, 5, 3]


    t = new int[]{1,2,3}; i=0;
    t[i=i+1] = 5;
    System.out.printf("i=%d, t=%s\n", i, Arrays.toString(t)); // -> i=1, t=[1, 5, 3]   
    
    t = new int[]{1,2,3}; i=0;
    t[i+1] = 5;
    System.out.printf("i=%d, t=%s\n", i, Arrays.toString(t)); // -> i=0, t=[1, 5, 3]   
    
  }

}
