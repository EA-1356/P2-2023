package predavanje11;

/**
 * Razred s tremi privatnimi atrubuti (kratica, glavnoMesto in prebivalci),
 * z getterji/setterji in primernim konstruktorjem. 
 
 * Dodana je tudo metoda toString za lepši izpis. 
 
 * @author tomaz
 */
public class Drzava {
  
  private String kratica;
  private String glavnoMesto;
  private long   prebivalci;

  public Drzava(String kratica, String glavnoMesto, long prebivalci) {
    this.kratica = kratica;
    this.glavnoMesto = glavnoMesto;
    this.prebivalci = prebivalci;
  }

  public String getKratica() {
    return kratica;
  }

  public void setKratica(String kratica) {
    this.kratica = kratica;
  }

  public String getGlavnoMesto() {
    return glavnoMesto;
  }

  public void setGlavnoMesto(String glavnoMesto) {
    this.glavnoMesto = glavnoMesto;
  }

  public long getPrebivalci() {
    return prebivalci;
  }

  public void setPrebivalci(long prebivalci) {
    this.prebivalci = prebivalci;
  }

  @Override
  public String toString() {
    return  String.format("Drzava: %s, Glavno mesto: %s, Število prebivalcev: %d",
               this.kratica, this.glavnoMesto, this.prebivalci);
  }
}
