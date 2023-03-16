package predavanje05;

/**
 *
 * @author tomaz
 */
public class Tabela {
  public static void main(String[] args) {
    // tovrstna inicializacija se lahko uporablja 
    // le v isti vrstico kot deklaracija
    int[] t = {1,2,3}; 
    
    int t1[];
    // to ne gre!
    //t1 = {4,5,6};
    
    // namesto tega uporabim:
    t1 = new int[] {4,5,6};
  }
}
