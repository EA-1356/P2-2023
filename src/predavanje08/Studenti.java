package predavanje08;

import java.util.Scanner;

/**
 * Datoteka vsebuje razreda Student in Studenti.
 * 
 * Razred Student vsebuje štiri atribute (ime, id, ocene in status)
 * ter metodi povprecje() in toString().
 * 
 * Razred Studenti vsebuje metode za testiranje uporabe in 
 * delovanja razreda Student.
 * 
 * @author tomaz
 */


class Student {
  static final int MAX_OCEN = 10;
  
  // atributi so privatni, za vse obstjajao getterji in setterji
  private String ime;   // ime studenta
  private String id;    // identifikacijska številka studenta
  
  private int stOcen;   // koliko ocen je ze zapisanih v tabeli
  private int[] ocene;  // tabela ocen
  
  private String status;  // ce povprecje >9 -> "Odlicen", sicer "Dober"
  
  /**
   * Konstruktor brez parametrov. Nastavim privzete vrednosti atributov.
   */
  Student() {
    this.ime = "?";
    this.id  = "?";
    
    this.stOcen = 0;
    this.ocene = new int[MAX_OCEN];
  }
  Student(String ime, String id) {
    // klic konstruktorja brez paremtrov
    this();
    
    this.ime = ime;
    this.id  = id;
  }  
  
  
  /*************** getterji / setterji za privatne atrubute ***********/
  public void şetIme(String ime) {
    this.ime = ime;
  }
  public String getIme() {
    return this.ime;
  }
  
  public void setId(String id) {
    this.id = id;
  }
  public String getId() {
    return this.id;
  }
  
  
  /**
   * Metoda vrne true, ce je v tabeli še prostor za 
   * ocene (se lahko dodajam), false sicer
  */
  boolean seProstorVTabeli() {
    return this.stOcen  < MAX_OCEN;
  }
  
  /**
   * Metoda doda oceno v tabelo ocen, poveca stevec stOcen
   * in posodobi status.
   * @return vrne true, če je dodajanje uspelo (če je bilo
   * še dovolj prostora) in false sicer
   */
  boolean dodajOceno(int ocena) {
    if (!seProstorVTabeli()) return false;
    
    this.ocene[stOcen++] = ocena;
    
    if (povprecje() > 9)
      this.status = "Odličen";
    else
      this.status = "Dober";
    
    return true;
  }
  
  /**
   * Izračun povprečja ocen v tabeli ocene.
   */
  double povprecje() {
    if (this.stOcen == 0) return 0;
    
    double vsota = 0;
    for (int i = 0; i < this.stOcen; i++) {
      vsota += this.ocene[i];
    }
    return vsota / this.stOcen;
  }

  /**
   * Znakovna (string) reprezentacija studenta.
   */
  public String toString() {
    return String.format("[Ime: %s, ID:%s, Pov.ocena: %.2f, Status: %s]", 
              this.ime, this.id, povprecje(), this.status);
  }
}

public class Studenti {
  
  static void studenti1() {
    String ime1, ime2, ime3;
    String id1, id2, id3;
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Vpisi ime: ");ime1 = sc.nextLine();
    System.out.print("Vpisi ID: "); id1 = sc.nextLine();
    System.out.print("Vpisi ime: ");ime2 = sc.nextLine();
    System.out.print("Vpisi ID: "); id2 = sc.nextLine();
    System.out.print("Vpisi ime: ");ime3 = sc.nextLine();
    System.out.print("Vpisi ID: "); id3 = sc.nextLine();
  }
  
  static void studenti2(int n) {
    String[] ime = new String[n];
    String[] id  = new String[n];
    
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      System.out.print("Vpisi ime: ");ime[i] = sc.nextLine();
      System.out.print("Vpisi ID: "); id[i]  = sc.nextLine();  
    }
  }  
  
static void studenti3(int n) {
    // ustvarim tabelo, v katero bom shranjeval studente
    Student[] studenti = new Student[n];
    
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      Student s = new Student();
      System.out.print("Vpisi ime: ");
      // s.ime = sc.nextLine(); // to ne gre, saj je ime privaten
      s.şetIme(sc.nextLine());
              
      System.out.print("Vpisi ID: "); 
      // s.id = sc.nextLine(); // to ne gre, saj je id privaten
      s.setId(sc.nextLine());
      
      studenti[i] = s;
    }
  }    

static void studenti4(int n) {
    // ustvarim tabelo, v katero bom shranjeval studente
    Student[] studenti = new Student[n];
    
    String ime, id;
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++) {     
      System.out.print("Vpisi ime: ");ime = sc.nextLine();
      System.out.print("Vpisi ID: "); id  = sc.nextLine();  
      
      Student s = new Student(ime, id);
      studenti[i] = s;
    }
  }    

static void student5() {
  Scanner sc = new Scanner(System.in);
  String ime, id;
 
  System.out.print("Vpisi ime: ");ime = sc.nextLine();
  System.out.print("Vpisi ID: "); id  = sc.nextLine();  
 
  Student s1 = new Student(ime, id);
  int ocena;
  do {
    ocena = sc.nextInt();
    if (ocena != 0) {
      s1.dodajOceno(ocena);
    }
  } while ((ocena != 0) && (s1.seProstorVTabeli()));
  
  
  System.out.println(s1.toString());  
}

  
  public static void main(String[] args) {   
    student5();
  }
}
