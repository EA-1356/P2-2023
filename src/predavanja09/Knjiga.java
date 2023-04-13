package predavanja09;

/**
 * Razred z atributi "avtor", "naslov", "letoIzdaje" ter metodami 
 * toString() ter izpisi(). Metoda getPodrobnosti v tem razredu je abstraktna
 * (zato mora biti tudi razred abstrakten).
 * 
 * @author tomaz
 */
abstract public class Knjiga extends Object {
  static int steviloKnjig = 0;
  
  private String avtor;
  private String naslov;
  private int letoIzdaje;
  
  int zaporednaStevilka;
  
  Knjiga(){}
  
  Knjiga(String avtor, String naslov, int letoIzdaje) {
    this.avtor = avtor;
    this.naslov = naslov;
    this.letoIzdaje = letoIzdaje;
    
    this.zaporednaStevilka = ++steviloKnjig;
  }
  
  public String getAvtor() {
    return this.avtor;
  }
  public void setAvtor(String avtor) {
    this.avtor = avtor;
  }
  public String getNaslov() {
    return naslov;
  }
  public void setNaslov(String naslov) {
    this.naslov = naslov;
  }
  public int getLetoIzdaje() {
    return letoIzdaje;
  }
  public void setLetoIzdaje(int letoIzdaje) {
    this.letoIzdaje = letoIzdaje;
  }
  
  public String toString() {
    return "Stevilka knjige: " + this.zaporednaStevilka;
  }

  abstract String getPodrobnosti();
  
  void izpisi() {
    System.out.println("Knjiga številka "+this.zaporednaStevilka);
    System.out.println("Avtor:  " + this.avtor);
    System.out.println("Naslov: " + this.naslov);
    System.out.println("Leto:   " + this.letoIzdaje);
    System.out.println(getPodrobnosti()); 
    System.out.println();
  }
  
}
