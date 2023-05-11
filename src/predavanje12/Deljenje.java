package predavanje12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Igranje z izjemami
 * @author tomaz
 */
public class Deljenje {
  public static void test1() {
    int a = 5;
    
    try {
      // pri deljenju lahko pride do izjeme (ArithmeticException), 
      // zato sem dal ta ukaz v try-catch blok
      System.out.println(10/a);
      
      // tudi tu lahko pride do izjeme (FileNotFoundException)
      Scanner sc = new Scanner(new File("a.txt"));
      
    // vsako od izjem lahko obravnavam posebej 
    } catch (ArithmeticException e) {
      System.out.println("Deljenje ni mogoče");
    } catch (FileNotFoundException e) {
      System.out.println("Datoteke ne morem odpreti");
    }
  }

  // isto kot v metodi test1(), le da tu izjeme obravnavam 
  // samo v enem catch bloku
  public static void test2() {
    int a = 5;
    
    try {
      // pri deljenju lahko pride do izjeme, zato sem dal 
      // ta ukaz v try-catch blok
      System.out.println(10/a);
      
      // tudi tu lahko pride do izjeme
      Scanner sc = new Scanner(new File("a.txt"));
    } catch (Exception e) {  //
      System.out.println("Prislo je do napake: " + e.toString());
      
      // lahko ugotovim, katera izjema je sprožila catch blok
      if (e instanceof ArithmeticException)
        System.out.println("Deljenje!");
      else if (e instanceof FileNotFoundException)
        System.out.println("Datotaka!");
      
      System.out.println("Message: " + e.getMessage());
      
      // uporabim za izpis celotnega "poteka napake"
      e.printStackTrace();
    }
  }

  
}
