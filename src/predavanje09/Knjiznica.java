package predavanje09;

/**
 * Razred za testiranje razreda Knjiga in njegovih podrazredov.
 * 
 * @author tomaz
 */
public class Knjiznica {
  
  // V tej metodi vse naredimo "ročno" - uporabimo konstruktor brez
  // parametrov in nato vrednosti atributov nastavimo s pomocjo
  // getterjev / setterjev. 
  public static void test1() {
    Leposlovje l1 = new Leposlovje();
    l1.setAvtor("France Bevk");
    l1.setNaslov("Pestrna");
    l1.setLetoIzdaje(1939);
    l1.mnenja = new String[10];
    l1.stMnenj = 0;
    l1.mnenja[l1.stMnenj++] = "Zelo dobra knjiga";
    l1.mnenja[l1.stMnenj++] = "Ful brezveze";

    StrokovnaKnjiga s1 = new StrokovnaKnjiga();
    s1.setAvtor("Tim Lindholm");
    s1.setNaslov("The JVM Specification");
    s1.setLetoIzdaje(2012);
    s1.index = new String[10];
    s1.stIdx = 0;
    s1.index[s1.stIdx++] = "attributes:101";
    s1.index[s1.stIdx++] = "array:55";        
  }

  // Podobno kot v metodi test1() tudi tu ustvarim dva objekta - razlika
  // je v tem, da večino dela opravim s pomočjo konstruktorja.
  public static void test2() {
    Leposlovje l1 = new Leposlovje("France Bevk", "Pestrna", 1939);
    l1.dodajMnenje("Zelo dobra knjiga");
    l1.dodajMnenje("Ful brezveze");
    l1.izpisi();

    StrokovnaKnjiga s1 = new StrokovnaKnjiga("Tim Lindholm", "The JVM Specification", 2012);
    s1.dodajIndex("attributes:101");
    s1.dodajIndex("array:55");        
    s1.izpisi();
    
    // Ker je "zaporednaStevilka" (ne-statični) atribut, ima vsak objekt
    // svojo vrednost; atribut "steviloKnjig" pa je statičen,
    // zato je skupen vsem in ima eno samo vrednost za vse.
    System.out.println(l1.zaporednaStevilka);
    System.out.println(l1.steviloKnjig);
    System.out.println(s1.zaporednaStevilka);
    System.out.println(s1.steviloKnjig);    

    
    // Vse knjige lahko shranim v tabelo tipa Knjiga[] ...
    Knjiga[] knjige = new Knjiga[2];
    knjige[0] = l1;
    knjige[1] = s1;
    
    // ker je knjige[i] tipa Knjiga, lahko na njem kličem le metode, 
    // ki so definirane v razredu Knjiga; če želim klicati metode
    // podrazredov, moram najprej ugotoviti, katerega tipa je objekt
    // (uporabim operator instanceof), nato s "pretvorbo tipov" (typeCast)
    // prevajalniku povem, katerega tipa objekt dejansko je - potem lahko 
    // kličem metode tega tipa
    for (int i = 0; i < 2; i++) {
      if (knjige[i] instanceof StrokovnaKnjiga)
        ((StrokovnaKnjiga)knjige[i]).dodajIndex("beseda:x");
      else if (knjige[i] instanceof Leposlovje)
        ((Leposlovje)knjige[i]).dodajMnenje("Zanimivo!");
        
      knjige[i].izpisi();
    }
    
  }
  
 public static void test3() {   
    Leposlovje l1 = new Leposlovje("France Bevk", "Pestrna", 1939);
    l1.dodajMnenje("Zelo dobra knjiga");
    l1.dodajMnenje("Ful brezveze");
    l1.izpisi();  
    
    // pri izpisu objekta se kliče njegova metoda toString()
    System.out.println(l1);    
 }
  
  public static void main(String[] args) {
    test3();
  }
}
