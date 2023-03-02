/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author
 */
public class DN02test {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Napaka pri uporabi programa!");
    } else {
      String argumenti = " ";
      for (int i = 0; i < args.length; i++) {
        argumenti = argumenti + args[i] + " ";

      }

      argumenti = "*" + argumenti + "*";
      for (int i = 0; i < argumenti.length(); i++) {
        System.out.print("*");
      }
      System.out.println();
      System.out.println(argumenti);
      for (int i = 0; i < argumenti.length(); i++) {
        System.out.print("*");
      }
    }
  }
}
