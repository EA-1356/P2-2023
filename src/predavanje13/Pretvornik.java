package predavanje13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Pretvornik iz enega b drug kodirni sistem
 * 
 * @author tomaz
 */
public class Pretvornik {
  
  public static void main(String[] args) {
    String inputCharset  = "UTF-8";
    String outputCharset = "CP1250";
    
    String imeDatoteke = "viri/abc.txt";
    String imeIzhodne  = "viri/abcX.txt"; 
    
    try (
      FileInputStream fis = new FileInputStream(new File(imeDatoteke));
      InputStreamReader isr = new InputStreamReader(fis, inputCharset);
            
      FileOutputStream fos = new FileOutputStream(new File(imeIzhodne));
      OutputStreamWriter osw = new OutputStreamWriter(fos, outputCharset);
    ){
      while (isr.ready()) {
        int znak = isr.read();
        osw.write(znak); 
      }
    } catch (Exception e) {}
  }

}
