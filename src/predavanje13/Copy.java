package predavanje13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Trije načini kopiranja: bajt-po-bajtu (metoda kopiraj()), 
 * blok-po-bloku (metoda kopirajHitreje()) in blok-po-bloku z dodanim bufferjem
 * (metoda kopirajNajHitreje).
 * @author tomaz
 */
public class Copy {
  /**
   * Metoda prekopira prvo datoteko v drugo, če pride do napake, vrne false, true sicer.
   */
  static boolean kopiraj(String input, String output) {
    try {
      // odprte datoteke moram na koncu zapreti!
      FileInputStream  fis = new FileInputStream(new File(input)); 
      FileOutputStream fos = new FileOutputStream(new File(output));
      
      while(fis.available() > 0) {
        int z = fis.read();
        fos.write(z);
      } 
      
      fis.close();
      fos.close();
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  static boolean kopirajHitreje(String input, String output) {
    try {
      FileInputStream  fis = new FileInputStream(new File(input)); 
      FileOutputStream fos = new FileOutputStream(new File(output));
      
      byte[] buffer = new byte[4096];
      while(fis.available() > 0) {
        // preberem blok podatkov ...
        int n = fis.read(buffer);
        // ... in zapišem natančno toliko podatkov, kot sem jih prebral. 
        fos.write(buffer,0,n);
      } 
      
      fis.close();
      fos.close();
      return true;
    } catch (Exception e) {
      return false;
    }
  }
  
  static boolean kopirajNajHitreje(String input, String output) {
    try {
      FileInputStream  fis = new FileInputStream(new File(input));
      // dodam še BufferedInputStream, da dodatno pospešim branje
      BufferedInputStream bis = new BufferedInputStream(fis);
      
      FileOutputStream fos = new FileOutputStream(new File(output));
      // dodam še BufferedOutputStream, da dodatno pospešim pisanje
      BufferedOutputStream bos = new BufferedOutputStream(fos);
      
      
      byte[] buffer = new byte[4096];
      while(bis.available() > 0) {
        int n = bis.read(buffer);
        bos.write(buffer,0,n);
      } 
      
      bis.close();
      bos.close();
      return true;
    } catch (Exception e) {
      return false;
    }
  }
  
  public static void main(String[] args) {
    if (!kopirajNajHitreje("viri/medo.png", "viri/medo1.png")) 
      System.out.println("Napaka pri kopiranju");
    else
      System.out.println("OK");
  }
}
